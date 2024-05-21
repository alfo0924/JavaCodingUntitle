import java.util.Random;

 class Car {
    private String carId;
    private String engineId;
    private String color;

    public Car(String carId, String engineId, String color) {
        this.carId = carId;
        this.engineId = engineId;
        this.color = color;
    }

    // Getter methods
    public String getCarId() {
        return carId;
    }

    public String getEngineId() {
        return engineId;
    }

    public String getColor() {
        return color;
    }
}

public class c64q25 {
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final Random RANDOM = new Random();

    // Method to generate 8-digit numeric engineId
    private static String generateEngineId() {
        StringBuilder engineId = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            engineId.append(RANDOM.nextInt(10));
        }
        return engineId.toString();
    }

    // Method to generate carId with the format T[二個英文字母]-[三個數字]
    private static String generateCarId() {
        StringBuilder carId = new StringBuilder("T");
        for (int i = 0; i < 2; i++) {
            carId.append(CHARACTERS.charAt(RANDOM.nextInt(CHARACTERS.length())));
        }
        carId.append('-');
        for (int i = 0; i < 3; i++) {
            carId.append(RANDOM.nextInt(10));
        }
        return carId.toString();
    }

    // Method to create a Car object and return it
    public static Car createCar() {
        String carId = generateCarId();
        String engineId = generateEngineId();
        String color = "Yellow";
        return new Car(carId, engineId, color);
    }

    public static void main(String[] args) {
        Car car = createCar();
        System.out.println("Car ID: " + car.getCarId());
        System.out.println("Engine ID: " + car.getEngineId());
        System.out.println("Color: " + car.getColor());
    }
}
