package lesson_3;

import java.util.Scanner;

public class IfExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.next();
        System.out.println("Enter your age:");
        int age = scanner.nextInt();

        if (name.length() < 2) {
            System.out.println("Sorry, that's not a proper name.");
        } else {
            System.out.println("Hi " + name);
        }
        boolean isAnAdult = age >= 18;
        if (isAnAdult) {
            System.out.println("Congrats. You can enter");
        } else {
            System.out.println("Sorry. You cannot enter");
        }

//        Scanner scanner = new Scanner(System.in);
//        int age = scanner.nextInt();
//
//        if (age > 65) {
//            System.out.println("You can go to retirement.");
//        } else if (age > 24) {
//            System.out.println("You can go to work.");
//        } else if (age > 19){
//            System.out.println("You should go to college.");
//        } else {
//            System.out.println("You should go to school.");
//        }


    }
}
