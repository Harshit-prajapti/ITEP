class C1 extends Thread{
    public void run(){
        for(int i = 0; i<3; i++){
            try{
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(1000);
            }catch(Exception e){
                e.printStackTrace();
            }
            
        }
    }
}
class C2 extends Thread{
    public void run(){
        for(int i = 0; i<3; i++){
            System.out.println(Thread.currentThread().getName());
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println("Exception : ");
                e.printStackTrace();
            }
            
        }
    }
}
class Test{
    public static void main(String args[]){
        System.out.println(Thread.currentThread().getName()); // main Thread
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        
        Thread t1 = new C1();
        Thread t2 = new C2();      
        t1.setName("Thread - 1");
        t2.setName("Thread-2");
        t1.start();
        t2.start();
    }
}