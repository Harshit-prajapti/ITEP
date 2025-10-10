// Linked hash set maintains the insertion order.
// it also uses the hashMap as the underlying data structure.
// but it maintains a doubly linked list running through all of its entries.
// this linked list defines the iteration ordering, which is the order in which elements were inserted into the set (insertion-order).
// 
// if we re-insert an element that is already present, the insertion order is not affected

import java.util.LinkedHashSet;
import java.util.Iterator;
class Test{
    public static void main(String[] args){
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(4);
        set.add(2);
        set.add(1);
        set.add(3);
        set.add(5);
        set.add(2); // duplicate element will not be added.
        System.out.println(set);
        Iterator<Integer> itr = set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}