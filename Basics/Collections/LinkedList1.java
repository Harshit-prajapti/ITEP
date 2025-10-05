import java.util.LinkedList;
// Behind the scenes, LinkedList uses a doubly linked list to store elements.
// each node contains data and two references, one for the next node and one for the previous node.
// LinkedList allows duplicate elements and maintains the insertion order.
// LinkedList is not synchronized, so if multiple threads access a LinkedList concurrently, and at least one of the threads modifies the list structurally, it must be synchronized externally.
// LinkedList class is Genric in nature. so we can specify the type of elements it can contain.
// if we don't specify the type, it will accept all types of elements and it will be treated as an Object type by default.
// LinkedList presevers the insertion order.
class Test{
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Hello");
        list.add("World");
        System.out.println(list);
    }
}

// ArrayList vs LinkedList
// 1. ArrayList is based on a dynamic array, while LinkedList is based on a doubly linked list.
// 2. ArrayList allows faster random access to elements because it is based on an array data structure, while LinkedList requires traversal from the head node to access an element.
// 3. ArrayList is more memory efficient than LinkedList because it stores elements in a contiguous block of memory, while LinkedList requires additional memory for storing references to the next and previous nodes.
// 4. Insertion and deletion of elements is faster in LinkedList because it only requires updating the references of the adjacent nodes, while in ArrayList, it may require shifting elements to maintain the order.
// 5. ArrayList is better suited for scenarios where frequent access to elements is required, while LinkedList is better suited for scenarios where frequent insertion and deletion of elements is required.
// So whenever we have to deal with a group of objects, and we need faster random access, duplications are allowed we should go for ArrayList.
// Whenever we have to deal with a group of objects, and we need frequent insertion and deletion of elements, duplications are allowed we should go for LinkedList.
// hierarchy of LinkedList