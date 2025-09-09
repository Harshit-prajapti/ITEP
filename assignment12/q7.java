// 7. Custom Exceptio
// 👉 Create your own exception InvalidAgeException. If age < 18, throw the exception.
// class InvalidAgeException extends Exception {
//     InvalidAgeException(String msg) {
//         super(msg);
//     }
// }
// Test in main:

// if(age < 18) throw new InvalidAgeException("Not eligible for voting");
import java.util.Scanner;
import java.util.*;
class InvalidAgeException extends Exception{
    InvalidAgeException(String msg){
        super(msg);
    }
}
class Test{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        try{
            if(age < 18) throw new InvalidAgeException("not eligible for voting");
            else System.out.println("Eligible for voting");
        }catch(InvalidAgeException e){
            e.printStackTrace();
        }
        
        
        System.out.println("------------------------------ End -----------------------------");
    }
}