package Bridgelabz_2113100011.Assignment20;

import java.util.PriorityQueue;

public class HospitalTriageSystem implements Comparable<HospitalTriageSystem> {
    private String patientName;
    private int priorityNumber;

    public HospitalTriageSystem(String patientName, int priorityNumber) {
        this.patientName = patientName;
        this.priorityNumber = priorityNumber;
    }

    // Ensure higher priority (larger number) is served first
    @Override
    public int compareTo(HospitalTriageSystem other) {
        return Integer.compare(other.priorityNumber, this.priorityNumber);
    }

    @Override
    public String toString() {
        return patientName + " (Priority: " + priorityNumber + ")";
    }
}

class PatientQueue {
    private PriorityQueue<HospitalTriageSystem> priorityQueue = new PriorityQueue<>();

    public void addPatient(HospitalTriageSystem patient) {
        priorityQueue.add(patient);
        System.out.println("Added: " + patient);
    }

    public void treatNextPatient() {
        if (!priorityQueue.isEmpty()) {
            System.out.println("Treating: " + priorityQueue.poll());
        } else {
            System.out.println("No patients left.");
        }
    }
}

class Main{
    public static void main(String[] args) {
        PatientQueue queue = new PatientQueue();

        queue.addPatient(new HospitalTriageSystem("John", 3));
        queue.addPatient(new HospitalTriageSystem("Alice", 5));
        queue.addPatient(new HospitalTriageSystem("Bob", 2));

        System.out.println("\nPatients Treated in Order:");
        queue.treatNextPatient(); // Alice (Priority: 5)
        queue.treatNextPatient(); // John (Priority: 3)
        queue.treatNextPatient(); // Bob (Priority: 2)
    }
}
