class Account {
    private int accountNumber ;
    private String holderName;
    private float balance;
    public void setAccountNumber(int ac) {
        this.accountNumber = ac;
    }
    public void setHolderName(String name) {
        this.holderName = name;
    }
    public void setBalance(float ac) {
        this.balance = ac;
    }
    public void display(){
        System.out.println(accountNumber+"\n"+holderName+"\n"+balance);
    }
}
class Test{
    public static void main(String args[]){
        Account ac = new Account();
        ac.setAccountNumber(1234);
        ac.setHolderName("Harshit");
        ac.setBalance(1.45f);
        ac.display();
    }
}