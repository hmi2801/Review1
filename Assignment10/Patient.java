package Assignment10;

public class Patient {
    static String hospitalName = "City Hospital";
    private String name;
    private final int patientID;
    private int age;
    private String ailment;
    private static int totalPatients = 0;

    Patient(String name, int patientID, int age, String ailment) {
        this.name = name;
        this.patientID = patientID;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Patient Name: " + name);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        } else {
            System.out.println("Invalid patient object!!");
        }
    }

    static void getTotalPatients() {
        System.out.println("Total Number of Patients Admitted: " + totalPatients);
    }

    public static void main(String[] args) {
        Patient p1 = new Patient("Alice", 101, 30, "Fever");
        Patient p2 = new Patient("Bob", 102, 45, "Flu");

        p1.displayPatientDetails();
        System.out.println();
        p2.displayPatientDetails();
        System.out.println();

        getTotalPatients();
    }
}