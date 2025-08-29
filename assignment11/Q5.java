interface LoanEligible{
    void checkLoanEligibility();
} 
abstract class BankAccount{
    private int accountNumber;
    private float balance;
    public BankAccount(int accountNumber, float balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public float getBalance(){
        return balance;
    }
    public void setBalance(float balance){
        this.balance = balance;
    }
    abstract public void deposit(float amount);
    abstract public void withdraw(float amount);
    public void showBalance(){
        System.out.println("Balance is : "+balance);
    }
}
class SavingAccount extends BankAccount implements LoanEligible{
    public SavingAccount(int accountNumber, float balance){
        super(accountNumber,balance);
    }
    public void checkLoanEligibility(){
        System.out.println("You are eligible ot loan");
    }
    public void deposit(float amount){
        setBalance(getBalance() + amount);
    }
    public void withdraw(float amount){
        setBalance(getBalance()-amount);
    }
}
class CurrentAccount extends BankAccount implements LoanEligible{
    public CurrentAccount(int accountNumber, float balance){
        super(accountNumber,balance);
    }
    public void checkLoanEligibility(){
        System.out.println("You are not eligible to loan");
    }
    public void deposit(float amount){
        setBalance(getBalance() + amount);
    }
    public void withdraw(float amount){
        setBalance(getBalance()-amount);
    }
}
class Test{
    public static void main(String args[]){
        BankAccount a1 = new SavingAccount(121,5600.5f);
        a1.showBalance();
        a1.deposit(100f);
        a1.showBalance();
        a1.withdraw(700.5f);
        a1.showBalance();
    }
}