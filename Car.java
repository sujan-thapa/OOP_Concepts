public class Car extends Vehicle {
    // Attributes not inherited from Vehicle
    private String color;


    public Car() {
        super(); // Calls the Vehicle() constructor
        this.color = "black"; 
    }

    // Constructor of Car
    public Car(String model, int year, String fuelType, String color) {
        super(model, year, fuelType);
        this.color = color;
    }

    // Method of Car class
    public void color() {
        System.out.println("Color of the car is " + color);
    }
}