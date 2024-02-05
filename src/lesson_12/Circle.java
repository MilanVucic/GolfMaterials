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
        double distanceBetweenCenters = this.center.distanceTo(other.center);
        return distanceBetweenCenters < this.radius + other.radius;
    }

    public boolean fullyContains(Circle other) {
        return false;
        // todo finish the method
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center:" + center +
                ", radius:" + radius +
                '}';
    }
}
