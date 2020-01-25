package by.patterns.abstractFactory.bank;

import by.patterns.abstractFactory.Developer;
import by.patterns.abstractFactory.Manager;
import by.patterns.abstractFactory.ProjectTeamFactory;
import by.patterns.abstractFactory.Tester;

public class BunkTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public Manager getManager() {
        return new ProjectManager();
    }
}
