package AbstractFactory.website;

import AbstractFactory.Developer;
import AbstractFactory.ProjectManager;
import AbstractFactory.ProjectTeamFactory;
import AbstractFactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper(){
        return new PhpDeveloper();
    }
    @Override
    public Tester getTester(){
        return new ManualTester();
    }
    @Override
    public ProjectManager getProjectManager(){
        return new WebsitePM();
    }

}
