4)How to update and retrive  the value of a particular property of an object from anothor class(Let suppose the property is private) ?
Concept

If a property (field/variable) is declared as private, it cannot be accessed directly outside the class.

To access it from another class, we use public getter and setter methods.

Setter → updates the value.

Getter → retrieves the value.

Example
// Class 1: Student.java
class Student {
    // private property
    private String name;

    // Getter method → retrieve value
    public String getName() {
        return name;
    }

    // Setter method → update value
    public void setName(String name) {
        this.name = name;
    }
}

// Class 2: Main.java
public class Main {
    public static void main(String[] args) {
        // Create object of Student class
        Student s1 = new Student();

        // Update value using setter
        s1.setName("Harshit");

        // Retrieve value using getter
        System.out.println("Student Name: " + s1.getName());
    }
}

Output
Student Name: Harshit

Explanation

private String name; → variable is hidden (not accessible outside).

setName("Harshit"); → updates the private property.

getName(); → retrieves the value safely.