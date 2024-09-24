public class Motorcycle extends Vehicle {
    // Attributes not inherited from Vehicle
    private double price;


    // Default constructor (calls the parent's default constructor)
    public Motorcycle() {
        super(); // Calls the Vehicle() constructor
        this.price = 3000; 
    }

    public Motorcycle(String model, int year, String fuelType, double price) {
        super(model, year, fuelType);
        this.price = price;
    }

    // Method of Motorcycle class
    public void price() {
        System.out.println("Price of motorcylce is " + price);
    }
}