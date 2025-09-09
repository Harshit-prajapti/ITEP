// 5. Multiple Catch Blocks

// 👉 Take two integers and perform division. Handle both ArithmeticException and InputMismatchException separately.
import java.util.Scanner;
import java.util.*;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        try{
            int num,den;
            System.out.print("Enter the numerator : ");
            num = sc.nextInt();
            System.out.print("Enter the denominator : ");
            den = sc.nextInt();
            System.out.println("Result of divison is : "+num/den);
        }catch(ArithmeticException e){
            System.out.println("Division by zero not allowed");
        }catch(InputMismatchException e){
            System.out.println("Only Intezers are allowed for this operation");
        }
        System.out.println("--------------------- End -------------------------");
    }
}