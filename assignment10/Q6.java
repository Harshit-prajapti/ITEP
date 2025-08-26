// 6)What is Constructor? List down the keypoints about constructor.
Q6) What is Constructor?

A constructor in Java is a special method used to initialize objects.

It has the same name as the class.

It is automatically called when an object is created.

It does not have a return type, not even void.

👉 Example

class Student {
    int rollNo;
    String name;

    // Constructor
    Student(int r, String n) {
        rollNo = r;
        name = n;
    }

    void display() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        // Constructor is called automatically at object creation
        Student s1 = new Student(101, "Harshit");
        s1.display();
    }
}


👉 Output

Roll No: 101, Name: Harshit

Key Points about Constructor in Java

Same Name as Class

Constructor must have the same name as the class.

No Return Type

A constructor does not return anything, not even void.

Automatic Invocation

Called automatically when an object is created using the new keyword.

Types of Constructors

Default Constructor: Provided by Java compiler if no constructor is defined.

No-Argument Constructor: Defined explicitly without parameters.

Parameterized Constructor: Accepts parameters to initialize values.

Overloading Possible

Constructors can be overloaded (multiple constructors with different parameter lists).

Cannot be Static, Final, or Abstract

Constructor cannot be declared as static, final, or abstract.

Used for Initialization

The main purpose of a constructor is to initialize object state.

If you define any constructor explicitly → Java does not provide default constructor automatically.

Examples of Constructors
1. Default Constructor (provided by compiler)
class Demo {
    int x;
    String y;
}

public class Main {
    public static void main(String[] args) {
        Demo d = new Demo(); // default constructor invoked
        System.out.println(d.x); // 0 (default int value)
        System.out.println(d.y); // null (default String value)
    }
}

2. No-Argument Constructor
class Demo {
    Demo() {
        System.out.println("No-arg constructor called");
    }
}

public class Main {
    public static void main(String[] args) {
        Demo d = new Demo(); // Output: No-arg constructor called
    }
}

3. Parameterized Constructor
class Person {
    String name;
    int age;

    // parameterized constructor
    Person(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println(name + " is " + age + " years old.");
    }
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Harshit", 20);
        p1.display();
    }
}


👉 Output

Harshit is 20 years old.


✅ Summary:

A constructor is a special method used to initialize objects.

It has the same name as the class, no return type, and is called automatically at object creation.

Types → default, no-argument, parameterized.

Supports overloading but not static/final/abstract.