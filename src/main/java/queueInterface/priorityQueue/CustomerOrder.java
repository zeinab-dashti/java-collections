package queueInterface.priorityQueue;

public class CustomerOrder implements Comparable<CustomerOrder> {
    // Comparable is used to define the natural ordering of object
    //we can have only one ordering via Comparable e.g. natural ordering while we can define multiple Comparator for alternative ordering for example customerNameComparator  and orderAmountComparator
    private int orderId;
    private double orderAmount;
    private String customerName;

    public CustomerOrder(int orderId, double orderAmount, String customerName) {
        this.orderId = orderId;
        this.orderAmount = orderAmount;
        this.customerName = customerName;
    }

    @Override
    public int compareTo(CustomerOrder o) {
        return o.orderId > this.orderId ? 1 : -1;
    }

    @Override
    public String toString() {
        return "orderId:" + this.orderId + ", orderAmount:" + this.orderAmount + ", customerName:" + customerName;
    }

    public double getOrderAmount() {
        return orderAmount;
    }
}
