package lesson_13;

public class Car {
    private static int NUM_OF_CARS = 0;
    private static int NEXT_ID = 1000;

    private int id;
    private String maker;
    private String model;

    public Car(String maker, String model) {
        this.maker = maker;
        this.model = model;
        this.id = NEXT_ID;
        NEXT_ID++;
        NUM_OF_CARS++;
    }

    public int getId() {
        return id;
    }

    public static int getNumOfCars() {
        return NUM_OF_CARS;
    }

    @Override
    public String toString() {
        return id + " " + maker + " " + model;
    }
}
