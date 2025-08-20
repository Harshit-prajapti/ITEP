import java.util.ArrayList;
class Bank{
    ArrayList<Account> al = new ArrayList<Account>(); //10 in size by default
    public void addAccount(Account ac){
        al.add(ac);
    }
    public void removeAccount(Account ac){
        al.remove(ac);
    }
    public void getAllData(){
        for(Account a : al){
            a.printAllDetails();
        }
    }
}
class Account{
    String hoderName;
    String ContactNumber;
    String Balance;
    public Account(String hoderName, String ContactNumber, String Balance){
        this.hoderName = hoderName;
        this.ContactNumber = ContactNumber;
        this.Balance = Balance;
    }
    public void printAllDetails() {
        System.out.println(hoderName + " : "+ContactNumber + " : "+ Balance);
    }
}
class Test{
    public static void main(String args[]){
        Account a1 = new Account("Harshit","9039140984","0.00001");
        Account a2 = new Account("Adarsh","7773434948","0.24");
        Account a3 = new Account("Sachine","03255348534","-45554");
        Bank boi = new Bank();
        boi.addAccount(a1);
        boi.addAccount(a2);
        boi.addAccount(a3);
        boi.getAllData();
    }
}