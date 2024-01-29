package lesson_8;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 500;
        doSomething(a);

    }

    private static void doSomething(double value) {
        int a = 300;
        if (value > 50) {
            double multiplier = 1.2;
            value *= multiplier;
        }
        System.out.println(value);
    }

    private static void longerNameExample() {
        String name = "milan";
        int length = name.length();
        String name2 = "Alexander";
        int length2 = name2.length();
        int longerNameLength = max(length, length2);
        System.out.println(longerNameLength);
        System.out.println(getLongerName(null, name2));
    }

    private static String getLongerName(String name, String name2) {
        if (name.length() > name2.length()) {
            return name;
        }
        return name2;
    }

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    private static void passByValue() {
        // Pass-by-value vs pass-by-reference
        int a = 50;
        change(a);
        System.out.println(a);
        int[] arr = {1, 2, 3, 4}; // 10500
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void change(int[] arr) {
        arr[0] = 100;
    }

    private static void change(int a) {
        a = 500;
    }

    private static void showBasicInfoExample() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        helloThere(name, age);
    }

    protected static void helloThere(String name, int age) {
        if (name == null) {
            System.out.println("Invalid name.");
            return;
        }
        System.out.println("Hello");
        System.out.println("There");
        System.out.println(name);
        System.out.println(age);
    }
}
