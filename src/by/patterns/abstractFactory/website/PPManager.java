package by.patterns.abstractFactory.website;

import by.patterns.abstractFactory.Manager;

public class PPManager implements Manager {
    @Override
    public void manageProject() {
        System.out.println("PP manager manage this project...");
    }
}
