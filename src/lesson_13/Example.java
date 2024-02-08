package lesson_13;

public class Example {
    static int c = 50;
    int a = 5;
    double b = 5.4;

    public static void sayHiStatic() {
        System.out.println("Static Hi" + c);
    }

    public void sayHiNonStatic() {
        c = 50;
        System.out.println(a);
        System.out.println("Non static hi");
    }

    public void nonStaticExample() {
        sayHiNonStatic();
    }
}
