// mulitple consumers correct approach
class SharedData {
    private boolean avaliable = false;
    synchronized public void produce(){
            System.out.println("Producing...");
            try{Thread.sleep(500);}catch(InterruptedException e){};
        avaliable = true;
        notifyAll();
    }
    synchronized public void consume(){
        while(!avaliable){
            try{wait();}catch(InterruptedException e){};
        }
            System.out.println("Consuming...");
            // try{Thread.sleep(200);}catch(InterruptedException e){};
            avaliable = false;
    }
}
class Producer extends Thread{
    private SharedData shareData;
    public Producer(SharedData d){
        this.shareData = d;
    }
    public void run(){
            shareData.produce();
    }
}
class Consumer extends Thread{
    private SharedData shareData;
    public Consumer(SharedData d){
        this.shareData = d;
    }
    public void run(){
        shareData.consume();
    }
}
class Test{
    public static void main(String args[]){
        SharedData d = new SharedData();
        Thread t1 = new Producer(d);
        Thread t2 = new Consumer(d);
        Thread t2 = new Consumer(d);
        Thread t3 = new Consumer(d);
        Thread t4 = new Consumer(d);
        Thread t5 = new Consumer(d);    
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}