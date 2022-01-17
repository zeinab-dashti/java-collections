package setInterface.treeSet;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetPractice {
    // It is implementations of the NavigableSet interface (NavigableSet also extends SortedSet interface) that uses a Tree for storage.
    //TreeSet implements the SortedSet interface. So, duplicate values are not allowed.
    // Since a set doesn’t retain the insertion order, the navigable set interface provides the implementation to navigate through the Set
    // Elements can be ordered by a Comparator provided at set creation time
    //????? how about piade saziye compareable///////
    //An object is said to be comparable if and only if the corresponding class implements a Comparable interface.
    //If we are depending on the default natural sorting order, the objects that are being inserted into the tree should be homogeneous and comparable.
    //TreeSet is an implementation of a self-balancing tree(or self-balancing binary search tree)
    //TreeSet also contains unique elements. However, the access and retrieval time of TreeSet is quite fast. The elements in TreeSet stored in ascending order. the insertion order is not retained
    // since JDK 7 Null values are not accepted by the TreeSet because null cannot be compared to any value.
    // TreeSet serves as an excellent choice for storing large amounts of sorted information which are supposed to be accessed quickly because of its faster access and retrieval time.
    // operations like add, remove, and search take O(log(N)) time. The reason is that in a self-balancing tree, it is made sure that the height of the tree is always O(log(N)) for all the operations. Therefore, this is considered as one of the most efficient data structure in order to store the huge sorted data and perform operations on it. However, operations like printing N elements in the sorted order takes O(N) time.
    public static void main(String[] args)
    {
        Set<String> ts = new TreeSet<>();

        ts.add("B");
        ts.add("D");
        //ts.add(null);
        ts.add("C");
        ts.add("A");

        // Duplicates will not get insert
        ts.add("A");

        // Elements get stored in default natural
        // Sorting Order(Ascending)
        System.out.println(ts);
        System.out.println("========================");
        String check = "A";
        System.out.println("Contains " + check + " "+ ts.contains(check));
        System.out.println("==========Use NavigableSet Interface to have more options==============");
        NavigableSet<String> ts1 = new TreeSet<>();
        ts1.add("B");
        ts1.add("F");
        ts1.add("C");
        ts1.add("A");
        System.out.println("First Value " + ts1.first());
        System.out.println("Last Value " + ts1.last());

        String val = "B";
        System.out.println("Higher " + ts1.higher(val));
        System.out.println("Lower " + ts1.lower(val));
        System.out.println("===========most famous methods to iterator=============");
        for (String value : ts)
            System.out.print(value + ", ");
        System.out.println();
        System.out.println("========TreeSet  with Java objects(new comparator)========");
        Set<BookComparable> set=new TreeSet<BookComparable>();
        //Creating Books
        BookComparable b1=new BookComparable(121,"Let us C","Yashwant Kanetkar","BPB",8);
        BookComparable b2=new BookComparable(233,"Operating System","Galvin","Wiley",6);
        BookComparable b3=new BookComparable(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        set.add(b1);
        set.add(b2);
        set.add(b3);
        for(BookComparable b:set){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }
}
