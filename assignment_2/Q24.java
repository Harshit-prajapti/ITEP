import java.util.Scanner;

public class Q24 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the length of the cube : ");
        double l = sc.nextDouble();
        System.out.println("Enter the Breadth of the triangle ");
        double b = sc.nextDouble();
        System.out.println("Enter the height of the cube : ");
        double h = sc.nextDouble();
        double vol = l * b* h;
        System.out.println("Enter the length of the cube : ");
        double w_l = sc.nextDouble();
        System.out.println("Enter the Breadth of the triangle ");
        double w_b = sc.nextDouble();
        System.out.println("Enter the height of the cube : ");
        double w_h = sc.nextDouble();
        double w_vol = w_b * w_h * w_l;
        double price = w_vol/vol;
        System.out.println("cube vol is greater : "+price);
    }
}
