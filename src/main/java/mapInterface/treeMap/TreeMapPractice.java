package mapInterface.treeMap;

import java.util.*;

public class TreeMapPractice {
    //It maintains ascending order.
    //Both TreeMap and TreeSet do not permit null values and are not synchronized and have Fail-fast Iterator
    //Both TreeMap and TreeSet provides guaranteed log(n) time cost for operation like get, put, containsKey and remove.
    //Both TreeMap and TreeSet are sorted. Sorted order can be natural sorted order defined by Comparable interface or custom sorted order defined by Comparator interface.
    // TreeMap allows duplicate values while TreeSet does not allow duplicate objects.
    // Sorting of TreeMap is Based on keys but for TreeSet it is Based on objects
    //Both TreeMap and TreeSet are slower than HashSet and HashMap and instead of providing constant time performance for add, remove and get operation they provide performance in O(log(n)) order.
    //HashMap can be tuned using the initialCapacity and loadFactor, which isn't possible for the TreeMap
    // It is implemented by red-black trees. Starting from the root, any element in the left branch of any node is always less and those on the right are always greater. Red-black tree is a self-balancing binary search tree so it has O(log n) for basic operations(search, get, put, remove)
    //Being self-balancing is key here. It means insertion and delegation should not cause to have shorter or longer branch. So for every insertion and deletion, the maximum height of the tree on any edge is maintained at O(log n) i.e. the tree balances itself continuously.
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(3);
        set.add(4);
        set.add(3);
        set.add(5);

        TreeMap<Integer, Integer> tm = new TreeMap<>();
        tm.put(2, 4);
        tm.put(3, 5);
        tm.put(4, 5);
        tm.put(2, 3);
        System.out.println(set);
        System.out.println(tm);
        System.out.println("=======================================");
        NavigableMap<Integer, String> map = new TreeMap<Integer, String>();
        map.put(100, "Amit");
        map.put(102, "Ravi");
        map.put(101, "Vijay");
        map.put(103, "Rahul");
        //Maintains descending order
        System.out.println("descendingMap: " + map.descendingMap());
        //Returns key-value pairs whose keys are less than or equal to the specified key.
        System.out.println("headMap: " + map.headMap(102, true));
        //Returns key-value pairs whose keys are greater than or equal to the specified key.
        System.out.println("tailMap: " + map.tailMap(102, true));
        //Returns key-value pairs exists in between the specified key.
        System.out.println("subMap: " + map.subMap(100, false, 102, true));
        System.out.println("========TreeMap using TreeMap(Comparator) constructor========");
        TreeMap<Student, Integer> tree_map = new TreeMap<Student, Integer>(new SortByRoll());
        tree_map.put(new Student(111, "bbbb", "london"), 2);
        tree_map.put(new Student(131, "aaaa", "nyc"), 3);
        tree_map.put(new Student(121, "cccc", "jaipur"), 1);

        System.out.println("TreeMap: " + tree_map);
        System.out.println("===================Custom Sorting in TreeMap====================");
        TreeMap<Integer, String> map1 = new TreeMap<>(Comparator.reverseOrder());
        map1.put(3, "val");
        map1.put(2, "val");
        map1.put(1, "val");
        map1.put(5, "val");
        map1.put(4, "val");
        System.out.println(map1);
        System.out.println("===================Custom Sorting in TreeMap====================");
        //TreeMap keeps sorted order therefore we can perform following queries
        System.out.println(map1.lastKey());
        System.out.println(map1.firstKey());
        System.out.println(map1.headMap(3).keySet());
        System.out.println(map1.tailMap(3).keySet());
    }
}