package queueInterface.priorityQueue;

import java.util.Comparator;

public class CustomerOrderComparator implements Comparator<CustomerOrder> {
    // Comparator is used to define any alternative ordering for an object
    @Override
    public int compare(CustomerOrder o1, CustomerOrder o2)
    {
        return o1.getOrderAmount() < o2.getOrderAmount() ? 1 : -1;
    }
}
