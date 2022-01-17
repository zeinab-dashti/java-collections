package mapInterface;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapPractice {
    //LinkedHashMap is like HashMap but it keeps the order of insertion
    //To maintain the order it needs 2 more pointers at every Node(each bucket can have one or more nodes)(besides the next pointer required for LinkedList functionality). Pointers are used to handle the insertion order.
    //so each node has 3 pointer(before node(insertion order), after node(insertion order), next node)
    //internal implementation : https://anmolsehgal.medium.com/java-linkedhashmap-internal-implementation-44e2e2893036
    // it  is not synchronized
    //Why LinkedHashMap when we have HashMap and TreeMap: HashMap provides constant time performance for add, remove and contains method but elements are unordered.  In TreeMap elements are naturally sorted but there is increased cost associated with it (log(n) time). So, with LinkedHashMap we have insertion order with Time complexity of the add, remove and contains operations is constant time i.e O(1) .
    public static void main(String[] args)
    {
        LinkedHashMap<String,String> premiumPhone = new LinkedHashMap<String,String>();
        premiumPhone.put("Apple", "iPhone6");
        premiumPhone.put("HTC", "HTC one");
        premiumPhone.put("Samsung","S6");

        Iterator iterator = premiumPhone.keySet().iterator();

        while (iterator.hasNext())
        {
            System.out.println(premiumPhone.get(iterator.next()));
            //premiumPhone.put("Sony", "Xperia Z");//LinkedHashMap behaves like fail fast iterator
        }
        System.out.println("================ Iterating through the LinkedHashMap=============");
        //The most famous way is to use a for-each loop
        LinkedHashMap<Integer, String> hm= new LinkedHashMap<Integer, String>();

        hm.put(3, "Geeks");
        hm.put(2, "For");
        hm.put(1, "Geeks");

        for (Map.Entry<Integer, String> mapElement : hm.entrySet()) {
            Integer key = mapElement.getKey();
            String value = mapElement.getValue();
            System.out.println(key + " : " + value);
        }
    }

}

