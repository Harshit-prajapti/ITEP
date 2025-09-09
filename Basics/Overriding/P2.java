// we can down cast an object but only those that was upccast somethme i poast like- 
class A {
    public void wish(){
        System.out.println("Greed");
    }
}
class B extends A{
    public void wish(){
        System.out.println("good morning");
    }
}
class Test{
    public static void main(String args[]){
        A obj = new B();   //upcasting
        obj = (A)new A(); //downcasting 
        obj.wish();
    }
}