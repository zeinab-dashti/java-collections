package setInterface.treeSet;

public class BookComparable implements Comparable<BookComparable> {
    // Comparable is used to define the natural ordering of object
    int id;
    String name, author, publisher;
    int quantity;

    public BookComparable(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    @Override
    public int compareTo(BookComparable b)  {
        if(b.id < this.id && b.quantity < b.quantity)
            return 1;
        else
            return -1;
        //return b.id < this.id ? 1 : -1;
    }
}
