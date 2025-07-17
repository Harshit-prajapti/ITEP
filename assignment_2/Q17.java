import java.util.Scanner;

public class Q17 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangular : ");
        double l = sc.nextDouble();
        System.out.println("Enter the Breadth of the triangle ");
        double b = sc.nextDouble();
        double peri =2*(l + b);
        System.out.println("The perimeters is : "+peri);        
    }
}
