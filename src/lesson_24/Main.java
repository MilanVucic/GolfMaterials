package lesson_24;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final String FILENAME = "cars.txt";

    public static void main(String[] args) {
        List<Car> cars = readCarsFromFile(FILENAME);
        CarRepository carRepository = new CarRepository(cars);

        Scanner scanner = new Scanner(System.in);
        endlessLoop:
        while (true) {
            printMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 0 -> {
                    break endlessLoop;
                }
                case 1 -> System.out.println(carRepository.getCars());
            }
        }

        saveCarsToFile(carRepository.getCars(), FILENAME);
    }

    private static List<Car> readCarsFromFile(String filename) {
        List<Car> list = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                Car car = Car.parseFromString(line);
                list.add(car);
                line = bufferedReader.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("File wasn't found. Try again.");
        } catch (IOException e) {
            System.out.println("Something went wrong while reading from the file...");
        }

        return list;
    }

    private static void saveCarsToFile(List<Car> cars, String filename) {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(filename);

            for (Car car : cars) {
                writer.println(car.toFileFormat());
            }
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found...");
        }
    }

    public static void printMenu() {
        System.out.println("Enter an option from below:");
        System.out.println("0. Exit");
        System.out.println("1. List all cars");
        System.out.println("2. List available cars");
        System.out.println("3. List rented cars");
        System.out.println("4. Rent a car");
        System.out.println("5. Return a car");
        System.out.println("6. Add a car");
    }
}
