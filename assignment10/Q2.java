2What is class and object? Explain all oop features in java with example.
A class is a blueprint or template used to create objects.
It defines variables (attributes/data members) and methods (functions/behaviors) that represent the properties and actions of an object.

It is a logical entity, not memory-consuming until objects are created.

Declared using the keyword class

Object in Java

An object is a real-world entity and an instance of a class.
It has:

State → values of attributes (e.g., rollNo = 101, name = "Harshit")

Behavior → actions performed (e.g., display())

Objects are created using the new keyword.
1) Encapsulation

Wrapping data (variables) and methods into a single unit (class).

Data hiding can be achieved using private access modifier and accessed through getters and setters.

👉 Example

class Account {
    private double balance; // hidden data

    // method to modify balance
    public void deposit(double amount) {
        balance += amount;
    }

    // method to access balance
    public double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.deposit(5000);
        System.out.println("Balance: " + acc.getBalance());
    }
}


✅ Encapsulation = Data Security + Controlled Access

2) Abstraction

Hiding the implementation details and showing only essential features to the user.

Achieved using abstract classes and interfaces.

👉 Example (Abstract Class)

abstract class Shape {
    abstract void draw(); // abstract method
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape s = new Circle(); // upcasting
        s.draw(); // Output: Drawing Circle
    }
}


✅ Abstraction = Hiding "how", showing only "what"

3) Inheritance

Mechanism where one class (child/subclass) can acquire the properties and methods of another class (parent/superclass).

Promotes code reusability.

Achieved using the extends keyword.

👉 Example

class Animal {
    void eat() {
        System.out.println("This animal eats food");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();  // inherited method
        d.bark(); // child class method
    }
}


👉 Output

This animal eats food
Dog barks


✅ Inheritance = Reuse + Extend existing code

4) Polymorphism

Means “many forms”.

A method can perform different actions based on context.

Two types:

Compile-time (Method Overloading)

Runtime (Method Overriding)

a) Method Overloading (Compile-time Polymorphism)

Same method name with different parameter lists.

class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(5, 10));    // 15
        System.out.println(c.add(5.5, 6.5)); // 12.0
    }
}

b) Method Overriding (Runtime Polymorphism)

Child class provides a specific implementation of a parent class method.

class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog(); // upcasting
        a.sound();  // Output: Dog barks
    }
}


✅ Polymorphism = One interface, multiple implementations

Conclusion

Class = Blueprint / Template.

Object = Instance of a class (real-world entity).

Java supports Encapsulation, Abstraction, Inheritance, and Polymorphism, which make code modular, reusable, secure, and easy to maintain.