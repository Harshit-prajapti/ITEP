import java.util.Scanner;

class Test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter terms : ");
        int n = sc.nextInt();
        int first = 0;
        int second = 1;
        int i = 1;
        System.out.print(first + " ");
        System.out.print(second + " ");

        while ( i <= n-2) {
            int sum  = first + second;
            System.out.print(sum + " ");
            first = second ; 
            second = sum;
            i++;
        }
    }
}
