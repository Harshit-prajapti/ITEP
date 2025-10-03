import java.util.LinkedList;
class Test{
    public static void main(String args[]){
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Harshit");
        ll.add("Aman");
        ll.add("Zeeshan");
        ll.add("Siddharth");
        ll.add("Amit");
        System.out.println(ll);
        ll.addFirst("First Element");
        ll.addLast("Last Element");
        // l1.add(4,"Added on forth position");
        System.out.println(ll);
        System.out.println(ll.get(0)); // returns the element at the specified position in this list.
        System.out.println(ll.getFirst()); // returns the first element in this list.
        System.out.println(ll.getLast()); // returns the last element in this list.
        ll.set(0, "Changed First Element"); // replaces the element at the specified position in this list with the specified element.
        System.out.println(ll);
        ll.remove(0); // removes the element at the specified position in this list.
        System.out.println(ll);
        ll.removeFirst(); // removes and returns the first element from this list.
        System.out.println(ll);
        ll.removeLast(); // removes and returns the last element from this list.
        System.out.println(ll);
    }
}