import java.util.Scanner;

public class Q36 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the diameter of the cylinder ");
        double dia = sc.nextDouble();
        double r = dia/2;
        System.out.println("Enter the height of the cylinder ");
        double h = sc.nextDouble();
        double area = (2*3.14*r*h)-(2*3.14*r*r);
        System.out.println(area);
    }
}
