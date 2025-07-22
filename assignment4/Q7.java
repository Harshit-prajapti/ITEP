import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = scanner.nextInt();
        int half = n/2;
        int i = 2;
        int flage = 0;
        while(i<=half){
            if(n%i == 0)
            {
                flage = 1;
                break;
            }
            i++;
        }
        if(flage == 1){
            System.out.println("This is not a prime number ");
        }else 
            System.out.println("This is a prime number ");
    }
}