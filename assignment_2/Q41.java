import java.util.Scanner;
  class Test{
    public static void main(String args[]){
      Scanner sc= new Scanner(System.in);  

     System.out.println("Enter diameter");
     double dia = sc.nextDouble();
     double r = dia/2;

     System.out.println("Enter height");
     double h = sc.nextDouble();

     double vol = 3.14*r*r*h;
     System.out.println(vol);
    }
  }