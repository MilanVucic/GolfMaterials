package lesson_6;

public class PracticeTask3 {
    // Write a program to find the maximum and minimum value of an array.
    public static void main(String[] args) {
        int[] numbers = {-12, 4, -3};

        if (numbers.length > 0) {
            int max = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                int currentNumber = numbers[i];
                if (currentNumber > max) {
                    max = currentNumber;
                }
            }
            System.out.println("max = " + max);
        } else {
            System.out.println("No max");
        }

    }
}
