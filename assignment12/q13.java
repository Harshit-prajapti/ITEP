
// 3. Online Exam System
// A student enters their roll number (integer), but by mistake they enter "abc".
// Which exception will occur?
// How can you catch it and ask them to re-enter?
// Can you use a loop to keep asking until they enter valid input?
import java.util.Scanner;
import java.util.InputMismatchException;
class Exam{
    public void rollEntry(){
        Scanner sc = new Scanner(System.in);
        while(true){
            try{
                System.out.print("Enter your roll number : ");
                int rool = sc.nextInt();
                System.out.println("Thank you!");
                break;
            }catch(InputMismatchException e){
                System.out.println("Invalid input! Please enter a valid integer for the roll number.");
                sc.next(); 
            }
        }
        
    }
}
class Test{
    public static void main(String args[]){
        Exam e = new Exam();
        e.rollEntry();
    }
}