import java.util.Scanner;

public class Q12 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you the digit : ");
        int num = sc.nextInt();
        int result = 0;
        while (num != 0) {
            result = (result * 10) + num % 10;
            num = num /10;
        }
        System.out.println(result);
    }
}
