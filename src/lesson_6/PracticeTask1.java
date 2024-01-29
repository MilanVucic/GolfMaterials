package lesson_6;

import java.util.Scanner;

public class PracticeTask1 {
    public static void main(String[] args) {
        // Write a program to calculate the sum and average value of array elements.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many numbers you want?");
        int length = scanner.nextInt();

        while (length < 0) {
            System.out.println("Please enter a value >= 0");
            length = scanner.nextInt();
        }

        int[] numbers = new int[length];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (1 + i) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("Sum :" + sum);
        if (numbers.length > 0) {
            System.out.println("Avg :" + 1.0 * sum / numbers.length);
        } else {
            System.out.println("Avg : 0");
        }
    }
}
