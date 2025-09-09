class A{
    private String model = "Harshit";
    public void printModel(){
        System.out.println(model);
    }
    public void createTheObject(){
        A obj = new A();
        obj.printModel();
        printModel();
    }
}
class Test{
    public static void main(String args[]){
        A obj = new A();
        obj.createTheObject();
    }
}