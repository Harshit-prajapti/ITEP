import java.util.Scanner;

public class Q20 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the length of the cube : ");
        double l = sc.nextDouble();
        System.out.println("Enter the Breadth of the triangle ");
        double b = sc.nextDouble();
        System.out.println("Enter the length of the cube : ");
        double h = sc.nextDouble();
        double cuboit_vol = l*b*h;
        System.out.println("cube vol is greater : "+cuboit_vol);
    }
}
