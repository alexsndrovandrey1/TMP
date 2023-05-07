package AbstractFactory.website;

import AbstractFactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode(){
        System.out.println("Manual тестер тестирует веб-сайт...");
    }
}
