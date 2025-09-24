// WAP To enter name of user and check whether it valid name or not.
import java.util.Scanner;
class NameException extends Exception{
    public NameException(String msg){

    }
}
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you NAME : ");
        String name = sc.nextLine();
        boolean flage = false;
        try{
            Integer.parseInt(name);
            System.out.println(name);
        }catch(NumberFormateException e){
            System.out.println("Invalid User Name");
        }
    }
}