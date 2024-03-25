package lesson_24;

import lesson_19.FuelType;

public class Car {
    public static final String SEP = "-";
    private String maker;
    private String model;
    private int year;
    private boolean isManual;
    private FuelType fuelType;
    private double dailyPrice;
    private boolean isRented;

    public Car(String maker, String model, int year, boolean isManual, FuelType fuelType, double dailyPrice) {
        this.maker = maker;
        this.model = model;
        this.year = year;
        this.isManual = isManual;
        this.fuelType = fuelType;
        this.dailyPrice = dailyPrice;
        this.isRented = false;
    }

    public static Car parseFromString(String line) {
        String[] parts = line.split(SEP);

        return new Car(parts[0], parts[1], Integer.parseInt(parts[2]),
                Boolean.parseBoolean(parts[3]), FuelType.valueOf(parts[4]), Double.parseDouble(parts[5]));
    }

    public boolean isRented() {
        return isRented;
    }

    public void setRented(boolean rented) {
        isRented = rented;
    }

    @Override
    public String toString() {
        return "Car{" +
                "maker='" + maker + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", isManual=" + isManual +
                ", fuelType=" + fuelType +
                ", dailyPrice=" + dailyPrice +
                ", isRented=" + isRented +
                '}';
    }

    public String toFileFormat() {
        return maker + SEP + model + SEP + year + SEP + isManual
                + SEP + fuelType + SEP + dailyPrice + SEP + isRented;
    }
}
