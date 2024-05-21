//// Car.java
//public class Car {
//    private String carId;
//    private String engineId;
//    private String color;
//
//    public Car(String engineId) {
//        this.engineId = engineId;
//    }
//
//    public Car(String carId, String engineId, String color) {
//        this.carId = carId;
//        this.engineId = engineId;
//        this.color = color;
//    }
//
//    public String getEngineId() {
//        return engineId;
//    }
//
//    public String getCarId() {
//        return carId;
//    }
//
//    public void setCarId(String carId) {
//        this.carId = carId;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//}
//
//// CarFactory.java
//public class CarFactory {
//    private int numOfCars;
//
//    public CarFactory() {
//        this.numOfCars = 0;
//    }
//
//    public int getProducedCars() {
//        return numOfCars;
//    }
//
//    public Car produceCar() {
//        String engineId = generateEngineId();
//        String carId = generateCarId();
//        String color = generateColor();
//        Car car = new Car(carId, engineId, color);
//        numOfCars++;
//        return car;
//    }
//
//    public boolean updateCarId(Car car, String carId) {
//        if (validateCarId(carId)) {
//            car.setCarId(carId);
//            return true;
//        }
//        return false;
//    }
//
//    public boolean updateCarColor(Car car, String color) {
//        if (validateColor(color)) {
//            car.setColor(color);
//            return true;
//        }
//        return false;
//    }
//
//    private String generateEngineId() {
//        // generate 8-digit engineId
//        return String.valueOf((int) (Math.random() * 10000000));
//    }
//
//    private String generateCarId() {
//        // generate 8-character carId in the format C[2 letters]-[4 digits]
//        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//        String carId = "C";
//        for (int i = 0; i < 2; i++) {
//            carId += letters.charAt((int) (Math.random() * letters.length()));
//        }
//        carId += "-";
//        for (int i = 0; i < 4; i++) {
//            carId += (int) (Math.random() * 10);
//        }
//        return carId;
//    }
//
//    private String generateColor() {
//        // generate a random color from White, Black, Blue
//        String[] colors = {"White", "Black", "Blue"};
//        return colors[(int) (Math.random() * colors.length)];
//    }
//
//    private boolean validateCarId(String carId) {
//        // validate carId format
//        return carId.matches("C[A-Z]{2}-\\d{4}");
//    }
//
//    private boolean validateColor(String color) {
//        // validate color
//        return color.equals("White") || color.equals("Black") || color.equals("Blue");
//    }
//}
//
//// TaxiFactory.java
//public class TaxiFactory extends CarFactory {
//    @Override
//    public Car produceCar() {
//        String engineId = generateEngineId();
//        String carId = generateTaxiCarId();
//        String color = "Yellow";
//        Car car = new Car(carId, engineId, color);
//        numOfCars++;
//        return car;
//    }
//
//    private String generateTaxiCarId() {
//        // generate 8-character carId in the format T[2 letters]-[3 digits]
//        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//        String carId = "T";
//        for (int i = 0; i < 2; i++) {
//            carId += letters.charAt((int) (Math.random() * letters.length()));
//        }
//        carId += "-";
//        for (int i = 0; i < 3; i++) {
//            carId += (int) (Math.random() * 10);
//        }
//        return carId;
//    }
//}
//
//// ElectricCarFactory.java
//public class ElectricCarFactory extends CarFactory {
//    @Override
//    public Car produceCar() {
//        String engineId = generateEngineId();
//        String carId = generateElectricCarId();
//        String color = generateColor();
//        Car car = new Car(carId, engineId, color);
//        numOfCars++;
//        return car;
//    }
//
//    private String generateElectricCarId() {
//        // generate 8-character carId in the format E[2 letters]-[4 digits]
//        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//        String carId = "E";
//        for (int i = 0; i < 2; i++) {
//            carId += letters.charAt((int) (Math.random() * letters.length()));
//        }
//        carId += "-";
//        for (int i = 0; i < 4;i++) {
//            carId += (int) (Math.random() * 10);
//        }
//        return carId;
//    }
//}
//
//// Main.java
//public class c64q26 {
//    public static void main(String[] args) {
//        CarFactory carFactory = new CarFactory();
//        Car car = carFactory.produceCar();
//        System.out.println("Original car: ");
//        System.out.println("ID: " + car.getCarId());
//        System.out.println("Engine ID: " + car.getEngineId());
//        System.out.println("Color: " + car.getColor());
//        System.out.println();
//
//        boolean updated = carFactory.updateCarId(car, "CAB-1234");
//        System.out.println("Update car ID to CAB-1234? " + updated);
//        System.out.println("Updated car: ");
//        System.out.println("ID: " + car.getCarId());
//        System.out.println("Engine ID: " + car.getEngineId());
//        System.out.println("Color: " + car.getColor());
//        System.out.println();
//
//        TaxiFactory taxiFactory = new TaxiFactory();
//        Car taxi = taxiFactory.produceCar();
//        System.out.println("TaxiFactory produced car: ");
//        System.out.println("ID: " + taxi.getCarId());
//        System.out.println("Engine ID: " + taxi.getEngineId());
//        System.out.println("Color: " + taxi.getColor());
//        System.out.println();
//
//        ElectricCarFactory electricCarFactory = new ElectricCarFactory();
//        Car electricCar = electricCarFactory.produceCar();
//        System.out.println("ElectricCarFactory produced car: ");
//        System.out.println("ID: " + electricCar.getCarId());
//        System.out.println("Engine ID: " + electricCar.getEngineId());
//        System.out.println("Color: " + electricCar.getColor());
//    }
//}