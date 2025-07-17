import java.util.Scanner;

public class Q23 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the side of the cube : ");
        double side = sc.nextDouble();
        double cube_vol = side * side * side;
        double cuboit_vol = 15*9*12;
        double num = (double)cuboit_vol / cube_vol;
        System.out.println(num);
    }
}
