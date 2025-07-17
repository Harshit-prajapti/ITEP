import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter cost price=");
        int cp=sc.nextInt();
        System.out.print("enter selling price=");
        int sp=sc.nextInt();
        int res = sp - cp;
        if(res<0){
            System.out.println("You have loss of "+(cp-sp));
        }else 
            System.out.println("You have profit of "+(sp-cp));
            
    }
}