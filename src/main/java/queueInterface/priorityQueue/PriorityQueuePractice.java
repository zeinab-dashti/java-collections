package queueInterface.priorityQueue;

import java.util.*;

public class PriorityQueuePractice {
    //PriorityQueue doesn’t permit null.
    //element should be comparable
    //The head of queue is the least element with respect to the specified ordering. If multiple elements have same value, the head is one of those elements(arbitrarily)
    //Is not thread safe
    //It is implemented using Heap Data Structures and Heap has O(log(n)) time complexity to insert and delete element.
    //peek() and element() for retrieve elements from the head of the queue is constant time i.e. O(1).
    //contains(Object)method, to check existence of particular element have leaner time complexity i.e. O(n).
    //order is ascending by default
    //Queues don't allow random, indexed access. If you need to access elements by index, then use list, not a queue
    public static void main(String[] args) {
        Queue qu1 = new PriorityQueue();

        qu1.add("Amit Sharma");
        qu1.offer("Vijay Raj");
        qu1.add("JaiShankar");
        qu1.add("Raj");
        System.out.println("========input data==============");
        System.out.println(qu1);
        System.out.println("========getting iterator==============");
        Iterator itr0=qu1.iterator();
        while(itr0.hasNext()){
            System.out.println(itr0.next());
        }
        System.out.println("========Strings Stored in Natural Ordering in a Priority Queue(using Poll)========");
        while (!qu1.isEmpty())
            System.out.println(qu1.poll());
        System.out.println("======================");
        qu1.add("Amit Sharma");
        qu1.offer("Vijay Raj");
        qu1.add("JaiShankar");
        qu1.add("Raj");
        System.out.println("head:"+qu1.element());//Retrieves the head of the queue, or returns EXCEPTION if queue is empty
        System.out.println("head:"+qu1.peek());//Retrieves the head of the queue, or returns null if queue is empty
        System.out.println("iterating the queue elements:");
        Iterator itr=qu1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        qu1.remove();//removes the head of the queue, or returns EXCEPTION, if queue is empty.
        qu1.poll();//removes the head of the queue, or returns null if queue is empty.
        System.out.println("after removing two elements:");
        Iterator itr2=qu1.iterator();
        while(itr2.hasNext())
            System.out.println(itr2.next());


        System.out.println("========qu2========");
        Queue qu2 = new PriorityQueue(qu1);
        Iterator itr3=qu2.iterator();
        while(itr3.hasNext())
            System.out.println(itr3.next());

        System.out.println("========qu3========");
        Queue qu3 = new PriorityQueue(2);//?????
        qu3.add("Amit Sharma");
        qu3.add("JaiShankar");
        qu3.add("Raj");

        Iterator itr4=qu3.iterator();
        while(itr4.hasNext())
            System.out.println(itr4.next());

        System.out.println("========qu4 (EMPTY LIST)========");
        Queue qu4 = new PriorityQueue();
        System.out.println("head:"+qu4.peek());//Retrieves the head of the queue, or returns null if queue is empty
        try{
            System.out.println("head:"+qu4.element());//Retrieves the head of the queue, or returns EXCEPTION if queue is empty
        }catch(NoSuchElementException e) {
            System.out.println("There is Exception for reading from empty queue");
        }
        System.out.println("removing:" + qu4.poll());//removes the head of the queue, or returns null if this queue is empty.
        try{
            System.out.println("removing:"+qu4.remove());///removes the head of the queue, or returns EXCEPTION, if queue is empty.
        }catch(NoSuchElementException e) {
            System.out.println("There is Exception for removing from empty queue");
        }
        System.out.println("outout: "+ qu4);

        System.out.println("========Natural ordering========");
        Queue<String> testStringsPQ = new PriorityQueue<>();
        testStringsPQ.add("abcd");
        testStringsPQ.add("1234");
        testStringsPQ.add("23bc");
        testStringsPQ.add("zzxx");
        testStringsPQ.add("abxy");

        System.out.println("Strings Stored in Natural Ordering in a Priority Queue:");
        while (!testStringsPQ.isEmpty())
            System.out.println(testStringsPQ.poll());

        System.out.println("========Custom ordering========");
        Queue<Integer> testIntegersPQ = new PriorityQueue<>(new CustomIntegerComparator());
        testIntegersPQ.add(11);
        testIntegersPQ.add(5);
        testIntegersPQ.add(-1);
        testIntegersPQ.add(12);
        testIntegersPQ.add(6);

        System.out.println("Integers stored in reverse order of priority in a Priority Queue");
        while (!testIntegersPQ.isEmpty())
            System.out.println(testIntegersPQ.poll());


        System.out.println("========Priority queue with Java objects========");
        CustomerOrder c1 = new CustomerOrder(1, 100.0, "customer1");
        CustomerOrder c2 = new CustomerOrder(3, 50.0, "customer3");
        CustomerOrder c3 = new CustomerOrder(2, 300.0, "customer2");

        Queue<CustomerOrder> customerOrders = new PriorityQueue<>();
        customerOrders.add(c1);
        customerOrders.add(c2);
        customerOrders.add(c3);
        while (!customerOrders.isEmpty())
            System.out.println(customerOrders.poll());

        System.out.println("========Priority queue with Java objects(new comparator)========");
        CustomerOrder c11 = new CustomerOrder(1, 100.0, "customer1");
        CustomerOrder c12 = new CustomerOrder(3, 50.0, "customer3");
        CustomerOrder c13 = new CustomerOrder(2, 300.0, "customer2");
        Queue<CustomerOrder> customerOrders1 = new PriorityQueue<>(new CustomerOrderComparator());
        customerOrders1.add(c11);
        customerOrders1.add(c12);
        customerOrders1.add(c13);
        while (!customerOrders1.isEmpty()) {
            System.out.println(customerOrders1.poll());
        }//We can sort the list elements of Comparable type by Collections.sort(List) method.
        //eWe can sort the list elements of Comparator type by Collections.sort(List, Comparator) method.
    }
}
