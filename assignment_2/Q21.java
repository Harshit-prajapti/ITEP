import java.util.Scanner;

public class Q21 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the length of the cube : ");
        double l = sc.nextDouble();
        System.out.println("Enter the Breadth of the triangle ");
        double b = sc.nextDouble();
        System.out.println("Enter the length of the cube : ");
        double h = sc.nextDouble();
        double cuboit_vol = l*b*h;
        System.out.println("Enter the length of the wall : ");
        double w_l = sc.nextDouble();
        System.out.println("Enter the Breadth of the wall ");
        double w_b = sc.nextDouble();
        System.out.println("Enter the Breadth of the wall ");
        double w_h = sc.nextDouble();
        double wol_vol = w_l * w_b * w_h;
        double num = wol_vol/cuboit_vol;
        System.out.println(num);
    }
}
