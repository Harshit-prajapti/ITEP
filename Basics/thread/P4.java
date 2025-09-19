// case 3
class Task{
    synchronized public void m1(){
        try{
            System.out.println(Thread.currentThread().getName());
        System.out.println("Method m1 called");
        Thread.sleep(2000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        
    }
    synchronized public void m2(){
        try{
            System.out.println(Thread.currentThread().getName());
        System.out.println("Method m2 called");
        Thread.sleep(2000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    public void m3(){
        System.out.println(Thread.currentThread().getName());
        System.out.println("Method m3 called");
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
class C extends Thread{
    public Task obj;
    public C(Task obj){
        this.obj = obj;
    }
    public void run(){
        obj.m3();
    }
}
class Test{
    public static void main(String args[]){
        Task task = new Task();
        Thread t1 = new A(task);
        t1.setName("Thread t1");
        Thread t2 = new B(task);
        t2.setName("Thread t2");
        Thread t3 = new C(task);
        t3.setName("Thread t3");
        t1.start();
        t2.start();
        t3.start();
    }
}