import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double side1, side2, side3;
        System.out.println("Enter the lengths of the three sides of the triangle:");
        System.out.print("Enter side 1: ");
        side1 = input.nextDouble();
        System.out.print("Enter side 2: ");
        side2 = input.nextDouble();
        System.out.print("Enter side 3: ");
        side3 = input.nextDouble();
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            System.out.println("Invlid input");
        }else {
            if (side1 == side2 && side2 == side3) {
                System.out.println("The triangle is Equilateral.");
            } else if (side1 == side2 || side1 == side3 || side2 == side3) {
                System.out.println("The triangle is Isosceles.");
            } else {
                System.out.println("The triangle is Scalene.");
            }
        }
    }
}