package lesson_5;

import java.util.Scanner;

public class Stars {
    /*
     Additional HW: produce an output like this
     *XXXX
     **XXX
     ***XX
     ****X
     *****
     Just replace X with " " (space) and you'll get a nice triangle

         *
        **
       ***
      ****
     *****

     ******
     *****
     ***
     **
     *

      *
     ***
    *****
     ***
      *

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        // * X X X X , i = 0, j = 0...
        // X * X X X
        // X X * X X
        // X X X * X
        // X X X X *
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (i == j) {
                    System.out.print("*");
                } else {
                    System.out.print("X");
                }
            }
            if (i != number - 1) {
                System.out.println();
            }
        }
        System.out.println();
        System.out.println("-----------------------");
        // X X X X * , i = 0, j = 4
        // X X X * X , i = 1, j = 3
        // X X * X X , i = 2, j = 2
        // X * X X X , i = 3, j = 1
        // * X X X X , i = 4, j = 0
        for (int i = number - 1; i >= 0; i--) {
            for (int j = 0; j < number; j++) {
                if (i == j) {
                    System.out.print("*");
                } else {
                    System.out.print("X");
                }
            }
            System.out.println();
        }
        System.out.println("----------------");
        // Alternative solution
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (i + j == number - 1) {
                    System.out.print("*");
                } else {
                    System.out.print("X");
                }
            }
            System.out.println();
        }
    }
}
