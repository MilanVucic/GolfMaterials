package lesson_13;

import lesson_12.Circle;

import java.util.Scanner;

public class Main {

    public static final int MIN_NAME_LENGTH = 4;

    public static void main(String[] args) {
        Circle circle = new Circle(10);
        Circle circle2 = new Circle(0, 8, 1.9);
        Circle circle3 = new Circle(0, 8, 2.1);

        System.out.println(Circle.intersects(circle2, circle3));
        System.out.println(circle3.intersects(circle2));
    }

    private static void staticMoreExamples() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        if (name.length() < MIN_NAME_LENGTH) {
            System.out.println("Name too short");
        }
        System.out.println("Enter your password:");
        String password = scanner.nextLine();
        if (PasswordValidator.isPasswordValid(password)) {
            System.out.println("Valid.");
        } else {
            System.out.println("Invalid pass..");
        }
        System.out.println("Enter a price:");
        double price = scanner.nextDouble();
        String priceFormatted = FormatterUtil.formatPrice(price);
        System.out.println(priceFormatted);
    }


    private static void carsExample() {
        Car car = new Car("BMW", "520d");
        Car car2 = new Car("BMW", "320d");
        Car car3 = new Car("Audi", "A3");
        Car car4 = new Car("Mercedes", "E220");

        System.out.println(car);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
    }

    public void doSomething() {
        Example example = new Example();
        example.b = 500;
        example.a = 500;
        Example example2 = new Example();
        example2.b = 300;
        example2.a = 200;
        Example.c = 5000;
        System.out.println(Example.c);
        example2.sayHiStatic();
        Main m = new Main();
        m.doSomething();

        OuterClass.InnerStaticClass a = new OuterClass.InnerStaticClass();
        OuterClass oc = new OuterClass();
        OuterClass.InnerNonStaticClass b = oc.new InnerNonStaticClass();
    }
}
