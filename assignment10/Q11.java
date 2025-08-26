Q11) How to pass as many arguments to a Java method?

👉 In Java, if we want a method to accept any number of arguments, we use Varargs (Variable-length arguments).

Introduced in Java 5.

Syntax:

returnType methodName(dataType... variableName) { }

Key Points about Varargs

Written as dataType... variableName.

Inside the method, Varargs is treated like an array.

A method can have only one varargs parameter.

If there are multiple parameters, the varargs must be the last one.

Example: Sum of any number of integers
class Calculator {
    // method with varargs
    public int sum(int... numbers) {
        int total = 0;
        for (int n : numbers) {
            total += n;
        }
        return total;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Sum of 2 numbers: " + calc.sum(10, 20));
        System.out.println("Sum of 5 numbers: " + calc.sum(1, 2, 3, 4, 5));
        System.out.println("Sum of no numbers: " + calc.sum()); // 0
    }
}

Output
Sum of 2 numbers: 30
Sum of 5 numbers: 15
Sum of no numbers: 0

Another Example: Varargs with normal parameter
class Greeting {
    public void sayHello(String message, String... names) {
        for (String name : names) {
            System.out.println(message + " " + name);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Greeting g = new Greeting();

        g.sayHello("Hello", "Harshit", "Aman", "Riya");
        g.sayHello("Welcome", "Java");
    }
}

Output
Hello Harshit
Hello Aman
Hello Riya
Welcome Java

✅ Summary

Use Varargs (...) to pass as many arguments as needed.

Varargs is treated like an array inside the method.

Only one varargs per method and it must be the last parameter.