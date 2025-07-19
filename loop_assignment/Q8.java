 import java.util.Scanner;
 class Test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the terms : ");
        int n = sc.nextInt();
        int first = 1;
        int second = 2;
        int i = 1 ;
        System.out.print(i+" ");
        while (i<=n-1) {
            int third = first * second;
            System.out.print(third+" ");
            first = second;
            second = third; 
            i++;
        }
    }
}
