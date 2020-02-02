package by.patterns.builder;

import java.util.Scanner;

public class CreateNewWebsite {
    public static void main(String[] args) {
        Director director = new Director();
        Website website;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What site do you want to do?");

        while (true){
            System.out.println("1 - Easy web site\n2 - Medium web site\n3 - Hard web site");
            switch (scanner.next()){
                case ("1"):
                    director.setBuilder(new EasyWebsite());
                    website = director.buildWebsite();
                    System.out.println(website);
                    return;
                case ("2"):
                    director.setBuilder(new MediumWebsite());
                    website = director.buildWebsite();
                    System.out.println(website);
                    return;
                case ("3"):
                    director.setBuilder(new HardWebsite());
                    website = director.buildWebsite();
                    System.out.println(website);
                    return;
                default:
                    System.out.println("\nYou mast select 1, 2 or 3 option");
                    break;
            }
        }

    }
}
