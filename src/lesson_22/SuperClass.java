package lesson_22;

public abstract class SuperClass {
    private int d;

    public SuperClass(int d) {
        this.d = d;
    }

    protected final void doStuff() {

    }

    protected abstract void doStuff2();
}
