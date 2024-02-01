package lesson_11;

import java.util.Arrays;

public class Student extends Person {
    int[] grades;

    public void print() {
        super.print();
        System.out.println(Arrays.toString(grades));
    }
}
