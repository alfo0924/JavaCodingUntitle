//import java.util.*;
//
//class car {
//    private String carId;
//    private int enginId;
//    private String color;
//    private boolean carIdUpdated = false; // Add boolean flag
//    Random random = new Random();
//    String[] COLORS = {"White", "Black", "Blue"};
//    int numOfCars;
//
//    void setCarId() {
//        // Generate carId
//        carId = generateCarId();
//        carIdUpdated = true; // Set flag to true after updating carId
//        System.out.println("Set CarId :" + carId);
//    }
//
//    void updateCarId(car car, String carId) {
//        // Same as before
//    }
//
//    void printOut() {
//        // Print only if carId has not been updated
//        if (!carIdUpdated) {
//            System.out.println("CarId : " + carId);
//        }
//        // Same for other attributes
//    }
//
//    // Method to generate carId
//    private String generateCarId() {
//        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//        StringBuilder carId = new StringBuilder();
//        carId.append("C");
//        for (int i = 0; i < 2; i++) {
//            carId.append(characters.charAt(random.nextInt(characters.length())));
//        }
//        carId.append('-');
//        for (int i = 0; i < 3; i++) {
//            carId.append(random.nextInt(10));
//        }
//        return carId.toString();
//    }
//}
//
//class TaxiFactory extends car {
//    private boolean taxiIdUpdated = false; // Add boolean flag
//
//    @Override
//    void setCarId() {
//        // Same as before
//    }
//
//    void updateTaxiId(car car, String carId) {
//        // Same as before
//        taxiIdUpdated = true; // Set flag to true after updating taxiId
//    }
//
//    void printOut() {
//        // Print only if taxiId has not been updated
//        if (!taxiIdUpdated) {
//            System.out.println("TaxiId : " + carId);
//        }
//        // Same for other attributes
//    }
//}
//
//class ElectricCarFactory extends car {
//    private boolean eCarIdUpdated = false; // Add boolean flag
//
//    @Override
//    void setCarId() {
//        // Same as before
//    }
//
//    void updateElectricCarId(car car, String carId) {
//        // Same as before
//        eCarIdUpdated = true; // Set flag to true after updating eCarId
//    }
//
//    void printOut() {
//        // Print only if eCarId has not been updated
//        if (!eCarIdUpdated) {
//            System.out.println("EcarId : " + carId);
//        }
//        // Same for other attributes
//    }
//}
//
//public class C64Car {
//    public static void main(String[] args) {
//        // Same as before
//    }
//}
