package by.patterns.abstractFactory.website;

import by.patterns.abstractFactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester testing php code...");
    }
}
