package lesson_21;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in); FileReader fileReader = new FileReader("asdsad")) {

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void method2() {
        method3();
    }

    private static void method3() {
        method4();
    }

    private static void method4() {

    }

    private static void method1() {

    }

    private static void createATriangle() {
        try {
            Triangle t = new Triangle(1, 4, 4);
            System.out.println(t.getCircumference());
            String name = "milan";
            System.out.println(name.charAt(10));

        } catch (BadTriangleSidesException exception) {
            System.out.println(Arrays.toString(exception.getStackTrace()));
        }
    }
}
