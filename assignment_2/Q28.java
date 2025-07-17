import java.util.Scanner;

public class Q28 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the length of the path in cm : ");
        double l = sc.nextDouble();
        System.out.println("Enter the width of the path in cm ");
        double b = sc.nextDouble();
        double area = l * b;
        double totalPrice = area * 205;
        System.out.println(totalPrice);
    }
}
