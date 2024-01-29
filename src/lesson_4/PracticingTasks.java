package lesson_4;

import java.util.Scanner;

public class PracticingTasks {

    // Additional HW: Write a program to check whether a number is perfect or not.
    // Perfect = equal to the sum of all of its divisors.

    // Write a program to print Fibonacci series of n terms where n is input by user.
    // Fibonacci numbers: 1,1,2,3,5,8,13,21,34,55...z

    public static void main(String[] args) {
        // Write a program to find greatest common divisor (GCD) of given two numbers.
        // Example: 100 and 8 -> 4
        int num1 = 100;
        int num2 = 50;

        int min = num2 < num1 ? num2 : num1;

        int gcd2 = 1;
        for (int divider = min; divider >= 1; divider--) {
            if (num1 % divider == 0 && num2 % divider == 0) {
                gcd2 = divider;
                break;
            }
        }
        System.out.println(gcd2);

//        int gcd = 1;
//        for (int divider = 1; divider <= min; divider++) {
//            if (num1 % divider == 0 && num2 % divider == 0) {
//                gcd = divider;
//            }
//        }
//        System.out.println(gcd);

        // Write a program to check whether a number is prime or not.
        // Prime -> number is divisible only by 1 and itself
        // Prime numbers: 2, 3, 5, 7, 11, 13, 17...

//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            System.out.println("Enter a number to check if it's prime:");
//            int number = scanner.nextInt();
//
//            if (number <= 0) {
//                break;
//            }
//
//            boolean isPrime = true; // 999
//
//            for (int divider = 2; divider < number / 2; divider++) {
//                if (number % divider == 0) {
//                    System.out.println("Divisible by: " + divider);
//                    isPrime = false;
//                    break;
//                }
//            }
//            System.out.println(isPrime);
//        }
    }
}
