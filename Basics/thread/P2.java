//case 1
class Task{
    synchronized public void m1(){
        String name = Thread.currentThread().getName();
        System.out.println(name);
        try{
            if(name.equals("Thread-0")) Thread.sleep(3000);
            System.out.println("I am called");
        }catch(InterruptedException e){
            e.printStackTrace();
        }        
        
    }
}
class A extends Thread{
    Task obj = null;
    public A(Task obj){
        this.obj = obj;
    }
    public void run(){
        obj.m1();
    }
}

class Test{
    public static void main(String[] args){
        Task task1 = new Task();
        Task task2 = new Task();
        Thread t1 = new A(task1);
        t1.setPriority(6);
        Thread t2 = new A(task1);
        t1.start();
        t2.start();
    }
}