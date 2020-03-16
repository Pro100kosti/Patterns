package by.patterns.factory;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите специализацию разработчика (java, c++, perl или php)");
        String specialty = scanner.nextLine();
        DeveloperFactory developerFactory = createDeveloperBySpecialty(specialty);
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();
        developer.writeCode();
        developer.writeCode();
        developer.writeCode();
        developer.writeCode();
        developer.writeCode();
    }

    static DeveloperFactory createDeveloperBySpecialty(String specialty) {
        if (specialty.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("c++")){
            return new CppDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("php")){
            return new PhpDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("perl")){
            return new PerlDeveloperFactory();
        } else {
            throw  new RuntimeException(specialty + " this unknown specialty");
        }
    }
}
