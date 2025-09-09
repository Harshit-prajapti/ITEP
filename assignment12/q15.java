// 5. ATM PIN Validatio
// If the user enters a wrong PIN 3 times, throw a custom exception AccountLockedException
// Which exception handling mechanism will you use?
// Should it be checked (force the programmer to handle) or unchecked?
import java.util.Scanner;
class AccountLockedException extends Exception{
    public AccountLockedException(){
        super("Sorry! You exced the limit \n so your account is locked for today");
    }
}
class WrongPinException extends Exception{
    public WrongPinException(int chance){
        super("Oops! wrong pin only "+chance+" chances are left");
    }
}
class ATM{
    private int pin;
    private int balance;
    public ATM(int balance,int pin){
        this.balance = balance;
        this.pin = pin;
    }
    public void currentBalance(){
        System.out.println("Now current balance is : "+balance);
    }
    public void withdraw(){
        Scanner sc = new Scanner(System.in);
        int amt;
        System.out.println("Enter the amount to withdraw ");
        amt = sc.nextInt();
        int limit = 3;
        try{        
            while(true){
            if(limit == 0) throw new AccountLockedException();
            limit--;
            System.out.println("Enter PIN : ");
            int pin = sc.nextInt();
            try{
                if(pin != this.pin){
                throw new WrongPinException(limit);
                }
            }catch(WrongPinException w){
                w.printStackTrace();
                continue;
            } 
            balance -= amt;
            System.out.println("Money withdraw successfully Thank You !");
            currentBalance();
            break;
        }
    }catch(AccountLockedException e){
        e.printStackTrace();
    }
        
    }
}
class Test{
    public static void main(String args[]){
        ATM icici = new ATM(5000,123);
        icici.withdraw();
    }
}