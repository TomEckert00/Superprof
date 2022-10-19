package mvc.aufgabe;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    private Model model;
    private View view;

    private Timer timer;

    public Controller()
    {
        model = new Model();
        view = new View(this);
    }

    public void handleButtonAction(boolean isDoorOpen, boolean isLampOn, boolean active)
    {
        model.setDoorOpen(isDoorOpen);
        model.setLampOn(isLampOn);
        model.setActive(active);
        view.update(model);
    }

    public void handleTimer()
    {
        timer = new Timer(6000, e -> handleButtonAction(false, false, false));
    }

    public void changeTimer()
    {
        if (model.getTimer())
        {
            timer.start();
        }
        else
        {
            timer.stop();
        }
    }
}
