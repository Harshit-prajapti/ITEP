import java.util.Scanner;

public class Q20 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        double first = sc.nextDouble();
        System.out.println("Enter the second number : ");
        double second = sc.nextDouble();
        first = first + second;
        second = first - second;
        first = first - second;
        System.out.println("After swaping the value of variable without using another variable first is "+first+" and second is : "+second);

    }
}
