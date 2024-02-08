package lesson_13;

public class PasswordValidator {
    public static final int MIN_PASS_LENGTH = 5;

    public static boolean isPasswordValid(String password) {
        return password.length() >= MIN_PASS_LENGTH && password.contains("!");
    }
}
