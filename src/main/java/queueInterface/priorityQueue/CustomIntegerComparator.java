package queueInterface.priorityQueue;

import java.util.Comparator;

public class CustomIntegerComparator implements Comparator<Integer> {
    // Comparator is used to define any alternative ordering for an object
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 < o2 ? 1 : -1;//descending
        //return o1 > o2 ? 1 : -1; //Ascending
    }
}

