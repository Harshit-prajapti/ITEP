import java.util.Scanner;

public class Q29 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the squre : ");
        double side = sc.nextDouble();
        double area = side * side;
        System.out.println("Enter the length of the floor in cm ");
        double l = sc.nextDouble();
        System.out.println("Enter the bridth of the floor in cm ");
        double b = sc.nextDouble();
        double floor_area = l * b;
        double num = floor_area/area;
        System.out.println(num);
    }
}
