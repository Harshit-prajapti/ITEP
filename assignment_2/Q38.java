import java.util.Scanner;

 class Test{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter diameter");
    float dia = sc.nextFloat();
    float r = dia/2;

    System.out.println("Enter height");
    int h = sc.nextInt();

    double area = 2*3.14*r*(r+h);
    
    System.out.println(area);
    }
}