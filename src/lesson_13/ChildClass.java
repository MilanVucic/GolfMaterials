package lesson_13;

public class ChildClass extends ParentClass {
    private static int c;
    private int d;

    static {
        c = 50012;
        System.out.println("ChildClass static init block");
    }

    {
        d = 230123;
        System.out.println("ChildClass non static init block");
    }

    public ChildClass() {
        System.out.println("ChildClass constructor");
    }
}
