import java.util.Scanner;

public class Q18 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        double first = sc.nextDouble();
        System.out.println("Enter the second number : ");
        double second = sc.nextDouble();
        double third;
        third = first; 
        first = second ;
        second = third;
        System.out.println("After swaping the value of variable using this variable first is "+first+" and second is : "+second);
        System.out.println("Enter again values for swappint without third variable : ");
        first = sc.nextDouble();
        second = sc.nextDouble();
        first = first + second;
        second = first - second;
        first = first - second;
        System.out.println("After swaping the value of variable without using another variable first is "+first+" and second is : "+second);

    }
}
