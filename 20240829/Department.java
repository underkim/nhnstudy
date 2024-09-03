import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Department implements Iterable<Student> {
    int no;
    String name;
    List<Student> list;

    public Department(int no, String name) {
        this.no = no;
        this.name = name;
        this.list = new ArrayList<>();
    }

    public void add(Student student) {
        this.list.add(student);
    }

    @Override
    public Iterator<Student> iterator() {
        return this.list.iterator();
    }
}
