// case - 5
class Task{
    synchronized public static void m1(){
        String name = Thread.currentThread().getName();
        System.out.println("Current Thread : "+name);
        try{
            if(name.equals("Thread-0")) Thread.sleep(3000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("I am called");
    }
}
class A extends Thread{
    private Task obj;
    public A(Task obj){
        this.obj = obj;
    }
    public void run(){
        Task.m1();
    }
}
class Test{
    public static void main(String args[]){
        Task obj = new Task();
        Task obj2 = new Task();
        Task obj3 = new Task();
        Thread t1 = new A(obj);
        Thread t2 = new A(obj2);
        t1.start();
        t2.start();
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }        
        obj3.m1();
    }
}