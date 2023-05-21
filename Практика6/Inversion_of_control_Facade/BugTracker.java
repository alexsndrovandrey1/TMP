package Inversion_of_control_Facade;

public class BugTracker {
    private boolean activeSprint;

    public boolean isActiveSprint(){
        return activeSprint;
    }
    public void startSprint(){
        System.out.println("Sprint активен.");
        activeSprint = true;
    }
    public void finishSprint(){
        System.out.println("Sprint не активен.");
        activeSprint = false;
    }
}
