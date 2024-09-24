public class Vehicle {

    // Attributes
    protected String model;
    protected int year;
    protected String fuelType;

    // Default Constructor
    public Vehicle() {
        this.model = "Unknown";
        this.year = 0;
        this.fuelType = "Unknown";
    }

    // Parameterized constructor for Vehicle class 
    public Vehicle(String model, int year, String fuelType) {
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    // start and stop methods 
    public void start() {
        System.out.println("Starting the vehicle...");
    }

    public void stop() {
        System.out.println("Stopping the vehicle...");
    }

    
}



