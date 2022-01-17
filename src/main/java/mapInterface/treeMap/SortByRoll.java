package mapInterface.treeMap;

import java.util.Comparator;

public class SortByRoll  implements Comparator<Student> {
    // Comparator is used to define any alternative ordering for an object
    public int compare(Student a, Student b)
    {
        return a.rollno - b.rollno;
    }
}