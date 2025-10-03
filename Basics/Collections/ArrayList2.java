// Array List methods and Iterator method
import java.util.ArrayList;
import java.util.Iterator;
class Test{
    public static void main(String args[]){
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> newList = new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        newList.add("Java");
        newList.add("Python");
        list.addAll(newList); // Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's iterator.
        System.out.println(list);
        Iterator<String> it = list.iterator(); // returns an iterator over the elements in this list in proper sequence.
        while(it.hasNext()){
            System.out.println(it.next());
            if(it.next().equals("World")){
                it.remove(); // removes from the underlying collection the last element returned by this iterator (optional operation).
            }
        }
        System.out.println(list);
        System.out.println(list.size()); // returns the number of elements in this list.
    }
}