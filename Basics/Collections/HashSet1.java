// whenever we have to use a collection of individual object as single unit where duplication is not allowed
// so will go for set interface
// set interface is implemented by hashset, linkedhashset and treeset classes
import java.util.HashSet;

class Test{
    public static void main(String[] args){
        HashSet<String> set = new HashSet<String>();
        set.add("Hello");
        set.add("World");
        set.add("Hello"); // duplicate element
        set.add("   Java");
        System.out.println(set); // it will print only one "Hello" because set does not allow duplicate elements
    }
}