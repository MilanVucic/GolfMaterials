package lesson_4;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        int numb = 100;
        while (numb > 0) {
            System.out.println(numb);
            numb--;
            if (numb < 35) {
                break;
            }
        }

//        int a = 5;
//        do {
//            System.out.println("do while a = " + a);
//            a--;
//        } while (a > 100);
//
//        int b = 5;
//        while (b > 100) {
//            System.out.println("while b = " + b);
//            b--;
//        }

//        Scanner scanner = new Scanner(System.in);
//        // Print all the odd numbers less than num
//        int num = scanner.nextInt();
//        int current = 1;
//        while (current < num) {
//            if (current % 2 == 1) {
//                System.out.println(current);
//            }
//            current++;
//        }

//        int x = scanner.nextInt();
//        // Print first X even numbers (take X from the user)
//        int counter = 1;
//        while (counter <= x) {
//            System.out.println(counter * 2);
//            counter++;
//        }

//
//        System.out.println("Enter a number:");
//        int number = scanner.nextInt();
//        // Calculate the sum of first "number" of numbers
//        // E.g. user enters 5 -> we return 1+2+3+4+5 = 15
//
//        if (number >= 0) {
//            int currentNumber = 1;
//            int sum = 0;
//            while (currentNumber <= number) {
//                sum += currentNumber;
//                currentNumber++;
//            }
//            System.out.println("Sum = " + sum);
//        } else {
//            System.out.println("Cannot work with numbers < 0.");
//        }
    }
}
