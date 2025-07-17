import java.util.Scanner;

public class Q32 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the squre in cm ");
        double len = sc.nextDouble();
        double area = len * len;
        System.out.println("Enter the length of the pool in cm ");
        double pool_side = sc.nextDouble();
        double pool_area = pool_side * pool_side;
        double garden_area = area - pool_area;
        System.out.print(garden_area);
        
    }
}
