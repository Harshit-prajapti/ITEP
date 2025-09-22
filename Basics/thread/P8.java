// My false logig for join method
// I have used join method to make sure that the producer thread is completed before the consumer thread
class Consummer {
    synchronized public void consume(){
        for(int i = 0; i<4; i++){
            System.out.println("Consumming");
            try{Thread.sleep(1000);}catch(InterruptedException e){};
        }
    }
    synchronized public void active(Thread t2){
        System.out.println("Order placed");
        try{t2.join();}catch(InterruptedException e){System.out.println("Something wnet wrong");};
        consume();
    }
}
class Proroductor{
    synchronized public void produce(){
        for(int i = 0; i<4; i++){
            System.out.println("Producing...");
            try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println("Something went wrong");};
        }        
        notify();
    }
}
class First extends Thread{
    private Consummer cobj;
    private Proroductor pobj;
    private Thread t2;
    public First(Consummer cobj,Proroductor pobj,Thread t2){
        this.cobj = cobj;
        this.pobj = pobj;
        this.t2 = t2;
    }
    public void run(){
        cobj.active(t2);
    }
}
class Second extends Thread{
    private Proroductor pobj;
    private Consummer cobj;

    public Second(Proroductor pobj, Consummer cobj){
        this.pobj = pobj;
        this.cobj = cobj;
    }
    public void run(){
        pobj.produce();        
    }

}
class Test{
    public static void main(String arg[]){
        Proroductor pobj = new Proroductor();
        Consummer cobj = new Consummer();
        Thread t2 = new Second(pobj,cobj);
        Thread t1 = new First(cobj,pobj,t2);
        t1.start();
        t2.start();
    }
}