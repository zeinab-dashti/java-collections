It represents the unordered set of elements which doesn't allow us to store the duplicate items. We can store at most one null value in Set.

a hash table (hash map) is a data structure that implements an associative array abstract data type, a structure that can map keys to values. A hash table uses a hash function to compute an index, also called a hash code, into an array of buckets or slots, from which the desired value can be found. During lookup, the key is hashed and the resulting hash indicates where the corresponding value is stored.
an associative array, map, symbol table, or dictionary is an abstract data type composed of a collection of (key, value) pairs, such that each possible key appears at most once in the collection. Operations associated with this data type allow to: add, remove, search, modify
A hash function is any function that can be used to map data of arbitrary size to fixed-size values. The return values are usually used to index a fixed-size table called a hash table. Use of a hash function to index a hash table is called hashing.
There is a chance that two keys being hashed to the same slot(Collision Problem)
Therefore, almost all hash table implementations have some collision resolution strategy. Strategies require that the keys (or pointers to them) be stored in the table, together with the associated values.
Some common collision resolution strategies:
Separate chaining: each bucket is independent, and has some sort of list of entries with the same index. The time for hash table operations is the time to find the bucket (which is constant) plus the time for the list operation. If there is a large number of entries per bucket then hashing function needs to be fixed
Separate chaining with linked lists(pointer avale bucket hast)(used in Java's HashMap): In this case, it inherit the disadvantages of linked lists. When storing small keys and values, the space overhead of the next pointer in each entry record can be significant. An additional disadvantage is that traversing a linked list has poor cache performance, making the processor cache ineffective.
Separate chaining with list head cells(pointer akhare bucket hast): store the first record of each chain in the slot array itself. The purpose is to increase cache efficiency of hash table access. The disadvantage is that an empty bucket takes the same space as a bucket with one entry.
Open addressing: refers to the fact that the location ("address") of the item is not determined by its hash value. all entry records are stored in the bucket array itself. When a new entry has to be inserted, the buckets are examined, starting with the hashed-to slot and proceeding in some probe sequence, until an unoccupied slot is found. When searching for an entry, the buckets are scanned in the same sequence, until either the target record is found, or an unused array slot is found, which indicates that there is no such key in the table.

For Separate chaining with linked lists in JAVA:***====>>>*** Java 8 brought an interesting enhancement to HashMap implementation. If a bucket size goes beyond the certain threshold, a tree map replaces the linked list. This allows achieving O(logn) for lookup instead of pessimistic O(n). even if all the items hashed into the same bucket, we would get O(log⁡n) lookup in worst of worst scenario.

For separate-chaining, the worst-case scenario is when all entries are inserted into the same bucket, in which case the hash table is ineffective
Chained hash tables also inherit the disadvantages of linked lists. When storing small keys and values, the space overhead of the next pointer in each entry record can be significant. An additional disadvantage is that traversing a linked list has poor cache performance, making the processor cache ineffective.

When an insert is made such that the number of entries in a hash table exceeds the product of the load factor and the current capacity then the hash table will need to be rehashed.[9] Rehashing includes increasing the size of the underlying data structure[9] and mapping existing items to new bucket locations.
Resizing approaches: all-at-once or Incremental(sutable for real time systems)
If the load factor is reached, a new array gets created twice the size of the previous one and all elements get rehashed and redistributed among new corresponding buckets

The main advantage of hash tables over other table data structures is speed. This advantage is more apparent when the number of entries is large.
Dis advantage : Although operations on a hash table take constant time on average. hash tables are not effective when the number of entries is very small( solution: saving the hash value together with the key.)
one idea for small elements: instead of a hash table, one may use the key directly as the index into an array of values. Note that there are no collisions in this case

hash = hashfunc(key)
index = hash % array_size
the hash is independent of the array size, and it is then reduced to an index (a number between 0 and array_size − 1) using the modulo operator (%).

@Override
public int hashCode() { return 1; } //every object would be stored in the same, single bucket.

If two objects are equal according to the equals(Object) method, then calling the hashCode method on each of the two objects must produce the same integer result.

It is not required that if two objects are unequal according to the equals(java.lang.Object) method, then calling the hashCode method on each of the two objects must produce distinct integer results.

equals(): It’s default implementation simply check the object references of two objects to verify their equality.
hashcode:By default, integer value is mostly derived from memory address of the object in heap
So it means:===> It is generally necessary to override the hashCode() method whenever equals() method is overridden, so as to maintain the general contract for the hashCode() method, which states that equal objects must have equal hash codes.

Special Attention When Using in ORM:
always use getters, and never use field references in "hashCode() and equals()" methods. This is for reason, in ORM, occasionally fields are lazy loaded and not available until called their getter methods.
For example, if we use e1.id == e2.id. It is very much possible that id field is lazy loaded. So in this case, one might be zero or null, and thus resulting in incorrect behavior.
But if uses e1.getId() == e2.getId(), calling getter will populate the field first.


How HashSet Maintains Uniqueness?
When we put an object into a HashSet, it finds the object's hashcode value. Each hash code value corresponds to a certain bucket location which can contain various elements, for which the calculated hash value is the same. But two objects with the same hashCode might not be equal. So, objects within the same bucket will be compared using the equals() method.

The performance of a HashSet is affected mainly by two parameters – its Initial Capacity and the Load Factor.
The expected time complexity of adding an element to a set is O(1) which can drop to O(n) in the worst case scenario (when all elements are in one bucket)
We can also create a HashSet with custom values for initial capacity and load factor


A low initial capacity reduces space complexity but increases the frequency of rehashing which is an expensive process.
On the other hand, a high initial capacity increases the cost of iteration and the initial memory consumption.
As a rule of thumb:
A high initial capacity is good for a large number of entries coupled with little to no iteration
A low initial capacity is good for few entries with a lot of iteration



If each bucket has one node, the hashMap has O(1) complexity for search, insertion, and deletion operations.
If all the entries go to the same bucket and linked list stores these entries, then time complexity will be O(n)
If linked list replaced with  a self-balancing binary search tree(i.e. AVL/Red black) then time complexity will be O(logN)
