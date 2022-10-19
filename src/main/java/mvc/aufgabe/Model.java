package mvc.aufgabe;

public class Model {

    private boolean isDoorOpen = false;
    private boolean isLampOn = false;
    private boolean active = false;
    private boolean isTimerOn = false;

    public boolean getDoorOpen() {
        return isDoorOpen;
    }

    public void setDoorOpen(boolean isDoorOpen) {
        this.isDoorOpen = isDoorOpen;
    }

    public boolean getLampOn() {
        return isLampOn;
    }

    public void setLampOn(boolean isLampOn) {
        this.isLampOn = isLampOn;
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean getTimer() {
        return isTimerOn;
    }

    public void setTimer(boolean isTimerOn) {
        this.isTimerOn = isTimerOn;
    }

}
