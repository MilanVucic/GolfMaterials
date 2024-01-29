package lesson_4;

public class IfLazyEvaluation {
    /*
    1. When this code is executed, what are the values of a, b, c, d at the end?
        Does it print "1" to the console or not?

        int a = 100;
        int b = 101;
        boolean c = ++a >= b;
        int d = 102;
        if (d-- <= b || ++b > --a) {
            System.out.println("1");
        }

        a = ?
        b = ?
        c = ?
        d = ?
     */
    public static void main(String[] args) {
//        int a = 100; // 101
//        int b = 101; // 100
//        int c = 102; // 100
//        int d = c--; // 101
//        // A AND B -> stops evaluation if A == false
//        // A OR B -> stops evaluation if A == true
//        //       (T   &&     F)      ||      F
//        if ((--d <= b && b-- > ++a) || (c-- == b)) {
//            System.out.println("hi");
//        }
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//        System.out.println("c = " + c);
//        System.out.println("d = " + d);


        int a = 100;
        int b = 101;
        int c = 102;
        int d = c--;
        // A AND B -> stops evaluation if A == false
        // A OR B -> stops evaluation if A == true
        //       (T   &&     F)     &&  NOT EXECUTED
        if ((--d <= b && b-- > ++a) && (c-- == b)) {
            System.out.println("hi");
        }
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}
