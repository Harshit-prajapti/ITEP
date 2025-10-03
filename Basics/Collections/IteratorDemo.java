// Iterator method demonstration
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
class Test{
    public static void main(String args[]){
        ArrayList<String> al = new ArrayList<>();
        al.add("Harshit");
        al.add("Aman");
        // for(String s : al){ // In This way we can iterate over the elements of the ArrayList
        //     System.out.print(s);
        // }
        // but iterator is better b
        Iterator<String> it = al.iterator(); // returns an iterator object that can be used to iterate over the elements of the ArrayList
        while(it.hasNext()){
            System.out.println(it.next());
        }

        ArrayList<Integer> al2 = new ArrayList<>();
        al2.add(10);
        al2.add(4);
        al2.add(11);
        al2.add(7);
        Iterator<Integer> it2 = al2.iterator();
        while(it2.hasNext()){
            // System.out.println(it2.next());
            if(it2.next() > 10){
                it2.remove(); // removes the last element returned by the iterator
            }
        }
        System.out.println("Before Sorting : "+al2); // 7 will be removed from the ArrayList
        Collections.sort(al2); // sorts the ArrayList in ascending order
        System.out.println("After Sorting : "+al2);
}
}