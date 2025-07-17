import java.util.Scanner;

public class Q15 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the triangle : ");
        int length = sc.nextInt();
        System.out.println("Enter the Breadth of the triangle ");
        int breadth = sc.nextInt();
        System.out.println("Enter the side of the squre garden");
        double side = sc.nextDouble();
        double areaOfSqure = side * side;
        double areaOfRectange = length * breadth;
        double diff = areaOfSqure - areaOfRectange;
        if(diff > 0){
            System.out.println("Squre garden is bigeer");
        }else {
            System.out.println("Rectangle is bigger");
        }
        System.out.println("The difference is : "+diff);
    }
}
