
// 8. Modify the above question to allow student to sit if he/she has medical cause. 
// Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.
import java.util.Scanner;
public class Q8 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Have you any metdical cause if yes enter just Y and if not enter N");
        String input = sc.nextLine();
        char ch = (char)input.charAt(0);
        if(ch != 'Y' && ch != 'N'){
            System.out.println("Invlid input");
        }
        if(ch == 'Y')
            System.out.println("You are now elegiable to sit in exam");
        else 
            System.out.println("You are not eligiable to sit in exam");
        
    }
}
