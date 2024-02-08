package lesson_13;

public class FormatterUtil {
    public static String formatPrice(double price) {
        return String.format("%.2f$", price);
    }
}
