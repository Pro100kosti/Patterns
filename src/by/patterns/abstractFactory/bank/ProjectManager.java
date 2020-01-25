package by.patterns.abstractFactory.bank;

import by.patterns.abstractFactory.Manager;

public class ProjectManager implements Manager {
    @Override
    public void manageProject() {
        System.out.println("Manager manage project...");
    }
}
