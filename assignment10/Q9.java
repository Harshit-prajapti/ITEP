Q9) What is Singleton Class?

A Singleton class in Java is a class that allows only one object (instance) to be created for the entire JVM.

In other words, no matter how many times you try to create an object, only one instance will be returned.

Singleton is used when we want to control object creation and ensure a single point of access to that object.

Key Features of Singleton Class

Private Constructor → prevents direct instantiation from outside the class.

Private Static Instance → stores the only object of the class.

Public Static Method (getter method, often named getInstance()) → provides the global access point to the instance.

Ensures memory efficiency and avoids duplicate object creation.

Why do we need Singleton?

When a single resource should be shared across the application.

Examples:

Database connection pool

Logger utility (log files)

Configuration settings

Thread pools

Cache managers

Example of Singleton Class
// Singleton Class
class Singleton {
    // 1. Private static instance of the class
    private static Singleton singleInstance;

    // 2. Private constructor (so no one can create object using new keyword)
    private Singleton() {
        System.out.println("Singleton instance created!");
    }

    // 3. Public static method to provide access to the instance
    public static Singleton getInstance() {
        if (singleInstance == null) {
            singleInstance = new Singleton(); // create only once
        }
        return singleInstance;  // return the same object every time
    }

    // Example method
    public void showMessage() {
        System.out.println("Hello! I am a Singleton object.");
    }
}

// Testing Singleton
public class Main {
    public static void main(String[] args) {
        // Try to create multiple objects
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();

        obj1.showMessage();

        // Checking if all objects are same
        System.out.println("obj1 hashcode: " + obj1.hashCode());
        System.out.println("obj2 hashcode: " + obj2.hashCode());
        System.out.println("obj3 hashcode: " + obj3.hashCode());
    }
}

Output
Singleton instance created!
Hello! I am a Singleton object.
obj1 hashcode: 12345678
obj2 hashcode: 12345678
obj3 hashcode: 12345678


👉 Notice that although we called getInstance() three times, only one object was created (same hashcode).

Summary

Singleton class → ensures only one object is created.

Steps → private constructor + private static instance + public static getInstance().

Use cases → logging, database connections, configuration, cache, etc.

Ensures controlled access and saves memory.