//package org.example;
//
//import java.util.Random;
//
//class Car {  // 類別:car
//    private String carId;
//    private String engineId;
//    private String color;
//
//    private static final Random random = new Random(); // 建立隨機取樣套件
//    private static final String[] COLORS = {"White", "Black", "Blue"};
//    private static final String CHARACTERS = "ABCDEFGHIJKLMOPQRSTUVWXYZ";
//
//    private int numOfCars;
//
//    // Constructor
//    public Car() {
//        this.engineId = generateEngineId();
//        this.carId = generateCarId();
//        this.color = generateColor();
//    }
//
//    // 方法:引擎id
//    private String generateEngineId() {
//        return String.valueOf((int)(Math.random() * 100000000));
//    }
//
//    private String generateCarId() {
//        StringBuilder carId = new StringBuilder("T");
//        for (int i = 0; i < 2; i++) {
//            carId.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
//        }
//        carId.append('-');
//        for (int i = 0; i < 3; i++) {
//            carId.append(random.nextInt(10));
//        }
//        return carId.toString();
//    }
//
//    private String generateColor() {
//        return COLORS[random.nextInt(COLORS.length)];
//    }
//
//    public void getProducedCars(int cars) {
//        numOfCars += cars;
//        System.out.println("Total Produce: " + numOfCars);
//    }
//
//    public void produceCar() {
//        System.out.println("Produce car:");
//        System.out.println("Engine Id: " + engineId);
//        System.out.println("Car Id: " + carId);
//        System.out.println("Color: " + color);
//    }
//
//    public void updateCarId(String carId) {
//        // Validate the carId format if necessary
//        this.carId = carId;
//    }
//
//    public void updateCarColor(String color) {
//        // Validate the color if necessary
//        this.color = color;
//    }
//
//    public void printOut() {
//        System.out.println();
//    }
//}
//
//class TaxiFactory extends Car {  // 類別:計程車工廠
//    // Override necessary methods if needed
//}
//
//class ElectronicCarFactory extends Car {  // 類別:電車工廠
//    // Override necessary methods if needed
//}
//
//public class c64cars {
//    public static void main(String[] args) {
//        Car c = new Car();
//        c.produceCar();
//    }
//}
