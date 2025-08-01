import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter The terms : ");
        int n = sc.nextInt();
        char capital = 'A';   
        char small = 'a';
        
        int i=1;
        while(i<=n){
            if(i%2!=0){
                System.out.print(capital+" ");
            }
            else{
                System.out.print(small+" ");
            }
            capital++;
            small++;
            i++;
        }
    }
}