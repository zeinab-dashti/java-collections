package setInterface.treeSet;

import java.util.*;

public class TreeSetVsPriorityQueue {
    public static void main(String[] args) {
        /*in TreeSet all elements remain in the sorted order, while in priority queue apart from the root, which is guaranteed to be smallest or largest depending upon Comparing logic, rest of element may or may not follow any order.
        This means you can ACCESS(GET data for example by queue.poll() for priorityQueue and by having for loop for treeSet) same elements from the head in sorted order like head always give you lowest or highest priority element depending upon your Comparable or Comparator implementation
        But if you get iterator over them, then their order will be different. TreeSet will print them in sorted order but PriorityQueue will not until you are always getting the element from the head.
        both provide O(log(N)) time complexity for adding, removing, and searching elements, both are non-synchronized and you can get element from both PriorityQueue and TreeSet in sorted order, but there is fundamental difference between them, TreeSet is a Set and doesn't allow a duplicate element, while PriorityQueue is a queue and doesn't have such restriction. It can contain multiple elements with equal values and in that case head of the queue will be arbitrarily chosen from them.
        Only guarantee PriorityQueue gives that head will always be the smallest or largest element. On the other hand, TreeSet keeps all elements in sorted order, and iterator returned by TreeSet will allow you to access all elements in that sorted order.
        */
        Queue qu1 = new PriorityQueue();

        qu1.add("Amit Sharma");
        qu1.offer("Vijay Raj");
        qu1.add("JaiShankar");
        qu1.add("Raj");
        System.out.println("========input data==============");
        System.out.println(qu1);
        System.out.println("========getting iterator==============");
        Iterator itr=qu1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("========***GETTING DATA***Strings Stored in Natural Ordering in a Priority Queue(using Poll)========");
        while (!qu1.isEmpty())
            System.out.println(qu1.poll());
        System.out.println("=========TREE===TREE====TREE======");
        Set<String> ts = new TreeSet<>();
        ts.add("Amit Sharma");
        ts.add("Vijay Raj");
        ts.add("JaiShankar");
        ts.add("Raj");
        System.out.println("========input data==============");
        System.out.println(ts);
        System.out.println("========getting iterator==============");
        Iterator itr1=ts.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }
        System.out.println("========***GETTING DATA***========");
        for (String value : ts)
            System.out.print(value + ", ");
        System.out.println("======================");
    }
}
