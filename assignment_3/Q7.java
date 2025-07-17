import java.util.Scanner;
public class Q7 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you Number of class held : ");
        int total = sc.nextInt();
        System.out.println("Enter you attendence : ");
        int attendence = sc.nextInt();
        if(attendence<0){
            System.out.println("Invalid input");
        }

        int per = (int)(total * (75.0/100.0));
        if (per > attendence)
            System.out.println("You are not aligiable to sit in this exam");
        else 
            System.out.print("You are eligiable");

    }
}
