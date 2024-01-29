package lesson_4;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i % 5 == 0) {
                continue;
            }
            System.out.println(i);
        }

//        for (int i = 0; i < 50; i++) {
//            System.out.println("i = " + i);
//            if (i == 25) {
//                break;
//            }
//        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int num = scanner.nextInt();
//
//        int sum = 0;
//        for (int counter = 1; counter <= num; counter++) {
//            sum += counter;
//        }
//
//        System.out.println("Sum = " + sum);
    }
}
