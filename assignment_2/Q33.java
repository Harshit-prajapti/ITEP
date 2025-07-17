import java.util.Scanner;

public class Q33 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the tile in cm ");
        double l = sc.nextDouble();
        System.out.println("Enter the bridth of the tile in cm ");
        double b = sc.nextDouble();
        System.out.println("Enter the width of the first path in cm ");
        double width = sc.nextDouble();
        System.out.println("Enter the length second path in cm ");
        double length = sc.nextDouble();
        double area = l * b;
        double ourLap = width * length;
        double a1 = l * length;
        double a2 = b * width;
        double path = a1 * a2 - ourLap;
        double u = area - path;
        System.out.println(u);        
    }
}
