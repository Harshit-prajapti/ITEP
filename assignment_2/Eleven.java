import java.util.Scanner;

public class Eleven {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first element of the ratio : ");
        int a = sc.nextInt();
        System.out.println("Enter the last element of the ratio : ");
        int b = sc.nextInt();
        System.out.println("Enter the area of the Triangel : ");
        double area = sc.nextDouble();
        double fect = (320*2)/(a*b);
        double x = (double)Math.sqrt(fect);
        double length = a*x;
        double breadth = b * x;
        System.out.println(length);
        System.out.println(breadth);

    }
}
