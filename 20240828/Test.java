import java.util.Iterator;

public class Test {

    public static void main(String[] args) {
        Group group = new Group(5);
        group.add(new Person(1, "1"));
        group.add(new Person(2, "2"));
        group.add(new Person(3, "3"));

        // Iterator<Person> enumerator = new GroupEnumerator(group);

        // while (enumerator.hasNext()) {
        // System.out.println(enumerator.next());
        // }

        MVG mvg = new MVG(new Person(1, "1"), new Person(2, "2"), new Person(3, "3"));

        // Enumerator enumerator2 = new MVGEnumerator(mvg);
        // while (enumerator2.hasNext()) {
        // System.out.println(enumerator2.next());
        // }

        for (Person p : group) {
            System.out.println(p);
        }
    }
}
