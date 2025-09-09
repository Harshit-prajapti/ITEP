// 1. Banking System – Insufficient Balanc
// You are building a banking system. A user tries to withdraw more money than available in their account.
// Which exception would you throw? 
// Ans - i would thorw checked exception;
// Will you use a checked or unchecked exception? Why?
// i choosed checked exception because it forces to the calling method to right specific exception handling code 
// at the time of calling the with draw method so it will prevent out 
// Write a custom exception InsufficientBalanceException.
import java.util.Scanner;
class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(){
        super("Insuficient balance!");
    }
}
class Bank{
    private int balance;
    public Bank(int bal){
        this.balance = bal;
    }
    public void withdraw(int amt) throws InsufficientBalanceException{
        if(amt > balance) throw new InsufficientBalanceException();
        else{
            balance -= amt;
            System.out.println("Money withdraw success");
        }
    }
    public void currentBalance(){
        System.out.println("Current bank balance is : "+balance);
    }
}
class Test{
    public static void main(String args[]){
        Bank boi = new Bank(2000);
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter money to withdraw : ");
            int money = sc.nextInt();
            boi.withdraw(money);
            boi.currentBalance();
        }catch(InsufficientBalanceException e){
            e.printStackTrace();
        }
        System.out.println("------------------------ End ------------------------");

    }
}