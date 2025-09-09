// 1. Divide by Zero Exception

// 👉 Write a program that takes two numbers from the user and divides them. Handle the case where the second number is zero.

// // Expected
// Enter first number: 10
// Enter second number: 0
// java.lang.ArithmeticException caught: / by zero
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numerator : ");
        int num = sc.nextInt();
        System.out.print("Enter the denominator : ");
        int den = sc.nextInt();
        try{
            int result = num/den;
            System.out.println("The result is : "+result);
        }catch(ArithmeticException e){
            e.printStackTrace();
        }
    }
}
