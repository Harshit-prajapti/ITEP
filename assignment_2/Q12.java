import java.util.Scanner;
import java.lang.Math;
public class Q12 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Hypo of the triange : ");
        int hypo = sc.nextInt();
        System.out.println("Enter the length of the side that containing the right angle : ");
        int side = sc.nextInt();
        int mul = (int)(hypo * hypo)-(side * side);
        double base = Math.sqrt(mul);
        System.out.println(base);

    }
}
