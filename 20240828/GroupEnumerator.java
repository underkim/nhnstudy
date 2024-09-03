public class GroupEnumerator implements java.util.Iterator<Person>  {
    Group group;
    int index;

    GroupEnumerator(Group g) {
        this.group = g;
        index = -1;
    }

    public boolean hasNext() {
        return ((index + 1) < group.index) ? true : false;
    }

    public Person next() {
        return group.get(++index);
    }
}
