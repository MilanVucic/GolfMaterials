package lesson_20;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {

        } catch (ArrayIndexOutOfBoundsException | NumberFormatException | StringIndexOutOfBoundsException e) {
            System.out.println("Wrong input.");
            System.out.println(e.getMessage());
        }
    }

    private static void openFile() throws FileNotFoundException {
        File file = new File("asdasd");
        FileReader fileReader = new FileReader(file);

    }

    private static void anotherExample() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter an index:");
            int[] arr = {1, 2, 3};
            int index = scanner.nextInt();
            System.out.println(arr[index]);
            int stringIndex = scanner.nextInt();
            String a = "asdf";
            System.out.println(a.charAt(stringIndex));
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Executing finally.");
        }
        System.out.println("Goodbye");
    }

    private static void exceptionExample() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Enter your weight:");
                double weight = Double.parseDouble(scanner.nextLine());
                System.out.println("Enter your height:");
                double height = Double.parseDouble(scanner.nextLine());

                if (height < 0) {
                    throw new IllegalArgumentException("Height cannot be negative");
                }
                double bmi = weight / height / height;

                System.out.println("Enter a number between 0-2:");
                int index = Integer.parseInt(scanner.nextLine());
                int[] array = {1, 2, 3};
                System.out.println(array[index]);
                System.out.println("Your BMI is:" + bmi);
                break;
            } catch (NumberFormatException exception) {
                System.out.println("Wrong input...");
            } catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println("Wrong array index...");
            } catch (Exception e) {
                System.out.println("Something went wrong..." + e.getMessage());
            }
        }
        System.out.println("See ya...");
    }
}
