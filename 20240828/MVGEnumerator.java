public class MVGEnumerator implements Enumerator {

    MVG mvg;
    int index = 0;

    MVGEnumerator(MVG m)
    {
        this.mvg = m;
    }
    public boolean hasNext() {
        return index < mvg.size();
    }

    public Person next() {
        Person[] p = {mvg.vip1,mvg.vip2,mvg.vip3};
        return p[index++];
    }
}
