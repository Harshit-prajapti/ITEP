import java.util.Scanner;

public class Q35 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radious of the ");
        double r = sc.nextDouble();
        System.out.println("Enter the heigt of the ");
        double h = sc.nextDouble();
        double area = 2 * 3.14 * r * h + 2 * 3.14 * r * r;
        System.out.println(area);
    }
}
