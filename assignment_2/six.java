import java.util.Scanner;
public class six {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first side of triangle : ");
        double first = sc.nextDouble();
        System.out.println("Enter the second side of triangle : ");
        double second = sc.nextDouble();
        System.out.println("Enter the peri of triangle : ");
        double peri = sc.nextDouble();   
        double c = peri-(first + second);
        double s = peri/2;
        double area = Math.sqrt(s*(s-first)*(s-second)*(s-c));
        System.out.println("Area is " +area);

    }
}
