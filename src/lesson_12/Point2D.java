package lesson_12;

public class Point2D {
    private double x;
    private double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {

    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distanceTo(Point2D other) {
        // c^2 = a^2 + b^2
        // c = sqrt(a^2 + b^2)
        double a = this.x - other.x; // 3 - 7 = -4
        double b = this.y - other.y;
        return Math.sqrt(a * a + b * b);
    }

    @Override
    public String toString() {
        return "(" + x +
                ", " + y + ")";
    }
}
