package lesson_12;

public class Person extends Object{
    private String name;
    private int age;
    private double height = 100;
    private double monthlySalary;
    private double yearlySalary;

    public Person(String name, int age2, double height, double monthlySalary) {
        this.name = name;
        age = age2;
        this.height = height;
        this.monthlySalary = monthlySalary;
        yearlySalary = monthlySalary * 12;
    }

    public Person(String name, int age, double height) {
        this.name = name;
        setAge(age);
        this.height = height;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age < 0 ? 0 : this.age;
    }

    public double getHeight() {
        return height;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Person)) {
            return false;
        }
        Person other = (Person) obj;
        return this.name.equals(other.name);
    }

    public String toString() {
        return "Name:" + name + " age:" + age;
    }
}
