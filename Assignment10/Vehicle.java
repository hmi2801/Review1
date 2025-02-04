package Assignment10;

public class Vehicle {
    static double registrationFee = 5000.0;
    private String ownerName;
    private final int registrationNumber;
    private String vehicleType;
    private static int totalVehicles = 0;

    Vehicle(String ownerName, int registrationNumber, String vehicleType) {
        this.ownerName = ownerName;
        this.registrationNumber = registrationNumber;
        this.vehicleType = vehicleType;
        totalVehicles++;
    }

    void displayVehicleDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Fee: $" + registrationFee);
        } else {
            System.out.println("Invalid vehicle object!!");
        }
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Updated Registration Fee: $" + registrationFee);
    }

    static void displayTotalVehicles() {
        System.out.println("Total Number of Registered Vehicles: " + totalVehicles);
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("John Doe", 1001, "Car");
        Vehicle v2 = new Vehicle("Jane Smith", 1002, "Motorcycle");

        v1.displayVehicleDetails();
        System.out.println();
        v2.displayVehicleDetails();
        System.out.println();

        displayTotalVehicles();
        System.out.println();

        updateRegistrationFee(5500.0);
        v1.displayVehicleDetails();
    }
}
