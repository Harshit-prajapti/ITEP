class A{
    public void m1{
        System.out.println("A-m1");
    }
}
class B extends A{
    public void m2(){
        System.out.println("B-m2");
    }
}
class C extends B {
    public void m2(){
        System.out.println("c-m2")
    }
    public void m3(){
        System.out.printn("c-m3");
    }
}
class Test{
    public static void main(String arg[]){
        A obj = new B();
        obj.m2();

    }
}