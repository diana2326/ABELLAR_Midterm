    // Base class representing a person
class Person {
    // Fields for the Person class
    private String name;
    private int age;

    // Construct to initialize the person objct with a name and age
    public Person(String name, int age) {
        this.name = name;//set the name field
        this.age = age;//set the age field
    }

    // Method to display person's information
    public void displayInfo() {
        System.out.println("Name: " + name); //Print the person's name
        System.out.println("Age: " + age);//Print the person's age 
    }
}

// Subclass representing a student, which is a type of person 
class Student extends Person {
    // Fields for the Student class
    private String studentID;
    private String course;
    private int units;
     // Fixed fee per unit
    private final int feePerUnit = 1000;

    // Constructor to initialize student attributes, including inherited fields
    public Student(String name, int age, String studentID, String course, int units) {
        // Call to the superclass constructor
        super(name, age);
        this.studentID = studentID;
        this.course = course;
        this.units = units;
    }

    // Method to calculate the total fees for the student based on the units taken
    public double calculateFees() {
        return units * feePerUnit;
    }

    // Override method to display student-specific information
    @Override
    public void displayInfo() {
       // Call to t he superclass method
        super.displayInfo();
        System.out.println("Student ID: " + studentID);
        System.out.println("Course: " + course);
        System.out.println("Units: " + units);
        System.out.println("Total Fee: " + calculateFees());
    }
}

// Subclass representing an instructor
class Instructor extends Person {
    // Fields for the Instructor class
    private String employeeID;
    private String department;
    private double salary;

    // Constructor to initialize instructor attributes
    public Instructor(String name, int age, String employeeID, String department, double salary) {
        // Call to the superclass constructor
        super(name, age); 
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Override method to display instructor's information
    @Override
    public void displayInfo() {
     // Call to the superclass method       
        super.displayInfo();
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

// Main class to test the implementation
public class UniversityEnrollmentSystem {

    // Method to print details of a Person object
    public static void printDetails(Person p) {
       // Calls the appropriate displayInfo() method
        p.displayInfo(); 
        // Print a blank line for better readability
        System.out.println(); 
    }

    public static void main(String[] args) {
        // Creating two Student objects
        Student student1 = new Student("DIANA MAE O. ABELLAR", 19, "231002301", "COMPUTER ENGINEERING", 15);
        Student student2 = new Student("MITSIKO BELLA G. RIGESTRADO", 19, "231001306", "COMPUTER ENGINEERING", 12);

        // Creating two Instructor objects
        Instructor instructor1 = new Instructor("ENGR.TANYA JOVILLANO",22 , "E001", "CEA",65000);
        Instructor instructor2 = new Instructor("ENGR.ERIC VELITARIO", 30, "E002", "CEA", 70000);

        // Using printDetails method to print information
        printDetails(student1);
        printDetails(student2);
        printDetails(instructor1);
        printDetails(instructor2);
    }
}