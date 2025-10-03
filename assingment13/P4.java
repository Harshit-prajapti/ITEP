// WAP To enter name of user and check whether it valid name or not.
import java.util.Scanner;
import java.lang.Exception;
class NameException extends Exception{
    public NameException(String msg){
        super(msg);
    }
}
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you NAME : ");
        String name = sc.nextLine();
        boolean flage = false;
        char[] arr = name.toCharArray();
        for(int i = 0; i<arr.length; i++){
            if(Character.isDigit(arr[i])){
                flage = true;
                break;
            }
        }
        if(flage) System.out.println("Invalid name");
        else System.out.println("Valid Name");

    }
}