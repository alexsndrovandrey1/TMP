package AbstractFactory;

import AbstractFactory.banking.BankingTeamFactory;

public class MazeBankProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Создание системы интернет банкинга...");
        developer.writeCode();
        tester.testCode();
        projectManager.managerProject();

    }
}
