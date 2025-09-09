class Check{
    static class Inner{
    static {
        System.out.println("Class loadded successfully");
    }
    {
        System.out.println("initializer bloack executead successfully");
    }
    private int a = 20;
    private static int b = 10;
    public Check(int x){
        this.a = x;
    }
    public Check(){
        System.out.println("Constructor called");
    }
    public static void print(){
        System.out.println(b);
    }
}
class Test {
    static {
        System.out.println("The Test class Loadded successfully");
    }
    public static void main(String arg[]){
        Check.print();
        Check obj = new Check();
    }
}