// 2. InputMismatchException

// 👉 Ask the user to enter an integer. If the user enters text instead, catch the exception.

// // Expected
// Enter an integer: abc
// java.util.InputMismatchException caught
import java.util.Scanner;
import java.util.*;
class Test{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int i = 0;
        try{
            System.out.print("Enter an interzer : ");
             i = sc.nextInt();
             System.out.print("You entered "+i);
        }catch(InputMismatchException e){
            System.out.println("Java.util.InputMismatchException caught");
        }        
        
    }
}