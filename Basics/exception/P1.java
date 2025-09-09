import java.io.*;

// Custom checked exception (must be declared or caught)
class MyCheckedException extends Exception {
    public MyCheckedException(String message) {
        super(message);
    }
}

// Custom unchecked exception (RuntimeException → not checked at compile time)
class MyUncheckedException extends RuntimeException {
    public MyUncheckedException(String message) {
        super(message);
    }
}

// Parent class demonstrating overriding and throws rules
class Parent {
    // Declares checked exception
    void doWork() throws IOException {
        System.out.println("Parent: working...");
    }
}

class Child extends Parent {
    // ✅ Allowed: throws narrower exception (FileNotFoundException ⊂ IOException)
    @Override
    void doWork() throws FileNotFoundException {
        System.out.println("Child: working with file...");
    }

    // ❌ Not allowed: throws broader checked exception (e.g., Exception)
    // @Override
    // void doWork() throws Exception { } // Compile-time error
}

public class ExceptionDemo {
    // Method demonstrating checked exception with throws
    static void checkedExample() throws IOException {
        // FileReader constructor throws FileNotFoundException (checked)
        FileReader fr = new FileReader("missing.txt"); 
        fr.close();
    }

    // Method that throws a custom checked exception
    static void throwChecked() throws MyCheckedException {
        throw new MyCheckedException("This is a checked exception!");
    }

    // Method that throws an unchecked exception
    static void throwUnchecked() {
        throw new MyUncheckedException("This is an unchecked exception!");
    }

    // Demonstrating try-with-resources and suppressed exceptions
    static void tryWithResources() throws Exception {
        class MyResource implements AutoCloseable {
            private String name;
            MyResource(String name) { this.name = name; }
            public void use() throws Exception {
                System.out.println("Using resource: " + name);
                throw new Exception("Error while using " + name);
            }
            @Override
            public void close() throws Exception {
                System.out.println("Closing resource: " + name);
                throw new Exception("Error while closing " + name);
            }
        }

        try (MyResource r = new MyResource("TestResource")) {
            r.use();
        } catch (Exception e) {
            System.out.println("Caught: " + e.getMessage());
            // Display suppressed exceptions (from close())
            for (Throwable t : e.getSuppressed()) {
                System.out.println("Suppressed: " + t.getMessage());
            }
        }
    }

    // Demonstrating exception chaining (wrapping one exception in another)
    static void exceptionChaining() {
        try {
            throwChecked();
        } catch (MyCheckedException e) {
            throw new RuntimeException("Wrapping checked into unchecked", e);
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Checked Exception Example ===");
        try {
            checkedExample();
        } catch (IOException e) {
            System.out.println("Caught checked exception: " + e);
        }

        System.out.println("\n=== Custom Checked Exception ===");
        try {
            throwChecked();
        } catch (MyCheckedException e) {
            System.out.println("Caught custom checked: " + e.getMessage());
        }

        System.out.println("\n=== Unchecked Exception Example ===");
        try {
            throwUnchecked();
        } catch (MyUncheckedException e) {
            System.out.println("Caught unchecked exception: " + e.getMessage());
        }

        System.out.println("\n=== Finally Block Example ===");
        try {
            System.out.println("Inside try...");
            int x = 10 / 0; // ArithmeticException (unchecked)
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException");
        } finally {
            System.out.println("Finally always runs!");
        }

        System.out.println("\n=== Try-with-Resources & Suppressed Exception ===");
        try {
            tryWithResources();
        } catch (Exception e) {
            System.out.println("Outer catch: " + e.getMessage());
        }

        System.out.println("\n=== Exception Chaining Example ===");
        try {
            exceptionChaining();
        } catch (RuntimeException e) {
            System.out.println("Caught wrapped exception: " + e.getMessage());
            System.out.println("Original cause: " + e.getCause());
        }

        System.out.println("\n=== Overriding and Throws Rule ===");
        Parent p = new Child();
        try {
            p.doWork();
        } catch (IOException e) {
            System.out.println("Caught IOException from overridden method");
        }

        System.out.println("\nProgram finished.");
    }
}
