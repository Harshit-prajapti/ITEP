import java.util.Scanner;

public class Q26 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rem = num % 2;
        switch (rem) {
            case 0:
                System.out.println("Numer is even");
                break;
            default:
                System.out.println("Number is odd");        
        }
    }
}
