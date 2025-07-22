// 9 99 999 9999-------
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = sc.nextInt();
        int term = 9;
        int multiply = 1;
        int i=1; 
        while(i<=n){
            System.out.print(term+" ");
            multiply = multiply * 90;
            term += multiply;
            i++;
        }
    }
}