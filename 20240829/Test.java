import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        
        List<Student> list = new ArrayList<>();

        Department d = new Department(1, "CE");

        d.add(new Student(3, "first", "2139129319"));
        d.add(new Student(2, "second", "1231232131"));
        d.add(new Student(1, "third", "3432432134"));

        d.list.forEach(item -> System.out.println(item));
    }
}
