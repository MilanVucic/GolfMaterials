package lesson_12;

public class Circle {
    private Point2D center;
    private double radius;

    public Circle(Point2D center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Circle(double radius) {
        this(new Point2D(), radius);
    }

    public Circle(double x, double y, double radius) {
        this(new Point2D(x, y), radius);
        // Is the same as code below
//        this.center = new Point2D(x, y);
//        this.radius = radius;

    }

    public double getArea() {
        // radius^2 * Pi
        return radius * radius * Math.PI;
    }

    public double getCircumference() {
        // 2 * radius * Pi
        return 2 * radius * Math.PI;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public boolean containsPoint(Point2D point) {
        double distance = this.center.distanceTo(point);
        return distance <= radius;
    }

    public boolean intersects(Circle other) {
        return intersects(this, other);
    }

    public static boolean intersects(Circle c1, Circle c2) {
        double distanceBetweenCenters = c1.center.distanceTo(c2.center);
        return distanceBetweenCenters < c1.radius + c2.radius;
    }

    public static void print(Circle circle) {
        System.out.println(circle);
    }

    public void print() {
        print(this);
    }

    public boolean fullyContains(Circle other) {
        double distanceBetweenCenters = this.center.distanceTo(other.center);
        return this.radius > other.radius + distanceBetweenCenters;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center:" + center +
                ", radius:" + radius +
                '}';
    }
}
