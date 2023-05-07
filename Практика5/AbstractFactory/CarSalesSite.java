package AbstractFactory;

import AbstractFactory.website.WebsiteTeamFactory;

public class CarSalesSite {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Создание веб-сайта по продаже автомобилей...");
        developer.writeCode();
        tester.testCode();
        projectManager.managerProject();

    }

}
