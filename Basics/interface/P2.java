interface I{
    int s = 100;
    public static void print(){
        System.out.println("Hello");
    }
    void wish();
}
interface I2{
    void wish();
    default void m3(){
        System.out.println("Hello i am default methods");
    }
}
class A implements I,I2{
    public static final void test(){
        System.out.println("Hello");
    }
    public void wish(){
        System.out.println("Good Morning");
    }
}
class Test{
    public static void main(String args[]){
        A obj = new A();
        obj.wish();
        A.test();
        // obj.print();
        obj.m3();
    }
}