import java.util.Scanner;

// --- BASE CLASS (PARENT) ---
class Vehicle {
    // Protected attributes accessible within the class hierarchy
    protected String brand;
    protected int year;

    // Base constructor mapping arguments to local fields
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Presentation method to print baseline attributes
    public void displayInfo() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Manufacturing Year: " + this.year);
    }
}

// --- SUBCLASS: CAR (CHILD) ---
class Car extends Vehicle {
    private int numberOfDoors;

    // Subclass constructor invoking the parent routine via 'super'
    public Car(String brand, int year, int numberOfDoors) {
        super(brand, year); // Leverages parent initialization logic
        this.numberOfDoors = numberOfDoors; // Binds local subclass state
    }

    // Specialized override to enrich presentation outputs
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + this.numberOfDoors);
    }
}

// --- SUBCLASS: MOTORCYCLE (CHILD) ---
class Motorcycle extends Vehicle {
    private String type; // e.g., Sport, Custom, Scooter

    // Subclass constructor mapping states through parent hooks
    public Motorcycle(String brand, int year, String type) {
        super(brand, year);
        this.type = type;
    }

    // Specialized override to include dynamic motorcycle types
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Motorcycle Type: " + this.type);
    }
}

// --- MAIN EXECUTION ENTRY POINT ---
public class VehicleHierarchy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=========================================");
        System.out.println("        VEHICLE HIERARCHY SYSTEM         ");
        System.out.println("=========================================\n");

        // 1. Instantiating Car state components via User input
        System.out.println("--- REGISTER CAR ---");
        System.out.print("Enter car brand: ");
        String carBrand = scanner.nextLine();
        System.out.print("Enter car year: ");
        int carYear = scanner.nextInt();
        System.out.print("Enter number of doors: ");
        int carDoors = scanner.nextInt();
        scanner.nextLine(); // Clear scanner buffer

        Car myCar = new Car(carBrand, carYear, carDoors);

        System.out.println("\n-----------------------------------------");

        // 2. Instantiating Motorcycle state components via User input
        System.out.println("--- REGISTER MOTORCYCLE ---");
        System.out.print("Enter motorcycle brand: ");
        String motoBrand = scanner.nextLine();
        System.out.print("Enter motorcycle year: ");
        int motoYear = scanner.nextInt();
        scanner.nextLine(); // Clear scanner buffer
        System.out.print("Enter motorcycle type (e.g., Sport, Custom, Scooter): ");
        String motoType = scanner.nextLine();

        Motorcycle myMotorcycle = new Motorcycle(motoBrand, motoYear, motoType);

        // 3. Executing Display logic using polymorphism triggers
        System.out.println("\n================ VEHICLES SUMMARY ================");
        System.out.println("\n[ Car Information ]");
        myCar.displayInfo();

        System.out.println("\n[ Motorcycle Information ]");
        myMotorcycle.displayInfo();
        System.out.println("==================================================");

        scanner.close();
    }
}
