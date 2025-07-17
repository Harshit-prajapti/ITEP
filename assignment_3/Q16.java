import java.util.Scanner;

public class Q16 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radious of the circle ");
        double radious = sc.nextDouble();
        double pi = 3.14;
        double area = pi *radious * radious; 
        System.out.println("The Radious of the Circle is : "+area);
    }
}
