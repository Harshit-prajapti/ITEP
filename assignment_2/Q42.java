import java.util.Scanner;
  class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Height");
        int h1 = sc.nextInt();

        System.out.println("Enter Slant Height");
        int h2 = sc.nextInt();

        System.out.println("Enter cost");
        int c = sc.nextInt();

        double radius = Math.sqrt((h2*h2)-(h1*h1));
        double area = 3.14*radius*radius;
        double costPolishing = area*10;

        System.out.println(costPolishing);


    }
  }