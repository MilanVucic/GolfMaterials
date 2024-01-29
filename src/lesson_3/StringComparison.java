package lesson_3;

public class StringComparison {
    public static void main(String[] args) {
        String name = "Milan";
        String otherName = "Milan";
        String thirdName = "Mil";
        thirdName += "an";
        System.out.println(name == otherName); // Milan, Mil
        System.out.println(name == thirdName);
        System.out.println(name.equals(thirdName));

        /*
        2. Given the Strings below:

        String a1 = "abcd";
        String a2 = "ABCD";
        String a3 = "AB";
        String a4 = "cd";

        What are the following expressions going to evaluate to (true/false)?

        a1.toUpperCase() == a2
        a1.equals(a2)
        a1.equalsIgnoreCase(a2)
        a1 == a3.toLowerCase() + a4
        a1 == (a3 + a4).toLowerCase()
        a2 == a3.toUpperCase() + a4.toUpperCase()
        a2.equals(a3 + a4)
        a1.equalsIgnoreCase(a3 + a4)
        a1.equals((a3+a4).toLowerCase())
        a2.equals(a3.toUpperCase() + a4.toUpperCase())
         */
    }
}
