public class MVG implements Enumerable{
    Person vip1;
    Person vip2;
    Person vip3;
    int index = 0;

    public MVG(Person p1, Person p2, Person p3) {
        this.vip1 = p1;
        this.vip2 = p2;
        this.vip3 = p3;
    }

    public int size() {
        return 3;
    }

    public Enumerator getEnumerator(){
        return new MVGEnumerator(this);
    }
}
