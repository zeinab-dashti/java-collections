package queueInterface.dQueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequePractice {
    //can remove and add the elements from both the side. Deque stands for a double-ended queue
    //ArrayDeque is faster than ArrayList and Stack and has no capacity restrictions.?????
    //If you need add/remove of the both ends, ArrayDeque is significantly better than a linked list
    //Deletion at the front or back is O(1), and insertion at the front or back takes amortized constant time.
    //The ArrayDeque class provides the facility of using deque and resizable-array
    //doesn’t permit null.
    //Is not thread safe
    // ArrayDeque has no capacity restrictions.
    // ArrayDeque is faster than LinkedList and Stack.
    public static void main(String[] args) {
        Deque<String> deque=new ArrayDeque<String>();
        /*offer() returns false if it fails to insert the element on a size restricted Queue
        add() throws IllegalStateException.
        use offer() when failure to insert is normal, and add() when failure is an exceptional occurrence (that needs to be handled).*/        deque.offer("arvind");
        deque.offer("arvind");
        deque.offer("vimal");
        deque.add("mukul");
        deque.offerFirst("jai");
        System.out.println("After offerFirst Traversal...");
        for(String s:deque){
            System.out.println(s);
        }
        //deque.poll();
        //deque.pollFirst();//it is same as poll()
        deque.pollLast();
        System.out.println("After pollLast() Traversal...");
        for(String s:deque){
            System.out.println(s);
        }
    }
}  
