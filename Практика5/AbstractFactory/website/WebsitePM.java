package AbstractFactory.website;

import AbstractFactory.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void managerProject() {
        System.out.println("Website PM управляет проектом веб-сайта...");


    }
}
