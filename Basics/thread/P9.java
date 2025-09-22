// correct approach

class SharedData {
    private boolean avaliable = false;
    synchronized public void produce(){
        for(int i = 0; i<4; i++){
            System.out.println("Producing...");
            try{Thread.sleep(1000);}catch(InterruptedException e){};
        }
        avaliable = true;
        notify();
    }
    synchronized public void consume(){
        while(!avaliable){
            try{wait();}catch(InterruptedException e){};
        }
        for(int i = 0; i<4; i++){
            System.out.println("Consuming...");
            try{Thread.sleep(1000);}catch(InterruptedException e){};
        }
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
        t1.start();
        t2.start();
    }
}