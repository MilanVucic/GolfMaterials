package lesson_4;

public class LoopInLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("i = " + i);
                System.out.println("| j = " + j);
            }
            System.out.println();
        }

        float f = 5.4f;
        double d = f;

        System.out.println(Math.round(4.5));
        System.out.println(Math.ceil(4.5));
        System.out.println(Math.floor(4.5));
    }
}
