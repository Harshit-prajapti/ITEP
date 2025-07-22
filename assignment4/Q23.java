import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        //1 9 25 49 81-------
        int odd = 1;
        int i=1; 
        while(i<=n){
            System.out.print(odd*odd+" ");
            odd = odd + 2;
            i++;
        }
    }
}