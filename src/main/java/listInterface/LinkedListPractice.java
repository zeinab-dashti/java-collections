package listInterface;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListPractice {
    //In LinkedList, the manipulation is fast because no shifting is required.
    //LinkedLists are not optimized for random access
    //Accessing elements by index, Worst-case O(n)
    //it has 2 pointers per node.
    //ArrayList is faster for empty lists
    public static void main(String[] args) {
        List<String> linkLi1 = new LinkedList<>();
        List<String> linkLi2 = new LinkedList<>();

        linkLi1.add("abc");
        linkLi1.add("ghi");
        linkLi1.add(null);

        linkLi2.add(null);
        linkLi2.add("abc");
        linkLi2.add("mno");

        Iterator iterator1 = linkLi1.iterator();
        Iterator iterator2 = linkLi2.iterator();

        while (iterator1.hasNext())
            System.out.println(iterator1.next());

        while (iterator2.hasNext())
            System.out.println(iterator2.next());

        linkLi1.addAll(1, linkLi2);
        System.out.println("=======new linkLi1 after addAll to index 1=========");
        Iterator iterator3 = linkLi1.iterator();
        while (iterator3.hasNext())
            System.out.println(iterator3.next());
    }
}
