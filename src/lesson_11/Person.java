package lesson_11;

public class Person {
    String name;
    int age;
    String email;

    public void print() {
        System.out.println(String.format("Name: %s; age: %d; email: %s", name, age, email));
    }
}
