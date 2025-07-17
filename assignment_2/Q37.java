import java.util.Scanner;

 class Test{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter volume");
    float v = sc.nextFloat();

    System.out.println("Enter radius");
    int r = sc.nextInt();

    double h = v/3.14*r*r;
    double surfaceArea = 2*3.14*r*(h+r);
    
    System.out.println(surfaceArea);
    }
}