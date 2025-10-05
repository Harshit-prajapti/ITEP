// linked list with user defined objects
import java.util.LinkedList;
import java.util.Collections;
import java.util.Comparator;
class Student implements Comparable<Student>{
    private int id;
    private String name;
    Student(int id, String name){
        this.id = id;
        this.name = name;
    }
    @Override
    // The compareTo method of Comparable interface is used to compare the current object with the specified object.
    // It will call at the time of sorting the elements in the linked list. not on the time of adding the elements to the linked list.
    public int compareTo(Student s) { 
        if(this.id == s.id) {
            return 0; // to allow duplicate elements
            // return 1; // to not allow duplicate elements
            // this will treat both objects as different and will add both objects to the linked list.
        }
        return this.id - s.id;
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
}
class Test{
    public static void main(String args[]){
        LinkedList<Student> list = new LinkedList<Student>();
        Student s1 = new Student(103,"John");
        Student s2 = new Student(101,"Doe");
        Student s3 = new Student(102,"Smith");
        Student s4 = new Student(99,"Doe Jr");
        Student s5 = new Student(99,"Doe Jr");
        list.add(s1); 
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5); 
        for(Student s : list){
            s.getData();
        }
        Collections.sort(list); // it will sort the list based on the compareTo method of the Student class.
        System.out.println("After sorting:");
        for(Student s : list){
            s.getData();
        }
    }
}