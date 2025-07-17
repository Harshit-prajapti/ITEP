import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter marks of physics");
        int pmarks=sc.nextInt();
         System.out.print("enter marks of chemistry");
        int cmarks=sc.nextInt();
         System.out.print("enter marks of biology");
        int bmarks=sc.nextInt();
         System.out.print("enter marks of Maths");
        int mathmarks=sc.nextInt();
         System.out.print("enter marks of Computer");
        int commarks=sc.nextInt();
        int total=pmarks+cmarks+bmarks+mathmarks+commarks;
        double percentage=(total/500.0)*100;
        System.out.println("total percentage="+percentage);
        if(percentage >= 90) 
        System.out.println(" Grade A");
         else if(percentage >= 80)
        System.out.println(" Grade B");
        else if(percentage >= 70)
        System.out.println(" Grade C");
        else if(percentage >= 60)
        System.out.println(" Grade D");
        else if(percentage >= 50) 
        System.out.println(" Grade E");
        else if(percentage <= 40) 
        System.out.println(" Grade F");
    }
}