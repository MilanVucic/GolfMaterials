package lesson_9;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String example = "          \nabccccddc   ";
        String changed = example.replace('c', 'x');
        String changed2 = example.replace("ab", "milan ");
        System.out.println(changed2);
        System.out.println(changed);
        System.out.println(example);
        System.out.println(example.trim());
    }

    private static void extractName() {
        String message = "Hello there: Alexander, This is a message for you.";
        int nameStartPosition = message.indexOf(':') + 2;
        int nameEndPosition = message.indexOf(',');
        String name = message.substring(nameStartPosition, nameEndPosition);
        System.out.println(name);
    }

    private static void basicStringStuff() {
        String input = "                    \n\t";
        System.out.println(input.length());
        System.out.println(input.isEmpty());
        System.out.println(input.isBlank());
        String name = "Milan";
        System.out.println(name.charAt(3));
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
        char[] letters = name.toCharArray();

        letters[2] = 's';
        System.out.println(Arrays.toString(letters));

        String sentence = "It is a really nice day";

        String a1 = "abcdx";

        System.out.println(a1.lastIndexOf("db"));
    }

    private static String getLongestWordInString(String sentence) {
        String[] words = sentence.split(" ");
        int maxLength = -1;
        String result = null;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > maxLength) {
                result = words[i];
                maxLength = result.length();
            }
        }
        return result;
    }
}
