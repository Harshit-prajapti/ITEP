// HashSet is a part of the Java Collections Framework and implements the Set interface.
// the hashset class uses a hash table for storage.
// and hashmap is used for the underlying data structure of hashset.
// in the hashmap our object will be stored as a key and a constant dummy value will be associated with it which is PRESENT ojbect by default.
// this is why hashset does not allow duplicate elements because in hashmap keys are unique.
// HashSet allows null values.
// it does not guarantee any specific order of elements.
// HashSet is not synchronized. so if multiple threads access a hashset concurrently, and at least one of the threads modifies the set structurally, it must be synchronized externally.
// HashSet class is Genric in nature. so we can specify the type of elements it can contain.
// if we don't specify the type, it will accept all types of elements and it will be treated as an Object type by default.
// HashSet does not preserve the insertion order.
import java.util.HashSet;
import java.util.Iterator;
class Student{
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
    // Overriding equals() and hashCode() methods to avoid duplicate entries in HashSet
    @Override
    public boolean equals(Object obj){ // this method will be call when hashcode of two objects will be same.
        if(this == obj) return true; 
        if(obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return this.id == student.id && this.name.equals(student.name);
    }

    // when hashcode will generate this will store this hashcode in the bucket.
    // a bucket is a memory location where the object will be stored.
    // a bucket will create on stack memory.
    // when hashcode will generate this will store this hashcode in the bucket.
    @Override
    public int hashCode(){ // this method will be call to generate the hashcode of the object.    
        return 31 * this.id + this.name.hashCode();
    }
}
class Test{
    public static void main(String[] args){
        HashSet<Student> set = new HashSet<>();
        Student s1 = new Student(101, "Alice");
        Student s2 = new Student(102, "Bob");
        Student s3 = new Student(103, "Charlie");
        Student s4 = new Student(101, "Alice"); // Duplicate based on id and name
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4); // This will not be added to the set
        // Using iterator to traverse the HashSet
        Iterator<Student> itr = set.iterator();
        while(itr.hasNext()){
            Student s = itr.next();
            s.getData();
        }
    }
}