package by.patterns.abstractFactory.bank;

import by.patterns.abstractFactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes java code...");
    }
}
