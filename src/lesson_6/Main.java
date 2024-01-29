package lesson_6;

public class Main {

    // HW: Write a program to find the number of even and
    // odd integers in a given array of integers.

    public static void main(String[] args) {
        int[] array = new int[5]; // 1000, 1004, 1008, 1012, 1016
        array[0] = 100;
        array[1] = array[0] + 5;
        array[3] = array[2] - 5;
        System.out.println(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        String[] names = new String[4];
        names[0] = "Milan";
        names[1] = "Luca";
        names[3] = names[0] + names[2];

        int index = 0;
        while (index < names.length) {
            System.out.println(names[index++]);
        }

        // Fast array initialization

        String[] employees = {"Milan", "Marco", "Linda", "Luca"};
    }
}
