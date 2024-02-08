package lesson_12;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        Circle circle2 = new Circle(0, 8, 1.9);
        Circle circle3 = new Circle(0, 8, 2.1);
        System.out.println(circle.fullyContains(circle2));
        System.out.println(circle.fullyContains(circle3));
    }

    private static void example() {
        Person person = new Person("Milan", 29);

        System.out.println(person.getName());
        person.setAge(-25);
        System.out.println(person.getAge());
        Person person2 = new Person("Milan", 29);
        String txt = "" + person2;
        System.out.println(person);
        System.out.println(txt);
    }
}
