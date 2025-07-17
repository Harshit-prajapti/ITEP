import java.util.Scanner;

public class Q22 {
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        double first = sc.nextDouble();
        System.out.println("Enter the second number : ");
        double second = sc.nextDouble();
        System.out.println("Enter the third number : ");
        double third = sc.nextDouble();
        if(first > second && first > third)
            System.out.println("First is greater");
        else if (second > third){
            System.out.println("Second is greater");
        } else
            System.out.println("Third is Greater");
   } 
}
