package lesson_19;

import lesson_19.singleton.Singleton;

public class Main {
    public static void main(String[] args) {

        Singleton.getInstance().doSomething();
        int choice = 25;

        switch (choice) {
            case 0:
                System.out.println("The value is zero");
                System.out.println("The value is zero");
                System.out.println("The value is zero");
                System.out.println("The value is zero");
                System.out.println("The value is zero");
                break;
            case 1:
                System.out.println("The value is 1");
                break;
            case 2:
                System.out.println("The value is 2");
                break;
            case 3:
                System.out.println("The value is 3");
                break;
            default:
                System.out.println("Invalid input...");
        }
    }

    private static void enumIntro() {
        Car car = new Car("320d", "BMW", FuelType.ELECTRIC);
        FuelType[] fuelTypes = FuelType.values();
        for (FuelType ft: fuelTypes) {
            System.out.println(ft.ordinal() + " " + ft.name());
        }

        String userInput = FuelType.GASOLINE.toString();
        FuelType fuelType = FuelType.valueOf(userInput);
        System.out.println(fuelType);

        int electricIndex = FuelType.ELECTRIC.ordinal();
        FuelType myFT = FuelType.values()[electricIndex];
    }
}
