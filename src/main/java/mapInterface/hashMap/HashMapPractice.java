package mapInterface.hashMap;

import java.util.*;

public class HashMapPractice {
    //READ package setInterface.readme.txt
    //it doesn't maintain any order.
    //HashMap allows at most one null key and multiple null values.
    //The HashMap class does not preserve the order of insertion of entries into the map.
    //Initially, it has a bucket size of 16 which grows to 32 when the number of entries in the map crosses the 75%(load factor)
    //HashMap is almost similar to Hashtable except that it’s unsynchronized and allows at max one null key and multiple null values.
    //Java HashMap is not thread-safe and hence it should not be used in multithreaded application. For the multi-threaded application, we should use ConcurrentHashMap class
    //the Wrapper classes like Integer and String classes are a good choice for keys for HashMap as they are immutable and their object state won’t change over the course of the execution of the program.
    //We can use any class as the key in our HashMap. However, for the map to work properly, we need to provide an implementation for equals() and hashCode(). agar override nakoni dar on sorat baraye do ta key object ba dadeye yeksan, vaghti moghayese mishan chon adrese motafavet daran fekr mikone motafavetan dar hali ke dadeye yeksan daran
    //HashMap uses multiple buckets and each bucket points to a Linked List where the entries (nodes) are stored.
    //Once the bucket is identified by the hash function using hashcode, then hashCode is used to check if there is already a key with the same hashCode or not in the bucket(singly linked list).
    //If there already exists a key with the same hashCode, then the equals() method is used on the keys. If the equals method returns true, that means there is already a node with the same key and hence the value against that key is overwritten in the entry(node), otherwise, a new node is created and added to this Singly Linked List of that bucket.
    //If there is no key with the same hashCode in the bucket found by the hash function then the new Node is added into the bucket found.
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1,"one");
        System.out.println(map);
        map.put(1,"two");//the old value is replaced by the specified value.
        map.putIfAbsent(1, "three");//the old value is replaced only if there is not yet a mapping for the given key
        System.out.println(map);

        System.out.println(map);
        System.out.println("==============================");
        map.put(1,"Amit");
        map.put(5,"Rahul");
        map.put(2,"Jai");
        map.put(6,"Amit");
        //Traversing Map
        Set set=map.entrySet();
        Iterator itr=set.iterator();
        while(itr.hasNext()){
            Map.Entry entry=(Map.Entry)itr.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        System.out.println("==============comparingByKey()===============");
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        System.out.println("==============comparingByKey() in Descending Order===============");
        map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
        System.out.println("==============comparingByValue()===============");
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
        System.out.println("==============comparingByValue() in Descending Order===============");
        map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
        System.out.println("==============Null as the Key===============");
        map.put(null, "null value");
        System.out.println(map.get(null).toString());
        System.out.println("==============Using custom object as key===============");
        HashMap<Product, Integer> priceByProduct = new HashMap<>();
        Product eBike = new Product("E-Bike", "A bike with a battery");
        Product eBike1 = new Product("E-Bike", "A bike with a battery");
        priceByProduct.put(eBike, 900);
        priceByProduct.put(eBike1, 900);
        System.out.println(priceByProduct);
        System.out.println("==============getOrDefault()===============");
        System.out.println(map.getOrDefault("horse carriage", 500));
        System.out.println("==============Iterator is failing because new entry got inserted or removed from the source===============");
        Map<String, Long> phoneBook = new HashMap<String, Long>();
        phoneBook.put("Vikram",8149101254L);
        phoneBook.put("Mike",9020341211L);
        phoneBook.put("Jim",7788111284L);

        Iterator<String> keyIterator = phoneBook.keySet().iterator();
        while (keyIterator.hasNext()){
            String key = keyIterator.next();
            if ("Vikram".equals(key)){
               // phoneBook.remove("Vikram");// de-comment it to get the exception
            }
        }
        System.out.println("==============Iterator is not failing only if source removed by iterator itself(.remove())===============");
        Iterator<String> keyIterator2 = phoneBook.keySet().iterator();
        while (keyIterator2.hasNext()){
            String key = keyIterator2.next();
            if ("Vikram".equals(key)){
                keyIterator2.remove();
            }
        }
        Iterator itr2=phoneBook.entrySet().iterator();
        while(itr2.hasNext()){
            Map.Entry entry=(Map.Entry)itr2.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        //The reason is that an iterator is a separate object that has some references to the internal state of the underlying map object.
    }
}

