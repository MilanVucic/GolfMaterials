package lesson_11;

public class PrimitiveTypes {
    public static void main(String[] args) {
        int sum = 100;
        int length = 7;
        System.out.println((double) sum / length);
        double a = 7.8;
        int c = (int) a;
        System.out.println(c);

        byte aByte = 3; // -128 <-> +127
        int anInt = 250; // -2B <-> +2B
        // 0000 0110
        byte anotherByte = (byte) anInt;
        System.out.println(anotherByte);
        long aLong = (long)anInt;
        double aDouble = aLong;
        long aNewLong = (long) aDouble;

        // Buy a ticket that's valid for X amount of days
        // X = 50
        // 8123771274712 + 50 * 24 * 60 * 60 * 1000

        int example = Integer.MAX_VALUE;
        System.out.println(example);
        example += 10;
        System.out.println(example);
    }
}
