package lesson_5;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        // Write a program to find the sum of the digits of a given number.
        // e.g. 55748 = 29 (5+5+7+4+8)

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        // Hacky string solution
        String stringified = "" + number;
        int sum = 0;
        for (int i = 0; i < stringified.length(); i++) {
            char character = stringified.charAt(i);
            int digit = Integer.parseInt("" + character); // "5"
            sum += digit;
        }
        System.out.println(sum);

        // 55748 -> it's 8 and 5574
        // integer remainder + integer division
        // 57 -> separate into 5 and 7
        // 57 % 10 -> 7
        // 57 / 10 -> 5
        // 8573 % 10 -> 3
        // 8573 / 10 -> 857
        // 857 % 10 -> 7
        // 857 / 10 -> 85
        // 85 % 10 -> 5
        // 85 / 10 -> 8
        // 8 % 10 -> 8
        // 8 / 10 -> 0

        int sum2 = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            sum2 += lastDigit;
            number = number / 10;
        }
        System.out.println(sum2);
    }
}
