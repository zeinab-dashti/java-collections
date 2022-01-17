package setInterface;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetPractice {
    //LinkHashSet maintains the insertion order. it is an ordered version of HashSet.
    //LinkHashSet extends the HashSet, so it uses a hashtable to store the elements. Moreover, it uses a doubly linked list to maintain the insertion order.. Hashset use arraylist
    //Hashset uses a hashtable data structure to store the elements. which stores data in an ArrayList. It provides quick access to the data using the array index
    //HashTable also uses a hashtable to store the elements.
    //allows only one null objects
    //HashSet is slightly faster than the LinkedHashSet. But both provide almost similar performance,
    //Both provide o(1) complicity for inserting, removing, retrieving the object.
    //The LinkedHashSet requires more memory than the HashSet.
    //If we require to maintain the insertion order, then LinkedHashSet will be useful. But, when insertion order is not priority, the HashSet will be better
    public static void main(String[] args) {
        Set<String> set=new LinkedHashSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
        Iterator<String> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
