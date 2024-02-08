package lesson_13;

public class OuterClass {
    private static int value = 500;
    public class InnerNonStaticClass {

    }

    public static class InnerStaticClass {

        public static void method() {
            System.out.println(value);
        }
    }
}
