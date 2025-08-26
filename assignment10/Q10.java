Q10) What is Method Overloading?

Method Overloading in Java is a feature that allows a class to have more than one method with the same name but different parameter lists (different type, number, or order of parameters).

👉 The compiler decides which method to call based on the method signature (name + parameter list).
👉 This is also called Compile-Time Polymorphism or Static Polymorphism.

Rules for Method Overloading

Methods must have the same name.

Methods must differ in number of parameters, data type of parameters, or sequence of parameters.

Return type alone cannot distinguish overloaded methods.

Example of Method Overloading
class MathOperation {
    // Overloaded methods with different parameter types
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    // Overloaded method with different number of parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method with different sequence of parameters
    public String add(String a, int b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        MathOperation obj = new MathOperation();

        System.out.println("Sum of two int: " + obj.add(5, 10));
        System.out.println("Sum of two double: " + obj.add(5.5, 10.5));
        System.out.println("Sum of three int: " + obj.add(1, 2, 3));
        System.out.println("String + int: " + obj.add("Value = ", 100));
    }
}

Importance of Method Overloading

Improves Readability → Same method name is used for similar tasks.

Example: print() in Java can print int, double, char, string etc.

Code Reusability → Reduces duplication of code for similar operations.

Flexibility → A method can be called with different argument types and numbers.

Polymorphism → Demonstrates compile-time polymorphism in OOP.

Can we overload the main method in Java?

✅ Yes, we can overload the main method.

Java allows multiple main methods with different parameter lists.

BUT → Only public static void main(String[] args) is the actual entry point for the JVM.

Other overloaded versions can be called explicitly from inside the original main method.

Example: Overloading main()
public class MainOverload {

    // Original main method (entry point)
    public static void main(String[] args) {
        System.out.println("Original main method called");

        // Calling overloaded versions manually
        main(100);
        main("Hello Java");
    }

    // Overloaded main with int parameter
    public static void main(int a) {
        System.out.println("Overloaded main with int: " + a);
    }

    // Overloaded main with String parameter
    public static void main(String str) {
        System.out.println("Overloaded main with String: " + str);
    }
}

Output
Original main method called
Overloaded main with int: 100
Overloaded main with String: Hello Java

✅ Summary

Method Overloading → same method name, different parameter list.

Importance → readability, reusability, flexibility, polymorphism.

Yes, main() can be overloaded but JVM always calls the original main(String[] args) as entry point. Other overloaded main methods can be invoked manually.