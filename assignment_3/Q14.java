
import java.util.Scanner;
public class Q14 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your percentages : ");
        double per = sc.nextDouble();
        if(per < 0){
            System.out.println("Invalid Input");
        }else{
            if(per > 90){
                System.out.println("A");
            }
            else if (per > 80 && per <= 90){
                System.out.println("B");
            }
            else if ( per <= 80 && per >= 60){
                System.out.println("C");
            }
            else {
                System.out.println("D");
            }
        }
    }
}
