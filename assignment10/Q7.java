// 7)Can we make multiple contructor inside a class? if yes then what is the need of it.Explain,

Q7) Can we make multiple constructors inside a class?

✅ Yes, we can define multiple constructors inside a class in Java.
This concept is called Constructor Overloading.

In constructor overloading, a class has more than one constructor with the same name (class name) but different parameter lists (different number or type of arguments).

The compiler differentiates constructors based on their signature (number and type of parameters).

Why do we need multiple constructors?

Flexibility in Object Creation →
We can create objects in different ways (with full data, partial data, or no data).

Code Reusability →
Different constructors can call each other using this() to avoid repetition.

Better Readability →
Developers can easily initialize objects according to different scenarios.

Default + Custom Initialization →
One constructor can provide default values, while another can accept user-defined values.

Example of Multiple Constructors
class Student {
    int id;
    String name;
    int age;

    // 1. No-argument constructor
    Student() {
        id = 0;
        name = "Unknown";
        age = 18;
    }

    // 2. Parameterized constructor with 2 arguments
    Student(int i, String n) {
        id = i;
        name = n;
        age = 18;  // default age
    }

    // 3. Parameterized constructor with 3 arguments
    Student(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        // Different ways to create objects
        Student s1 = new Student();                   // no-arg constructor
        Student s2 = new Student(101, "Harshit");     // 2-arg constructor
        Student s3 = new Student(102, "Aman", 20);    // 3-arg constructor

        // Display values
        s1.display();
        s2.display();
        s3.display();
    }
}

Output
ID: 0, Name: Unknown, Age: 18
ID: 101, Name: Harshit, Age: 18
ID: 102, Name: Aman, Age: 20

Explanation

Student() → initializes with default values.

Student(int, String) → initializes with roll number and name, but assigns default age.

Student(int, String, int) → initializes with roll number, name, and age fully customized.

👉 This way, multiple constructors provide different ways to create and initialize an object.

✅ Summary:

Yes, multiple constructors are allowed in Java (constructor overloading).

Need → flexibility, reusability, different initialization styles.

Very useful when designing real-world applications (like database models, APIs, frameworks, etc.).