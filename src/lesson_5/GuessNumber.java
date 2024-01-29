package lesson_5;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        // Write a program that generates a random number
        // and asks the user to guess what the number is

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        // 1 + (0 <-> 99) = 1 <-> 100
        int randomNumber = 1 + rand.nextInt(100);

        int numOfAttempts = 0;
        int lives = 5;
        // Additional HW: add bounds in the user's message when he makes a mistake
        // For example, number is 55, user guesses 50, you write "50-100",
        // Next, he tries 75, you write "50-75" instead of just "too high"
        while (true) {
            System.out.println("Enter your guess:");
            int guess = scanner.nextInt();
            numOfAttempts++;
            if (guess == randomNumber) {
                System.out.println("Correct, congrats!");
                System.out.println("It took you " + numOfAttempts + " attempts.");
                break;
            }
            lives--;
            if (lives < 1) {
                System.out.println("You ran out of lives, sorry." +
                        " Correct number was: " + randomNumber);
                break;
            }

            System.out.println("Lives remaining: " + lives);
            if (guess > randomNumber) {
                System.out.println("Guess too high.");
            } else {
                System.out.println("Guess too low.");
            }
        }
    }
}
