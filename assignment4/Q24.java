import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        //0 4 16 36 64-------
        int even = 0;
        int i=1; 
        while(i<=n){
            System.out.print(even*even+" ");
            even = even + 2;
            i++;
        }
    }
}