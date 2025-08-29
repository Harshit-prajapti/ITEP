interface Refundable {
    public void processRefund();
}
abstract class Payment{
    private float amount;
    public Payment(float amount){
        this.amount = amount;
    }
    abstract public void pay();
    public void paymentDetaiils(){
        System.out.println("Payment of "+amount+" done successfully");
    }
}
class CreditCardPayment extends Payment implements Refundable{
    public CreditCardPayment(float amount){
        super(amount);
    }
    public void pay(){
        System.out.println("Trasfaring money using Credeit Card");
    }
    public void processRefund(){
        System.out.println("If money is stucked than Refund will done within 24 hours");
    }
}
class DebitCardPayment extends Payment{
    public DebitCardPayment(float amount){
        super(amount);
    }
    public void pay(){
        System.out.println("Trasfaring money using Debit Card");
    }
}
class UPIPayment extends Payment implements Refundable{
    public UPIPayment(float amount){
        super(amount);
    }
    public void pay(){
        System.out.println("Trasfaring money using UPI paymet");
    }
    public void processRefund(){
        System.out.println("If money is stucked than Refund will done within 48 hours");
    }
} 
class Test{
    public static void main(String args[]){
        CreditCardPayment pc1 = new CreditCardPayment(1000f);
        DebitCardPayment pd1 = new DebitCardPayment(111.11f);
        UPIPayment pu1 = new UPIPayment(47.9f);
        pc1.pay();
        pc1.paymentDetaiils();
        pc1.processRefund();
        pd1.pay();
        pd1.paymentDetaiils();
        pu1.pay();
        pu1.paymentDetaiils();
        pu1.processRefund();
        
    }       
}  