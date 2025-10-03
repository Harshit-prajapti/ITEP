// Sorting of an ArrayList using Collections.sort() method
// we will use both Defulat Natural sorting order and Custom sorting order using Comparator interface.
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Student implements Comparable<Student>{
    private int id;
    private String name;
    Student(int id, String name){
        this.id = id;
        this.name = name;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void getData(){
        System.out.println(this.id + " " + this.name);
    }
    // Default Natural sorting order is based on id
    public int compareTo(Student s){ // here s is the object which is passed as an argument to compareTo method.
        // the compareTo method will called on each object of the ArrayList.
        // when we will add the elements to the ArrayList, it will call the compareTo method to compare the elements and sort them in ascending order.
        int diff = this.id - s.id; // ascending order
        if(diff == 0){
            return 1;
        }
        return diff;
        // return this.id - s.id; // ascending order
        // return s.id - this.id; // descending order
    }
}
class Test{
    public static void main(String args[]){
        ArrayList<Student> list = new ArrayList<Student>();
        Student s1 = new Student(103,"John");
        Student s2 = new Student(101,"Doe");
        Student s3 = new Student(102,"Smith");
        Student s4 = new Student(99,"Doe Jr");
        Student s5 = new Student(10,"Smith Sr");
        list.add(s1); // this will call the compareTo method to compare s1 with the existing elements in the list.
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        // Default Natural sorting order
        Collections.sort(list); // it will sort the list based on the compareTo method of the Student class.
        System.out.println("Default Natural sorting order:");
        for(Student s : list){
            s.getData();
        }
        // Custom sorting order using Comparator interface
        Collections.sort(list, new Comparator<Student>(){
            public int compare(Student s1, Student s2){
                return s1.getName().compareTo(s2.getName()); // ascending order based on name
                // return s2.getName().compareTo(s1.getName()); // descending order based on name
            }
        });
        System.out.println("Custom sorting order based on name:");
        for(Student s : list){
            s.getData();
        }
    }
}