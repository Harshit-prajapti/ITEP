Q12) Can we overload the method with var-arg type of argument?

✅ Yes, we can overload a method with var-arg parameters.
But the compiler applies method resolution rules (priority).

Rules of Overloading with Varargs

Exact match is always preferred
If a method matches with fixed arguments, the compiler will call that, instead of the varargs one.

If no exact match, varargs method is chosen
The varargs method works as a "fallback".

Overloading with different parameter types is allowed
e.g., sum(int... numbers) vs sum(double... numbers)

Example 1: Overloading with Normal and Varargs
class Example {
    void display(int a, int b) {
        System.out.println("Normal method: " + a + ", " + b);
    }

    void display(int... numbers) {
        System.out.println("Varargs method: ");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Example obj = new Example();

        obj.display(10, 20);          // Calls normal method
        obj.display(10, 20, 30, 40);  // Calls varargs method
        obj.display();                // Calls varargs method
    }
}

Output
Normal method: 10, 20
Varargs method: 
10 20 30 40 
Varargs method: 

Example 2: Overloading with Different Data Types
class Printer {
    void print(String... values) {
        System.out.println("String varargs method");
    }

    void print(int... values) {
        System.out.println("Integer varargs method");
    }
}

public class Main {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.print(1, 2, 3);        // Integer varargs method
        p.print("A", "B", "C");  // String varargs method
    }
}

⚠️ Ambiguity Problem

If you try to overload with only Object... and String..., the compiler may get confused:

class Test {
    void show(Object... obj) {
        System.out.println("Object varargs");
    }
    void show(String... str) {
        System.out.println("String varargs");
    }
}

public class Main {
    public static void main(String[] args) {
        Test t = new Test();
        // t.show("Hello");  // ❌ Compiler Error: Ambiguous
    }
}


Here "Hello" could match both Object... and String..., so it’s ambiguous.

✅ Summary

Yes, we can overload methods with varargs.

Exact match is preferred over varargs.

Overloading with different data types is valid.

Be careful: ambiguous calls may occur.