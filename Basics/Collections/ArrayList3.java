// ArrayList with custom objects
import java.util.ArrayList;
import java.util.Iterator;
class Student{
    private int id;
    private String name;
    Student(int id, String name){
        this.id = id;
        this.name = name;
    }
    public void getData(){
        System.out.println(this.id + " " + this.name);
    }
}
class Test{
    public static void main(String args[]){
        ArrayList<Student> list = new ArrayList<Student>();
        Student s1 = new Student(101,"John");
        Student s2 = new Student(102,"Doe");
        Student s3 = new Student(103,"Smith");
        list.add(s1);
        list.add(s2);
        list.add(s3);
        Iterator<Student> it = list.iterator();
        while(it.hasNext()){
            Student s = it.next(); // it will throw ConcurrentModificationException because we are trying to modify the list while iterating it.
            // How to avoid ConcurrentModificationException?
            // 1. Use Iterator's remove() method to remove elements while iterating.
            // 2. Use for loop instead of iterator.
            // 3. Use CopyOnWriteArrayList instead of ArrayList.
            s.getData();
        }
    }
}