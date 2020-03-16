package by.patterns.factory;

public class PerlDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new PerlDeveloper();
    }
}
