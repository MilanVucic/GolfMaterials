package lesson_6;

import java.util.Scanner;

public class PracticeTask2 {
    public static void main(String[] args) {
        // a) Write a program to test if an array contains a specific value.
        // b) Write a program to find the index of an array element. (-1 if not found)
        int[] array = {1, 3, 3, 4, 5, 6, 7, 3};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        boolean found = false;
        int firstIndexOf = -1;
        for (int i = 0; i < array.length && !found; i++) {
            if (number == array[i]) {
                found = true;
                firstIndexOf = i;
            }
        }

        int lastIndexOf = -1;
        for (int i = array.length - 1; i >= 0; i--) {
            if (number == array[i]) {
                lastIndexOf = i;
                break;
            }
        }
        System.out.println(found);
        System.out.println(firstIndexOf);
        System.out.println(lastIndexOf);
    }
}
