import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter character");
        char character = sc.next().charAt(0);

        if((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')){
            System.out.println("It is an alphabet");
        }
        else{
           System.out.println("It is not an alphabet");
        }     
    }   
}