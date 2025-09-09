class Check{
    int n;
    public Check(int x){
        this();
        // this(x,9);
        this.n = n;
    }
    public Check(int x,int y){
        this.n = n;
        System.out.println("int int constructor is called");
    }
    public Check(){
        this(5,6);
        System.out.println("Default constructor is called");
    }
    public void Check(){
        System.out.println("the method with same name as class is called");
    }
    public void sum(int...x){
        int sum = 0;
        for(int i = 0; i<x.length; i++){
            sum = sum+x[i];
        }
        System.out.println(sum);
    }
}
class Test{
    public static void main(String args[]){
        Check obj = new Check(4);
        int arr[] = {6,5,6,7,5,4,5,6,7,5,6,7};
        obj.sum(arr);
        obj.Check();
    }
}