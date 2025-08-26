1) Role of Setter and Getter Methods in Java
Definition

Getter method → used to read/access the value of a private variable.

Setter method → used to modify/update the value of a private variable.

👉 They are the public methods that allow controlled access to private variables (achieving Encapsulation).

Why do we need Getters and Setters?

Encapsulation & Data Hiding → private variables cannot be accessed directly from outside the class.

Validation → setters allow adding rules before changing a value.

Flexibility → getters and setters provide controlled, maintainable access instead of exposing variables directly.

Read-only / Write-only →

Only getter → read-only property.

Only setter → write-only property.

Example of Getters and Setters
class Student {
    private String name;   // private data
    private int age;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter with validation
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setName("Harshit"); // setting value
        s1.setAge(20);         // setting value with validation

        System.out.println("Name: " + s1.getName()); 
        System.out.println("Age: " + s1.getAge());
    }
}


👉 Output

Name: Harshit
Age: 20


✅ Here:

Variables are hidden (private).

Access is only through getters and setters.

2) POJO in Java
Definition

POJO (Plain Old Java Object) is a simple Java object that does not depend on any special framework or library.
It is used to store data in an object-oriented way.

Characteristics of a POJO

All variables are usually private.

Provides public getters and setters to access data.

Must have a default (no-argument) constructor.

Should not extend or implement any specialized framework class (it can extend Object, which is by default).

No heavy annotations or special restrictions.

Example of POJO
public class Employee {
    private int id;
    private String name;
    private double salary;

    // Default constructor
    public Employee() {}

    // Parameterized constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }

    // Setters
    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setSalary(double salary) { this.salary = salary; }
}


👉 Using POJO

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setId(101);
        e.setName("Harshit");
        e.setSalary(50000);

        System.out.println("Employee ID: " + e.getId());
        System.out.println("Name: " + e.getName());
        System.out.println("Salary: " + e.getSalary());
    }
}

Difference between POJO and JavaBean

POJO → General term for simple Java object.

JavaBean → A special type of POJO that is serializable, has a default constructor, and follows strict getter/setter naming conventions.

👉 All JavaBeans are POJOs, but not all POJOs are JavaBeans.