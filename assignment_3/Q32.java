import java.util.Scanner;

class Test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number  : ");
        int num = sc.nextInt();

        if(num < 0){
            System.out.println("invalid input");
        }
        char ch = (char)num;
        System.out.println(ch);
    }
}
