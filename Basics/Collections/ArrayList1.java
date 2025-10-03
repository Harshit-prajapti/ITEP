
// Behind the scenes, ArrayList uses a dynamic array to store elements.
// but it creates an array of 10 size by default and when the array is full, it creates a new array of double size and copies all the elements from the old array to the new array.
// it increases the size of the array by 50% when it is full.
// forumula is new capacity = old capacity + (old capacity/2) + 1
// ArrayList allows random access to elements because it is based on an array data structure.
// ArrayList is not synchronized, so if multiple threads access an ArrayList concurrently, and at least one of the threads modifies the list structurally, it must be synchronized externally.
// ArrayList allows duplicate elements and maintains the insertion order.
// ArrayList class is Genric in nature. so we can specify the type of elements it can contain.
// if we don't specify the type, it will accept all types of elements and it will be treated as an Object type by default.
// ArrayList presevers the insertion order.
// So whenever we have to deal with a group of objects, and we need faster random access, duplications are allowed we should go for ArrayList.

// hierarchy of ArrayList
//    Iterable
//       Collection
//          List   AbstractList
//             ArrayList

import java.util.ArrayList; 

class Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        System.out.println(list);
    }
}