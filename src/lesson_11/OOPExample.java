package lesson_11;

public class OOPExample {
    public static void main(String[] args) {
        Student student = new Student();
        student.email = "milan@mail.com";
        student.age = 21;
        student.name = "milan";
        student.grades = new int[]{1, 2, 3};
        Teacher teacher = new Teacher();
        teacher.email = "luca@mail.com";
        teacher.age = 43;
        teacher.name = "luca";
        teacher.yearsOfExperience = 15;
        teacher.subject = "Physics";

        Person person = new Person();

        person.email = "masdmas@mail.com";
        person.age = 99;
        person.name = "oldie";
        Person[] people = new Person[]{student, teacher, person};
        for (int i = 0; i < people.length; i++) {
            Person p = people[i];
            p.print();
        }
    }

    private static void dogsAndStuff() {
        Dog dog = new Dog();
        dog.name = "Ruffy";
        dog.age = 6;
        dog.ownerName = "Milan";
        Dog dog2 = new Dog();
        dog2.name = "Viper";
        dog2.age = -3;
        dog2.ownerName = "Bianca";
        Dog[] dogs = new Dog[]{dog, dog2};

        for (int i = 0; i < dogs.length; i++) {
            dogs[i].print();
        }
    }
}
