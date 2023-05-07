package AbstractFactory.banking;

import AbstractFactory.Developer;
import AbstractFactory.ProjectManager;
import AbstractFactory.ProjectTeamFactory;
import AbstractFactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }
    @Override
    public Tester getTester(){
        return new QATester();
    }
    @Override
    public ProjectManager getProjectManager(){
        return new BankingPM();
    }

}
