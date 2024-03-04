package lesson_19;

public class Car {
    private String model;
    private String maker;
    private FuelType fuelType; // 0 - Diesel, 1 - gasoline, 2 - gas, 3 - electric, 4 - hybrid

    public Car(String model, String maker, FuelType fuelType) {
        this.model = model;
        this.maker = maker;
        this.fuelType = fuelType;
    }
}
