import java.util.Iterator;

public class Group implements Iterable<Person>{
    Person[] person;
    int index = 0;

    public Group(int size) {
        this.person = new Person[size];
    }

    public void add(Person p) {
        this.person[this.index++] = p;
    }

    public Person get(int index) {
        return this.person[index];
    }

    public int size() {
        return this.person.length;
    }


    @Override
    public Iterator<Person> iterator() {
       return new GroupEnumerator(this);
    }
}
