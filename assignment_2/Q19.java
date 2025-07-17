import java.util.Scanner;

public class Q19 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the cube : ");
        double cube_length = sc.nextDouble();
         System.out.println("Enter the length of the cube : ");
        double l = sc.nextDouble();
        System.out.println("Enter the Breadth of the triangle ");
        double b = sc.nextDouble();
        System.out.println("Enter the length of the cube : ");
        double h = sc.nextDouble();
        double cube_vol = cube_length * cube_length;
        double cuboit_vol = l*b*h;
        if(cube_vol > cuboit_vol){
            System.out.println("cube vol is greater");
        }else{
            System.out.println("Cuboid vol is greater");
        }
    }
}
