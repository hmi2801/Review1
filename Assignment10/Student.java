package Assignment10;

public class Student {
    static String universityName = "ABC University";
    private String name;
    private final int rollNumber;
    private String grade;
    private static int totalStudents = 0;

    Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("University Name: " + universityName);
            System.out.println("Student Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
        } else {
            System.out.println("Invalid student object!!");
        }
    }

    void updateGrade(String newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
            System.out.println("Updated Grade for " + name + ": " + grade);
        } else {
            System.out.println("Invalid student object!!");
        }
    }

    static void displayTotalStudents() {
        System.out.println("Total Number of Students: " + totalStudents);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Alice", 101, "A");
        Student s2 = new Student("Bob", 102, "B");

        s1.displayStudentDetails();
        System.out.println();
        s2.displayStudentDetails();
        System.out.println();

        displayTotalStudents();
        System.out.println();

        s2.updateGrade("A");
        s2.displayStudentDetails();
    }
}
