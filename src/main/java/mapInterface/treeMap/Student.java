package mapInterface.treeMap;

class Student {
    int rollno;
    String name, address;

    public Student(int rollno, String name,
                   String address)
    {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    public String toString()
    {
        return this.rollno + " "
                + this.name + " "
                + this.address;
    }
}