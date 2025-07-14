import java.util.Scanner;

public class Nine {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the equilateral Triangel : ");
        double length = sc.nextDouble();
        System.out.println("height is : " + length);
        double fect = (double) 3 / 4;
        System.out.println("height is : " + fect);

        double area = (double)Math.sqrt(fect * (length * length));
        System.out.println("height is : " + area);
    }
}
