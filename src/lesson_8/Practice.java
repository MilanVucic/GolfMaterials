package lesson_8;

import java.util.Arrays;

public class Practice {

    // Additional HW:
    //  1. Write a method to insert an element (specific position) into an array.
    //  Example: 1 2 3 4  5, insert 10 at position 3
    //  Temp:    1 2 3 10 4 5

    // 2. Write a method to find the second largest element in an array.
    // Example: {1,2,3,2,0} returns 2
    // Example: {5,11,2,3,5,2,0,11} returns 5
    public static void main(String[] args) {
        int[] array = {1, -2, -3, 4, -5, -6, -10, 0, 0};

        int[] removedElement = removeElement(array, 2);
        System.out.println(Arrays.toString(removeElement(removedElement, 0)));
    }

    private static int[] removeElement(int[] array, int index) {
        int[] temp = new int[array.length - 1];
        for (int i = 0; i < array.length; i++) {
            if (i <= index) {
                temp[i] = array[i];
            } else {
                temp[i - 1] = array[i];
            }
        }

        return temp;
    }

    // Write a method to find all elements in the array
    // that are greater than the average.
    private static int[] getElementsAboveAvg(int[] numbers) {
        double avg = average(numbers);
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= avg) {
                counter++;
            }
        }
        int nextIndex = 0;
        int[] greaterThanAvg = new int[counter];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= avg) {
                greaterThanAvg[nextIndex++] = numbers[i];
            }
        }
        return greaterThanAvg;
    }

    // Returns the index of the element in the array if found, -1 if not
    private static int indexOf(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    private static double average(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }
}
