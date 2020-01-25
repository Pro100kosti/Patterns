package by.patterns.abstractFactory.projects;

import by.patterns.abstractFactory.Developer;
import by.patterns.abstractFactory.Manager;
import by.patterns.abstractFactory.ProjectTeamFactory;
import by.patterns.abstractFactory.Tester;
import by.patterns.abstractFactory.website.WebsiteTeamFactory;

public class SuperWebsiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        Manager manager = projectTeamFactory.getManager();

        System.out.println("Super website project creating...\n");
        developer.writeCode();
        tester.testCode();
        manager.manageProject();
    }
}
