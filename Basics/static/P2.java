
class Check{
    private int a;
    private byte b;
   class Inner{
        int a = 10;
        public Inner(){
            System.out.println("Inner costuructor called");
        }
    }    
    public Check(){
        System.out.println("Constructor called");
        b = 45;
        a = b;
    }
}
class Test{
    public static void main(String args[]){
        Check c = new Check();
        Check.Inner obj = Check.new Inner();
    }
}
