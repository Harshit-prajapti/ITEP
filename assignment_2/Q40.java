import java.util.Scanner;

 class Test{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter diameter");
    float d = sc.nextFloat();
    float r = d/2;

    System.out.println("Enter height");
    int h = sc.nextInt();

    double vol = 3.14*r*r*h;
    
    System.out.println(vol);
    }
}