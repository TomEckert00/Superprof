package mvc.aufgabe;

import javax.swing.*;
import java.awt.*;

public class View extends JFrame{
    private Controller controller;
    private final JButton startButton = new JButton("Start");
    private final JButton door = new JButton();
    private JButton tube = new JButton();
    private final JButton lamp = new JButton();
    private Timer timer;

    public View(Controller controller)
    {
        this.controller = controller;

        setTitle("Mikrowellenofen");
        setVisible(true);
        setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);

        initComponents();
        pack();
    }

    private void initComponents()
    {
        door.setIcon(new ImageIcon("closed.gif"));
        tube.setBackground(Color.GREEN);
        tube.setText("R ö h r e");
        lamp.setText("L a m p e");
        add(createOvenPanel());
    }

    private Component createOvenPanel()
    {
        JPanel subPanel = new JPanel(new GridLayout(3, 1));
        JPanel mainPanel = new JPanel(new GridLayout(2, 1));
        subPanel.add(startButton);
        subPanel.add(tube);
        subPanel.add(lamp);
        mainPanel.add(subPanel);
        mainPanel.add(door);

        startButton.addActionListener(e -> controller.handleButtonAction(false, true, true));

        door.addActionListener(e -> controller.handleButtonAction(true, true, false));

        controller.handleTimer();

        return mainPanel;
    }

    public void update(Model model)
    {
        if (model.getLampOn())
        {
            lamp.setBackground(Color.YELLOW);
        }
        else
        {
            lamp.setBackground(Color.WHITE);
        }

        if(model.getDoorOpen())
        {
            door.setIcon(new ImageIcon("open.gif"));
            tube.setBackground(Color.GREEN);
            model.setDoorOpen(true);
            model.setTimer(false);
            controller.changeTimer();
        }
        else
        {
            door.setIcon(new ImageIcon("closed.gif"));
            model.setDoorOpen(false);
        }

        if (model.getActive())
        {
            tube.setBackground(Color.RED);
            model.setTimer(true);
            controller.changeTimer();
        }
        else
        {
            tube.setBackground(Color.GREEN);
        }
    }
}
