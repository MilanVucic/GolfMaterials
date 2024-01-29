package lesson_5;

import java.util.Scanner;

public class LastPrime {
    public static void main(String[] args) {
        // Write a program to find the last prime number that occurs before the entered number.
        // e.g. user enters 50, you print 47
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        int biggestPrime = -1;
        for (int potentialPrime = number - 1; potentialPrime >= 1; potentialPrime--) {
            boolean isPrime = true;
            for (int divider = 2; divider < potentialPrime / 2; divider++) {
                if (potentialPrime % divider == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                biggestPrime = potentialPrime;
                break;
            }
        }
        System.out.println(biggestPrime);
    }
}
