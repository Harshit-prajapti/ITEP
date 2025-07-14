import java.util.Scanner;
public class First{   
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the peremter of the ractangle : ");
        int peri = sc.nextInt();
        System.out.println("Enter the length of the rectange : ");
        int len = sc.nextInt();
        int totalLength = len * 2;
        int breadth = (peri - totalLength)/2;
        int area = len*breadth;
        System.out.println("Area of rectange is : "+area);

    }
}