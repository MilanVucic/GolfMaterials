package lesson_22;

public class Main {
    private static final int a = 500;
    int c; // package-private
    protected int b; // children class
    public int d;

    public static void main(String[] args) {
        int choice = 1;
        String name = switch (choice) {
            case 1 -> {
                String result = "Milan" + " " + "Vucic";
                yield result;
            }
            case 2 -> "Marco";
            case 3 -> "Luna";
            default -> "Luigi";
        };

        switch (choice) {
            case 1 -> System.out.println("1");
            case 2 -> System.out.println("2");
        }
    }

}
