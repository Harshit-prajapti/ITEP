import java.util.Scanner;
class Test {
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number  : ");
        int num = sc.nextInt();
        int quesent = num / 2;
        double res = num / 2.0;
        if(num == 0){
            System.out.println("Numer is Nutral");
        } else
        if(res == quesent ){
            System.out.println("Even Number");
        }else
            System.out.println("Odd Number");
    }
}
