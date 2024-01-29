package lesson_10;

import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        // base 10 = decimal
        // digits: 0,1,2,3,4,5,6,7,8,9
        // 5804 = 5 * 1000 + 8 * 100 + 0 * 10 + 4 * 1 = 5 * 10^3 + 8 * 10^2 + 0 * 10^1 + 4 * 10^0
        // 3210

        // base 2 = binary numeral system
        // 0,1
        // 1010 = 1 * 2^3 + 0 * 2^2 + 1 * 2^1 + 0 * 2^0 = 8 + 0 + 2 + 0 = 10
        // 3210

        // 111001 = 2^5 + 2^4 + 2^3 + 2^0 = 32 + 16 + 8 + 1 = 57
        // 543210

        // 57 -> 1 (32)
        // 57-32 = 25 -> 1 (16)
        // 25-16 = 9 -> 1 (8)
        // 9-8 = 1 -> 0 (4)
        // 1 -> 0 (2)
        // 1 -> 1 (1)
        // 0

        // base 16 = hexadecimal
        // digits: 0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F
        // 5F1 = 5 * 16 ^ 2 + 15 * 16^1 + 1 * 16^0 = 5 * 256 + 240 + 1
        // 210

        char c = 0x48;
        System.out.println(c);

        String sentence = "this is a sentence which has words.";
        StringTokenizer stringTokenizer = new StringTokenizer(sentence, " ");

        StringBuilder endResult = new StringBuilder(); // milan, luca, lucia
        while (stringTokenizer.hasMoreTokens()) {
            endResult.append(stringTokenizer.nextToken());
        }
        endResult.delete(5, 10);
        System.out.println(endResult);

        String name = "Milan";
        int age = 29;
        double height = 184.4356;

        System.out.println("Hi there:" + name + ". You are " + age + " years old. You are " + height + " cm tall.");
        System.out.println(String.format("Hi there:%s. You are %d years old. You are %.2f cm tall.", name, age, height));
    }
}
