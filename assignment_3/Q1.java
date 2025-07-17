//1. Take values of length and breadth of a rectangle from user and check if it is square or not.
import java.util.Scanner;
public class Q1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle : ");
        double len = sc.nextDouble();
        System.out.println("Enter the breadth of the rectangle : ");
        double bri = sc.nextDouble();
        if(len == bri){
            System.out.println("It is a squre");
        }else {
            System.out.println("It is not a squre");
        }
    }
     
}
