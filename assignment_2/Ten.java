import java.util.Scanner;

public class Ten {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the one side of right angled triangle ");
        float a = sc.nextFloat();
        float area = (float)0.5*a*a;
        System.out.println("Area is : "+area);
    }
}
