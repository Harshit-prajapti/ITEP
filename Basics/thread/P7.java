// case - 6 Deadlock case

class A {
    synchronized public void m1(B obj){
        System.out.println("Thread-1 starting the m1");
        try { Thread.sleep(1000); } catch (Exception e) {}
        obj.x2();
    }
    synchronized public void m2(){
        System.out.println("M2 was called");
    }
}
class B {
    synchronized public void x1(A obj){
        System.out.println("Thread-2 starting the x1");
       try { Thread.sleep(1000); } catch (Exception e) {}
        obj.m2();
    }
    synchronized public void x2(){
        System.out.println("X2 was called");
    }
}
class First extends Thread{
    private A aobj;
    private B bobj;
    public First(A aobj, B bobj){
        this.aobj = aobj;
        this.bobj = bobj;
    }
    public void run(){
        aobj.m1(bobj);
    }
}
class Second extends Thread{
    private A aobj;
    private B bobj;
    public Second(A aobj, B bobj){
        this.aobj = aobj;
        this.bobj = bobj;
    }
    public void run(){
        bobj.x1(aobj);
    }
}
class Test{
    public static void main(String arg[]) throws InterruptedException{
        A aobj = new A();
        B bobj = new B();
        Thread t1 = new First(aobj,bobj);
        Thread t2 = new Second(aobj,bobj);
        t1.start();
        t2.start();
    }
}