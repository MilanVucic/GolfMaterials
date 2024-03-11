package lesson_21;

public class BadTriangleSidesException extends Exception {
    private double a, b, c;

    public BadTriangleSidesException(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle with sides : " + a + " " + b + " " + c + " cannot exist.";
    }
}
