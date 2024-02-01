package lesson_11;

public class Dog {
    String name;
    int age;
    String ownerName;

    public void print() {
        System.out.println(String.format("Name: %s; age: %d; owner: %s", name, age, ownerName));
    }
}