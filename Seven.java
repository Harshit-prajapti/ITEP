import java.util.Scanner;
public class Seven {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the base of the Triangel : ");
    double base = sc.nextDouble();
    System.out.println("Enter the area of the Triangel : ");
    double area = sc.nextDouble();
    double height = (area/(0.5f * base));
    System.out.println("height is : "+height);
    } 
}
