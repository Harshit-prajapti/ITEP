import java.util.Scanner; 
public class Q29 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        double num1, num2, num3, num4; 
        double lowestNumber; 
        System.out.println("Enter four different numbers:");
        System.out.print("Enter first number: ");
        num1 = input.nextDouble();
        System.out.print("Enter second number: ");
        num2 = input.nextDouble();
        System.out.print("Enter third number: ");
        num3 = input.nextDouble();
        System.out.print("Enter fourth number: ");
        num4 = input.nextDouble();
        lowestNumber = num1;
        if (num2 < lowestNumber) {
            lowestNumber = num2;
        }
        if (num3 < lowestNumber) {
            lowestNumber = num3;
        }
        if (num4 < lowestNumber) {
            lowestNumber = num4;
        }

        System.out.println("The lowest number among given numbers is: " + lowestNumber);
    }
}