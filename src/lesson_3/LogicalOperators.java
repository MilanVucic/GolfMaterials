package lesson_3;

import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        // AND -> X AND Y -> BOTH X AND Y == true
        // OR -> X OR Y -> EITHER OF THEM needs to be true
        // Table for AND
        // T ^ T -> T
        // T ^ F -> F
        // F ^ T -> F
        // F ^ F -> F
        // Table for OR
        // T v T -> T
        // T v F -> T
        // F v T -> T
        // F v F -> F

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age <= 65 && age >= 18) {
            System.out.println("You can work");
        } else {
            System.out.println("You cannot.");
        }

        int a = 50;
        int b = a > 10 ? a + 5 : 50;
        // The same code as the line above
        if (a > 10) {
            b = a + 5;
        } else {
            b = 50;
        }
    }
}
