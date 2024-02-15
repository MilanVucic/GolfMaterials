package lesson_15;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(2);

        System.out.println(arrayList.contains(20));
        System.out.println(arrayList.indexOf(20));

        int[] numbers = new int[]{1, 2, 3, 4, 5, 6};

    }

    private ArrayList<Integer> higherThanAvg(int[] array) {
        ArrayList<Integer> list = new ArrayList<>();
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double avg = sum / array.length;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > avg) {
                list.add(array[i]);
            }
        }
        return list;
    }
}
