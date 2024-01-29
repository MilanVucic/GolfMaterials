package lesson_9;

import java.util.Arrays;

public class Practicing {
    // Additional HW:
//    Reverse the words in a given string.

    // In a given array of Strings, find the longest common prefix.
    // {apple, application, ape} -> return "ap"
    // {apple, application, ape, adam} -> return "a"
    // {apple, application, appliance} -> return "appl"

    public static void main(String[] args) {
        System.out.println(getMostCommonLetter("mrrDDDDmasdasddddasrerrrrM"));
    }

    // Find and return the most common letter in a given string.

    private static char getMostCommonLetter(String word) {
        word = word.toLowerCase();
        int[] letterCounter = new int[26];
        // [0,1,3,1...,5]
        // a = 0, b = 1, c = 2, .. z = 5
        for (int i = 0; i < word.length(); i++) {
            char current = word.charAt(i);
            if (current >= 'a' && current <= 'z') {
                int letterIndex = current - 'a';
                letterCounter[letterIndex]++;
            }
        }
        int max = -1;
        int maxIndex = -1;
        for (int i = 0; i < letterCounter.length; i++) {
            if (letterCounter[i] > max) {
                max = letterCounter[i];
                maxIndex = i;
            }
        }
        return (char)('a' + maxIndex);
    }
    private static int countMs(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'm' || word.charAt(i) == 'M') {
                count++;
            }
        }
        return count;
    }

    //
    // Count the number of uppercase letters in a given string ignoring non alphabetical characters.
    private static int countUppercase(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            char currentLetter = word.charAt(i);
            String stringifiedLetter = "" + currentLetter;
            if (stringifiedLetter.toUpperCase().equals("" + currentLetter)) {
                count++;
            }
        }

        return count;
    }

    private static int countUppercaseVersion2(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            char currentLetter = word.charAt(i);
            if (currentLetter >= 'A' && currentLetter <= 'Z') {
                count++;
            }
        }

        return count;
    }


    // Check if a string is a palindrome
    // abb c bba - true, abc - false
    private static boolean isPalindrome(String word) {
        if (word == null) {
            return false;
        }
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        return reversed.equals(word);
    }

    // aabfbaa
    private static boolean isPalindromeVersion2(String word) {
        for (int i = 0; i < word.length() / 2; i++) {
            char first = word.charAt(i);
            char last = word.charAt(word.length() - 1 - i);
            if (first != last) {
                return false;
            }
        }
        return true;
    }
}
