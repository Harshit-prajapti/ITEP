import java.util.Scanner;

public class Q21 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        double first = sc.nextDouble();
        System.out.println("Enter the second number : ");
        double second = sc.nextDouble();
        if(first == second){
            System.out.println("Both numbers are equel");
        } else
        if(first > second){
            System.out.println("The first number is greater than second");
        }else {
             System.out.println("The second number is greater than first");
        }
    }
}
