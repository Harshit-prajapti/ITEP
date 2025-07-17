import java.util.Scanner;

public class Q26 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the length of the path in cm : ");
        double l = sc.nextDouble();
        System.out.println("Enter the Breadth of the path in cm ");
        double b = sc.nextDouble();
         System.out.println("Enter the lenth of the brick in cm: ");
        double brick_l = sc.nextDouble();
        System.out.println("Enter the Breadth of the brick in cm");
        double brick_w = sc.nextDouble();
        double path_area = l * b;
        double brick_area = brick_l * brick_w;
        double num = path_area/brick_area;
        System.out.println(num);
    }
}
