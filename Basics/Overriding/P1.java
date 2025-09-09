class A{
    public void wish(){
        System.out.println("Good Morning"); 
    }
    public void greed(){
        System.out.println("God blesh you");
    } 
}
class B extends A{
    @Override
    public void wish(){ 
        System.out.println("Good evening");
    }
    
}
class Test{
    public static void main(String args[]){
        A obj = new B();  // upcasting
        B obj1 = (B)new A(); //downcasting
        obj.wish();
        obj.greed();
        obj1.greed();
    }
}