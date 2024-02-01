package lesson_11;

public class Teacher extends Person {
    String subject;
    int yearsOfExperience;

    public void print() {
        super.print();
        System.out.println(subject);
        System.out.println(yearsOfExperience);
    }
}
