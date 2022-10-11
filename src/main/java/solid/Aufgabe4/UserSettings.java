package solid.Aufgabe4;

import java.awt.*;

public class UserSettings {

    //Welche Prinzipien verletzt der Code?
    //Wie besser?

    public void setBackgroundColor(Color color) {
        // Set background color
    }

    public void setFont(Font font) {
        // Set font
    }

    public boolean checkAccess(User user) {
        if (isUserLoggedIn(user)) {
            return true;
        }
        return false;
    }

    private boolean isUserLoggedIn(User user) {
        // Check if user is authenticated
        return false;
    }
}