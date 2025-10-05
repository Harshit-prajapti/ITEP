// Vector uses same dynamic array as ArrayList to store elements.
// but it is synchronized. so if multiple thhread access a Vector concurrently, it is safe.
// but it is slower than ArrayList because of synchronization overhead.
// Vector also allows duplicate elements and maintains the insertion order.
// Vector class is Genric in nature. so we can specify the type of elements it can contain.
// if we don't specify the type, it will accept all types of elements and it will be treated as an Object type by default.
// Vector presevers the insertion order.

import java.util.Vector;
class Test {
    public static void main(String[] args) {
        Vector<String> list = new Vector<String>();
        list.add("Hello");
        list.add("World");
        System.out.println(list);
    }
}