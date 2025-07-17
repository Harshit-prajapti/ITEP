import java.util.Scanner;

public class Q24 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        if(num == 0){
            System.out.println("Entered number is nither +ve nor -ve");
        }else{
            if(num > 0)
                System.out.println("Number is +ve");
            else {
                System.out.println("Number is -ve");
            }
        }
        
    }
}
