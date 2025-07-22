import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        //1234
        int count = 0;
        int temp = n;
        while(temp > 0){
            count++;
            temp = temp/10;
        }
        System.out.println("Number of digits = "+ count);
    }
}