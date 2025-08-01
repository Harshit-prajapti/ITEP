import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int mainNum = num;
        int sum = 0;
        while(num != 0){
            int digit = num % 10;
            num = num/10;
            int mul = 1;
            while(digit != 1){
                mul = mul * digit ;
                digit--;
            }
            sum = sum + mul;
        }
        if(sum == mainNum)
            System.out.println("It is a strong !");
        else 
            System.out.println("Entered Number is not strong !");
    }
}