package AbstractFactory.banking;

import AbstractFactory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void managerProject(){
        System.out.println("Banking PM управляет проектом системы интернет банкинга...");
    }
}
