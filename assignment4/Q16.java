import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter term");
        int term = sc.nextInt();
        int i = term*(-1);
       
        
        while(i<=term){
            System.out.print(i + " ");
            i++;
        }
     }
}