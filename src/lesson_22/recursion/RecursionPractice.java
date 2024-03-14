package lesson_22.recursion;

public class RecursionPractice {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(83884));
    }

    private static int sumOfDigits(int number) {
        // 83884 -> 4 + sumOfDigits(8838)
        // ...
        // 8 -> 8 + sumOfDigits(0)
        if (number == 0) {
            return 0;
        }
        return number % 10 + sumOfDigits(number / 10);
    }

    private static int fibonacci(int number) {
        if (number <= 2) {
            return 1;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }
    // sum (1) = 1 + sum(0) = 1
    // sum (2) = 2 + sum(1) = 3
    // sum (3) = 3 + sum(2) = 6
    // ....
    // sum (10) = 10 + sum(9) = 10 + 45 = 55

    private static int getSumOfFirstN(int number) {
        if (number <= 0) {
            return 0;
        }

        return number + getSumOfFirstN(number - 1);
    }

    private static void printNumber(int n) {
        if (n <= 0) {
            return;
        }
        System.out.println(n);
        printNumber(n - 1);
    }
}
