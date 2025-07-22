import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        //1234  => 4321
        int reverse = 0;
        int temp = n;
        while(temp > 0){
            int lastDigit = (temp % 10);
            reverse = reverse * 10 + lastDigit;
            temp = temp/10;
            
        }
        System.out.println("Reverse of number = "+ reverse);
    }
}