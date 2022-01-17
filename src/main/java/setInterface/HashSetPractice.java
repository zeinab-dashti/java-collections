package setInterface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetPractice {
    //uses a hash table for storage. Hashing is used to store the elements in the HashSet.
    //HashSet uses HashMap internally to store it’s objects.
    //The elements you add into HashSet are stored as keys of this HashMap object. The value associated with those keys will be a constant  called “PRESENT”(it is a final object).
    //HashMap is an array of buckets with a default capacity of 16 elements – each bucket corresponds to a different hashcode value
    //HashSet vs HashMap: HashMap does not allow duplicate keys however it allows to have duplicate values. HashSet permits to have a single null value. HashMap permits single null key and any number of null values.
    //elements are organized in hash-based data structures
    //iterators are fail-fast. it means:If the set is modified at any time after the iterator is created in any way except through the iterator's own remove method, the Iterator throws a ConcurrentModificationException. So that is also Why Hashmap Should Not Be Used for Multi-threaded Environments
    //Fail-fast iterators throw ConcurrentModificationException on a best-effort basis. Fail-fast cannot be guaranteed as it's impossible to make any hard guarantees in the presence of unsynchronized concurrent modification.
    public static void main(String[] args) {
        Set<String> set=new HashSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
        //Traversing elements
        Iterator<String> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("===========after removing======");
        set.remove("Ajay");
        System.out.println(set);
    }
}

