import java.util.Scanner;

public class Q13 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number according to the day : ");
        int num = sc.nextInt();
        if(num == 1){
            System.out.println("Sunday");
        }
        else if(num == 2){
            System.out.println("Monday");
        }
        else if(num == 3){
            System.out.println("Tuseday");
        }
        else if(num == 4){
            System.out.println("Wednesday");
        }
        else if(num == 5){
            System.out.println("Thursday");
        }
        else if(num == 6){
            System.out.println("friday");
        }
        else if(num == 7){
            System.out.println("Saterday");
        }else{
            System.out.println("Invalid Input");
        }    

        

    }
}
