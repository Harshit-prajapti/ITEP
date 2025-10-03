import java.util.ArrayList;
import java.util.Arrays;
// Generic class that can hold any type of data
// it is used to achieve type safety in collections framework
// so that we can avoid ClassCastException at runtime because it declares the type of data it can hold at compile time itself
// it is introduced in Java 5 version

class Employee {
    int id;
    String name;
    Employee(int id, String name){
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString(){
        return "Employee [id=" + id + ", name=" + name + "]";
    }
}
class Genric<T>{
    ArrayList<T> al = new ArrayList<>();
    private T data;
    public void setData(T data){
        this.data = data;
    }
    public void add(T data){
        al.add(data);
        System.out.println("After add: " + al);
    }
    public T getData(){
        return data;
    }
    public void printList(){
        System.out.println(al);
    }
}

class Test {
    public static void main(String args[]){
        int arr[] = {4,5,34,34,5,5};
        System.out.println(arr);  // will print hashcode because arr is an object reference and not overriden toString() method
        System.out.println(Arrays.toString(arr));   // to print array elements we have to use Arrays.toString() method
        ArrayList<Integer> alist = new ArrayList<>(); 
        alist.add(10);
        alist.add(5);
        alist.add(7);
        System.out.println(alist);  // will print the elements of the ArrayList because toString() method is overridden in ArrayList class
        Employee e1 = new Employee(101, "ABC");
        Employee e2 = new Employee(102, "XYZ");
        Generic g = new Generic();
        // Genric<Employee> g = new Genric<>(); This will not allow use to add any other type of data excludint Employee
        g.add(e1);
        g.add(e2);
        g.add(4);
        g.setData(10);
        g.printList();
        System.out.println(g.getData());
    }
}