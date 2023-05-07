package AbstractFactory.banking;

import AbstractFactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode(){
        System.out.println("Java разработчик пишет код для системы интернет банкинга...");
    }

}
