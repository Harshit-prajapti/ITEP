30 // 29)  1 + 11	+ 111 + 1111 + 1111-------
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = sc.nextInt();
        int term = 1;
        int multiply = 1;
        int sum = 0;
        int i=1; 
        while(i<=n){
            System.out.print(term+" ");
            multiply = multiply * 10;
            term += multiply;
            sum += term;
            i++;
        }
        System.out.println("sum = " +sum);
    }
}