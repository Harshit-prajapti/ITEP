interface p1{
    public void fun();
}
interface p2{
    public void fun();
}
class C implements p1,p2{
    // System.out.println();
    public void fun(){
        System.out.println("function called");
    }
}
class Test{
    public static void main(String args[]){
       p1 obj = new C();
       p2 obj2 = new C();
       obj.fun();
       obj2.fun();
    
    }
}