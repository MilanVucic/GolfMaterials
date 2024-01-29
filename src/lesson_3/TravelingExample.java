package lesson_3;

import java.util.Scanner;

public class TravelingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name:");
        String name = scanner.next();
        System.out.println("Are you from EU?");
        boolean isFromEU = scanner.nextBoolean();
        if (isFromEU) {
            System.out.println("Mr. " + name + ", you can enter.");
        } else {
            System.out.println("Where are you from?");
            String country = scanner.next();
            if (country.equalsIgnoreCase("Switzerland")
                    || country.equalsIgnoreCase("UK")
                    || country.equalsIgnoreCase("Turkey")) {
                System.out.println("You also can enter because you're from " + country);
            } else {
                System.out.println("How much money do you have?");
                double money = scanner.nextDouble();
                if (money > 500) {
                    System.out.println("You can enter, but we're watching you.");
                } else {
                    System.out.println("You cannot enter, sorry.");
                }
            }
        }
    }
}
