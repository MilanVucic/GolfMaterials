package lesson_22;

public class ChildClass extends SuperClass {
    public static final int A_DEFAULT = 10;
    private int a;

    public ChildClass(int a) {
        super(10);
        this.a = a;
    }

    public ChildClass() {
        this(A_DEFAULT);
    }

    @Override
    protected void doStuff2() {
        super.doStuff();
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public boolean equals(Object obj) {

        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString() + " a = " + a;
    }
}
