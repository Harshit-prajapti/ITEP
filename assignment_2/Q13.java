import java.util.Scanner;

public class Q13 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Hypo of the triange : ");
        int hypo = sc.nextInt();
        System.out.println("Enter the area of the traingle : ");
        int area = sc.nextInt();
        int base = (area*2)/hypo;
        System.out.println(base);

    }
}
