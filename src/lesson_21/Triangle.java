package lesson_21;

public class Triangle implements AutoCloseable{
    private double a, b, c;

    public Triangle(double a, double b, double c) throws BadTriangleSidesException {
        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalArgumentException("Side cannot be negative: " + a + " " + b + " " + c);
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new BadTriangleSidesException(a, b, c);
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getCircumference() {
        return a + b + c;
    }

    @Override
    public void close() throws Exception {

    }
}
