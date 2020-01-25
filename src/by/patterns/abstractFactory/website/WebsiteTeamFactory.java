package by.patterns.abstractFactory.website;

import by.patterns.abstractFactory.Developer;
import by.patterns.abstractFactory.Manager;
import by.patterns.abstractFactory.ProjectTeamFactory;
import by.patterns.abstractFactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public Manager getManager() {
        return new PPManager();
    }
}
