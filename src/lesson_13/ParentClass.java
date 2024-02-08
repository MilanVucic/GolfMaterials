package lesson_13;

public class ParentClass {
    private static int a;
    private int b;

    static {
        a = 500;
        System.out.println("ParentClass static init block");
    }

    {
        b = 200;
        System.out.println("ParentClass non static init block");
    }

    public ParentClass() {
        System.out.println("ParentClass constructor");
    }
}
