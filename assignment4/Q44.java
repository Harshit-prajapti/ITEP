import java.util.Scanner;
class Test{
    public static void main(String args[]){
        System.out.print("Enter a Number to Check : ");
        Scanner sc = new Scanner(System.in);
        int numO = sc.nextInt();
        int num = numO;
        int dig = 0;
        int tens = 1;
        int digit = num % 10;
        while(num != 0){
            tens = tens * 10;

            num /= 10; 
        }
        System.out.println(tens);

    }
}