public class VehicleManagement {
    public static void main(String[] args) {
        // Create instances with default constructor
        // Vehicle genericVehicle = new Vehicle();

        // Create instances with parameterized constructor
        Car myCar = new Car("Chevrolet vy", 2025, "Hybrid", "Red");
        Motorcycle myMotorcycle = new Motorcycle("Royal Enfield", 2024, "Gasoline", 1200);

        // Use the methods
        myCar.start();
        myCar.color();
        myCar.stop();

        myMotorcycle.start();
        myMotorcycle.price();
        myMotorcycle.stop();
    }
}