package listInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorPractice {
    //ArrayList is non-synchronized and fast while Vector is synchronized and slow
    public static void main(String[] args) {
        List<String> vi1 = new Vector<>();
        List<String> vi2 = new Vector<>();

        vi1.add("123");
        vi1.add("456");
        vi1.add("789");

        vi2.add(null);
        vi2.add("123");
        vi2.add(null);

        Iterator iterator1 = vi1.iterator();
        Iterator iterator2 = vi2.iterator();

        while (iterator1.hasNext())
            System.out.println(iterator1.next());

        while (iterator2.hasNext())
            System.out.println(iterator2.next());

        vi1.addAll(1, vi2);
        System.out.println("=======new vi1 after addAll to index 1=========");
        Iterator iterator3 = vi1.iterator();
        while (iterator3.hasNext())
            System.out.println(iterator3.next());
    }
}
