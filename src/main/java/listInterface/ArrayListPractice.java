package listInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListPractice {
    //In ArrayList, the manipulation is slow because shifting bit is required.
    //ArrayList is good for order and more lookups than push/pops
    //Accessing an element by index o(1)
    //Insertion/deletion by index o(n) because you have to shift elements
    //If you insert when the Arraylist is full, you have to copy the elements into a new larger array, which is O(n).
    //Use an ArrayList if you need to access elements by index and you only need to insert/delete at the end.
    //add-at-end is generally cheap: just assign a value to the nth cell
    // remove-at-front is expensive: move the array's entire contents over by one cell.
        public static void main(String[] args) {
        List<String> li1 = new ArrayList<>();
        List<String> li2 = new ArrayList<>();

        li1.add("abc");
        li1.add("def");
        li1.add("ghi");

        li2.add(null);
        li2.add(null);
        li2.add("abc");

        Iterator iterator1 = li1.iterator();
        Iterator iterator2 = li2.iterator();

        while (iterator1.hasNext())
            System.out.println(iterator1.next());

        while (iterator2.hasNext())
            System.out.println(iterator2.next());

        li1.addAll(1, li2);
        System.out.println("=======new li1 after addAll to index 1=========");
        Iterator iterator3 = li1.iterator();
        while (iterator3.hasNext())
            System.out.println(iterator3.next());
    }
}
