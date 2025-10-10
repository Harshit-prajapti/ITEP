// sorting using custom logic
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class MyOwnSorting implements Comparator<Integer>{
    public int compare(Integer a, Integer b){
        return b - a; // descending order
    }
}
class Test{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(5);
        Collections.sort(list); // it will sort the list in ascending order by default.
        System.out.println("Default sorting order:");
        for(int i : list){ // auto-unboxing
            System.out.println(i);
        }
        Collections.sort(list, new MyOwnSorting());
        System.out.println("Custom sorting order:");
        System.out.println(list);
    }
}