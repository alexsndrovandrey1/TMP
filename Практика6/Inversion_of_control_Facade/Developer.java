package Inversion_of_control_Facade;

public class Developer {
    public void doJodBeforDeadLine(BugTracker bugTracker){
        if(bugTracker.isActiveSprint()){
            System.out.println("Разработчик решает проблемы...");
        } else {
            System.out.println("Разработчик читает документацию...");
        }
    }
}
