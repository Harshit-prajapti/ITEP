// Requirements:
// There are different types of payments (like CreditCard, UPI, NetBanking).
// Every payment method must implement a common behavior (like processPayment() and getPaymentStatus()), so you should use an interface Payment.
// Some payment methods have partial common implementation (like transaction ID generation, logging, basic validations),
// so you should create an abstract class AbstractPaymentProcessor that implements the interface partially and leaves specific logic to subclasses.
// Each payment method must:
// Extend the abstract class
// Implement the interface methods
import java.util.ArrayList;
class Account{
    ArrayList<Account> record = new ArrayList<Account>();
    private String accountHolderName;
    private int number;
    private float balance;
    public Account(String accountHolderName, int number, int balance){
        this.accountHolderName = accountHolderName;
        this.number = number;
        this.balance = balance;
    }
    public void add(String accountHolderName, int number, int balance){
        Account obj = new Account(accountHolderName,number,balance);
        record.add(obj);
    }
}
interface Payment {
    void processPayment();
    void getPaymentStatus();
}
class AbstractPaymentProcessor {
    public void checkBankBalance();
}
class CreditCard extends AbstractPaymentProcessor implements Payment{
    private int creditNumber;
}
class UPI extends AbstractPaymentProcessor implements Payment{
    private String upiId;
}
class NetBanking extends AbstractPaymentProcessor implements Payment{
    private int accountNumber;
}

class TestMain{
    public static void main(String args[]){

    }
}