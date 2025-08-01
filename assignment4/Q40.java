import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int even = 0;
        int odd = 0;
        while(num != 0){
            int digit = num % 10;
            num /= 10;
            if(digit % 2 == 0)
                even += 1;
            else odd += 1;
        }
        System.out.println("Even : "+even);
        System.out.println("Odd : "+odd);
    }
}