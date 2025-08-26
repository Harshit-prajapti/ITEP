import java.util.Scanner;

class Circle {
    private double radius;
    private double area;

    public void init() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        radius = sc.nextDouble();
    }

    public void calc() {
        area = Math.PI * radius * radius;  // Formula: πr²
    }

    public void display() {
        System.out.println("Radius of circle = " + radius);
        System.out.println("Area of circle = " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle();  // Create object

        c1.init();     // Take radius input
        c1.calc();     // Calculate area
        c1.display();  // Display result
    }
}
