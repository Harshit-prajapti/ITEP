// iterator with liked list
import java.util.LinkedList;
import java.util.Iterator;
class Test{
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Hello");
        list.add("World");
        list.add("Welcome");
        list.add("To");
        list.add("Java");
        // using iterator to traverse the linked list
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
        