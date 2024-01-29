package lesson_7;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HangmanGame {
//    Write a program to play the Hangman game - guessing a hidden word.
    // Hidden word is: mathematics
    // ma___ma____

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] potentialWords = {"mathematics", "astronomy", "physics", "apple", "monitor"};
        Random rand = new Random();
        while (true) {
            int wordIndex = rand.nextInt(potentialWords.length);
            String word = potentialWords[wordIndex];
            char[] wordLetters = word.toCharArray();
            // m, a, t, h, e, m, a, t, i, c, s
            // F, F, T, F, F, F, F, T, F, F, F
            boolean[] guessed = new boolean[wordLetters.length];
            int lives = 5;
            while (true) {
                System.out.println("Enter your guess:");
                String userInput = scanner.next();
                // Take the first char of the user's input, ignore longer input
                char userGuess = userInput.charAt(0);

                // Update the letter guessed indicators
                boolean guessedThisLetter = false;
                for (int i = 0; i < wordLetters.length; i++) {
                    if (userGuess == wordLetters[i]) {
                        guessed[i] = true;
                        guessedThisLetter = true;
                    }
                }

                // Take away a life if the current letter was nowhere to be found
                // And end the game prematurely if no lives are left
                if (!guessedThisLetter) {
                    lives--;
                    System.out.println("You have " + lives + " lives left.");
                    if (lives == 0) {
                        System.out.println("You lost.");
                        break;
                    }
                }

                // Display the word
                for (int i = 0; i < wordLetters.length; i++) {
                    if (guessed[i]) {
                        System.out.print(wordLetters[i] + " ");
                    } else {
                        System.out.print("_ ");
                    }
                }
                System.out.println();

                // Checking for game won status
                boolean gameOver = true;
                for (int i = 0; i < guessed.length; i++) {
                    if (!guessed[i]) {
                        gameOver = false;
                        break;
                    }
                }
                if (gameOver) {
                    System.out.println("Congrats! You won.");
                    break;
                }
            }

            System.out.println("Do you want to keep playing? yes/no");
            String input = scanner.next();
            if (!input.equalsIgnoreCase("yes")) {
                break;
            }
        }
    }
}
