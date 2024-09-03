import java.util.Iterator;

public class Student implements Comparable<Student> {

    private int no;
    private String name;
    private String phone;

    public Student(int no, String name, String phone) {
        this.no = no;
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return this.no + " " + this.name + " " + this.phone;
    }

    @Override
    public int compareTo(Student o) {
        return this.no - o.no;    
    }
}
