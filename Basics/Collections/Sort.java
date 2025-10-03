import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
// Sorting ArrayList using Collections.sort() method
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
class Test{
    
    public static void main(String args[]){
        ArrayList<String> al = new ArrayList<>();
        ArrayList al2 = new ArrayList<>(); // non generic ArrayList
        ArrayList<Employee> al3 = new ArrayList<Employee>();
        al.add("Harshit");
        al.add("Aman");
        al.add("Zeeshan");
        al.add("Siddharth");
        al.add("Amit");
        Collections.sort(al);
        System.out.println("Sorted String ArrayList : "+al);
        al2.add(10);
        al2.add(4);
        al2.add(11);
        al2.add(7);
        Collections.sort(al2);
        System.out.println("Sorted Integer ArrayList : "+al2);
        al3.add(new Employee(101, "ABC")); // non-static method cannot be referenced from a static context
        al3.add(new Employee(102, "XYZ"));  
        Collections.sort(al3, (e1, e2) -> {
            return e1.name.compareTo(e2.name); // sorting based on name
        });
        System.out.println("Sorted Employee ArrayList : "+al3);
}
}