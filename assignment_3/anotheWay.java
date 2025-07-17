import java.util.Scanner;

class qq14{
    public static void main (String args[]){
     Scanner sc =  new Scanner (System.in);
     int i , j , k , l;
     System.out.println("enter the values of number ");
     i = sc.nextInt();
     j = sc.nextInt();
     k = sc.nextInt();
     l = sc.nextInt();
     if((i>j) || (i>k) || (i>l))
      System.out.println("frist number is grester ");
     else if ((j>k) || (j>l))
      System.out.println("second number is grester ");
     else if (l>k)
      System.out.println("third number is grester ");
      else
      System.out.println("fourth number is grester ");
    }
}