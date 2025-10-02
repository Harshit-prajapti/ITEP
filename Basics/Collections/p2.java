import java.util.ArrayList;
import java.util.Arrays;
 
// Generic class that can hold any type of data 
// it is used to achieve type safety in collections framework
// so that we can avoid ClassCastException at runtime because it declares the type of data it can hold at compile time itself
// it is introduced in Java 5 version
class Genric<T>{
    private T data;
    public void setData(T data){
        this.data = data;
    }
    public T getData(){
        return data;
    }
}
class Test{
    public static void main(String args[]){
        int arr[] = {4,5,34,34,5,5};
        System.out.println(arr);  // will print hashcode because arr is an object reference and not overriden toString() method
        System.out.println(Arrays.toString(arr));   // to print array elements we have to use Arrays.toString() method
        ArrayList<Integer> alist = new ArrayList<>(); 
        alist.add(10);
        alist.add(5);
        alist.add(7);
        System.out.println(alist);  // will print the elements of the ArrayList because toString() method is overridden in ArrayList class
        Genric<Integer> g = new Genric<>();
        g.setData(10);
        System.out.println(g.getData());
    }
}