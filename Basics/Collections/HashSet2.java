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
import java.util.Collections;
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
    public int compareTo(Student s){
        if(this.id == s.id){
            return 0;
        }
        return this.id - s.id;
    }
    public int hashCode(){ // this method will be call to generate the hashcode of the object.    
        return 31 * this.id + this.name.hashCode();
    }
    
}
class Test{
    public static void main(String[] args){
        HashSet<Student> set = new HashSet<>();
        Student s1 = new Student(104, "Alice");
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
        // Collections.sort(set);
        // for(Student s : set){
        //     s.getData();
        // }
    }
}
// Java's HashSet internally utilizes a HashMap to store its elements and ensure uniqueness. When a HashSet is instantiated, a HashMap object is also created.
// Here's how it works: 
// Internal HashMap: Every element you add to a HashSet is stored as a key in this internal HashMap. A constant, dummy Object (often a static final Object named PRESENT) is used as the value for all entries in this HashMap.
// Adding an Element (add() method):
// When you call hashSet.add(element), the HashSet delegates this operation to its internal HashMap by calling map.put(element, PRESENT).
// The HashMap then calculates the hashCode() of the element to determine its initial storage location (bucket) in the underlying array.
// If a collision occurs (multiple elements map to the same bucket), the HashMap uses the equals() method to compare the new element with existing elements in that bucket.
// If map.put(element, PRESENT) returns null, it means the element was not previously present in the HashMap (and thus the HashSet), and it is successfully added. The add() method of HashSet returns true.
// If map.put(element, PRESENT) returns a non-null value (the old value associated with the key), it means the element (or an equal element) was already present. The add() method of HashSet returns false, and no duplicate is added.
// Uniqueness Guarantee: The HashMap's property of having unique keys is leveraged by HashSet to ensure that only unique elements are stored. If an element already exists (as determined by hashCode() and equals()), the HashMap's put() method will simply replace the existing entry's value (which is always PRESENT), effectively preventing a duplicate key from being added.
// In essence, HashSet provides a Set interface, but its core functionality of storing unique elements and handling collisions is powered by the robust key-value storage and hashing mechanisms of HashMap.