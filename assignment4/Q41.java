import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter another Number : ");
        int num2 = sc.nextInt();
        if(num1 == num2){
            System.out.print(num1)
        }else{        
        int big = 0;
        int small = 0;
        if(num1 > num2){
            big = num1;
            small = num2;
        }else{
            big = num2;
            small = num1;
        } 
        int i = 1;
        while(big*i % small != 0){
            i++;
        }
        System.out.println(big*i);
        }
    }
}