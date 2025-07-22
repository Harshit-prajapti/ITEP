// z y x w v u--- b c a	…… n terms 
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        char alphabet = 'Z';
        
        int i=1;
        while(i<=26){
            System.out.print(alphabet+" ");
            alphabet--;
            i++;
        }
    }
}