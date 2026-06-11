// ==============================================================================
// Activity: Student Management System - Constructor Overloading & Lists
// Module 2: OOP. Basic Concepts I (Java Applications)
// ==============================================================================

import java.util.ArrayList;
import java.util.Scanner;

// --- STUDENT BLUEPRINT CLASS ---
class Student {
    // Encapsulated class properties
    private String name;
    private int age;
    private String course;
    private String registrationId;

    // 1. Default Constructor: Sets up standard fallback values if no arguments are passed
    public Student() {
        this.name = "Unknown Student";
        this.age = 0;
        this.course = "Unassigned";
        this.registrationId = "000000";
    }

    // 2. Overloaded Custom Constructor: Maps runtime user inputs directly to instance fields
    public Student(String name, int age, String course, String registrationId) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.registrationId = registrationId;
    }

    // Method responsible for formatting and rendering object state logs to the console
    public void displayProfile() {
        System.out.println("------------------------------------");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age + " years old");
        System.out.println("Course: " + this.course);
        System.out.println("Registration ID: " + this.registrationId);
        System.out.println("------------------------------------");
    }

    // Standard accessor method to fetch the registration token
    public String getRegistrationId() {
        return registrationId;
    }
}

// --- MAIN RUNNER ENGINE ---
public class StudentManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Scalable heap collection to aggregate runtime Student instances
        ArrayList<Student> studentList = new ArrayList<>();
        int selectedOption;

        System.out.println("=== Welcome to the Student Registry Engine! ===");

        // Persistent flow control loop handling contextual dashboard tasks
        do {
            System.out.println("\nOPERATIONAL DASHBOARD MENU:");
            System.out.println("1 - Register New Student (Custom Inputs)");
            System.out.println("2 - Create Placeholder Student (Default Profile)");
            System.out.println("3 - Render All Registered Profiles");
            System.out.println("4 - Terminate Application Sessions");
            System.out.print("Select operational choice: ");
            selectedOption = scanner.nextInt();
            scanner.nextLine(); // Clear the text entry stream buffer

            switch (selectedOption) {
                case 1:
                    // Compiling structural properties via manual console data scans
                    System.out.print("Enter student full name: ");
                    String name = scanner.nextLine();
                    
                    System.out.print("Enter student age target: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // Clear buffer tracking
                    
                    System.out.print("Enter mapped academic course: ");
                    String course = scanner.nextLine();
                    
                    System.out.print("Enter structural registration ID: ");
                    String regId = scanner.nextLine();

                    // Instantiating object via the custom overloaded parameters route
                    Student newStudent = new Student(name, age, course, regId);
                    studentList.add(newStudent);
                    System.out.println("🎉 Custom student registry committed successfully!");
                    break;

                case 2:
                    // Instantiating object via the default fallback parameter route
                    Student defaultStudent = new Student();
                    studentList.add(defaultStudent);
                    System.out.println("🎉 Default placeholder instance added to repository!");
                    break;

                case 3:
                    // Safety check preventing processing iterations over empty lists
                    if (studentList.isEmpty()) {
                        System.out.println("System warning: No active data models registered yet.");
                    } else {
                        System.out.println("\n--- DISPLAYING REGISTERED STUDENT ENTRIES ---");
                        for (Student student : studentList) {
                            student.displayProfile();
                        }
                    }
                    break;

                case 4:
                    System.out.println("Safely interrupting runtime services... Goodbye!");
                    break;

                default:
                    System.out.println("Operational mismatch: Option unrecognized. Try again.");
                    break;
            }

        } while (selectedOption != 4); // Loop breaks strictly when terminal code 4 is parsed

        scanner.close();
    }
}
