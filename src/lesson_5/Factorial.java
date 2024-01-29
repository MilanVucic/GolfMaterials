package lesson_5;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
//         Calculate the factorial of a number -> 5! = 5 * 4 * 3 * 2 * 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        if (number > 0) {
            int product = 1;
            for (int i = number; i >= 2; i--) { // int i = 2; i <= number; i++ alternative way
                product *= i; // product = product * i;
            }
            System.out.println(product);
        } else {
            System.out.println("Number must be positive");
        }
    }
}
