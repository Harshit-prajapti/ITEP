import java.util.Scanner;

public class Q30 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the tile in cm ");
        double l = sc.nextDouble();
        System.out.println("Enter the bridth of the tile in cm ");
        double b = sc.nextDouble();
        double area = l * b;
         System.out.println("Enter the length of the room in cm ");
        l = sc.nextDouble();
        System.out.println("Enter the bridth of the room in cm ");
        b = sc.nextDouble();
        double room_area = l * b;
        double num = room_area/area;
        System.out.println(num);
    }
}
