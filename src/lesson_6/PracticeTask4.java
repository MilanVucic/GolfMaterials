package lesson_6;

public class PracticeTask4 {
    // Write a program to reverse an array of integer values.

    public static void main(String[] args) {
        int[] numbers = {12, 4, 3, 5, 8, 6};
        // 1 2 3 4 5
        // 5 2 3 4 1
        // 5 4 3 2 1
        // How to swap the value of 2 variables:
        // a = 5;
        // b = 1;
        // temp = a; // 5
        // a = b; // 1
        // b = temp; // 5

        int lastArrayIndex = numbers.length - 1;
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[lastArrayIndex - i];
            numbers[lastArrayIndex - i] = temp;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
