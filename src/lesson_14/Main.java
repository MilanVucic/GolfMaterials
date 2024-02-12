package lesson_14;

import lesson_13.ChildClass;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        System.out.println(list.getSize());
        list.add("Milan");
        list.add("Luca");
        list.add("Marco");
        System.out.println(list);

        System.out.println(list.get(2));
        System.out.println(list.get(0));
        System.out.println(list.getSize());
        list.add("asdasd");
        System.out.println(list.getSize());
    }

    private static void myArrayExample() {
        String[] names = new String[]{"Nicola", "Milan", "Marco", "Max", "Ben", "Lucia", "Emily"};
        String[] namesStartingWithM = getNamesStartingWith(names, "Ma");
        System.out.println(Arrays.toString(namesStartingWithM));
        System.out.println(getNamesStartingWithMyArray(names, "Ma"));

        MyArray<String> myArray = new MyArray<>();
        myArray.add("Milan");
        myArray.add("Marco");
        MyArray<Integer> myArray2 = new MyArray<>();
        myArray2.add(5);
        myArray2.add(10);
        myArray2.add(15);
        MyArray<Double> doubleMyArray = new MyArray<>();
        doubleMyArray.add(1.5);
        doubleMyArray.add(1.3);
    }

    private static MyArray<String> getNamesStartingWithMyArray(String[] names, String start) {
        MyArray<String> result  = new MyArray<>();
        for (int i = 0; i < names.length; i++) {
            if (names[i].toUpperCase().startsWith(start.toUpperCase())) {
                result.add(names[i]);
            }
        }
        return result;
    }
    private static String[] getNamesStartingWith(String[] names, String start) {
        int counter = 0;
        for (int i = 0; i < names.length; i++) {
            if (names[i].toUpperCase().startsWith(start.toUpperCase())) {
                counter++;
            }
        }
        String[] results = new String[counter];
        counter = 0;
        for (int i = 0; i < names.length; i++) {
            if (names[i].toUpperCase().startsWith(start.toUpperCase())) {
                results[counter++] = names[i];
            }
        }
        return results;
    }

    private static void gcAndClassExample() {
        int a = 50;
        if (a > 50) {
            int c = 100;
            doStuff(a, c);
        }

        System.out.println();
        int[] array = new int[8];
        array[4] = 50;
        int[] temp = new int [array.length + 2];
        // x x x x arr arr arr arr 50 arr arr arr x x x x

        Class c = ChildClass.class;
        System.out.println(c.getSimpleName());
        System.out.println(c.getName());
        System.out.println(c.getCanonicalName());
    }

    public static void doStuff(int a, int b) {
        int counter = 0;
    }
}
