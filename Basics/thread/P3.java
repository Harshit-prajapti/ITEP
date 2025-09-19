//case-2
class Task{
    synchronized public void m1(){
        try{
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(2000);
        System.out.println("Method m1 called");
        
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        
    }
    synchronized public void m2(){
        System.out.println(Thread.currentThread().getName());
        System.out.println("Method m2 called");
    }
}
class A extends Thread{
    public Task obj;
    public A(Task obj){
        this.obj = obj;
    }
    public void run(){
        obj.m1();
    }
}
class B extends Thread{
    public Task obj;
    public B(Task obj){
        this.obj = obj;
    }
    public void run(){
        obj.m2();
    }
}
class Test{
    public static void main(String args[]){
        Task task = new Task();
        Thread t1 = new A(task);
        Thread t2 = new B(task);
        t1.start();
        t2.start();
    }
}