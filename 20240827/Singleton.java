public class Singleton {
    private static Singleton singleton;
    private int number;

    public synchronized int nextNumber(){
        return this.number++;
    }
    private Singleton()
    {
    }

    public static Singleton getSingleton()
    {
        if(singleton == null)
        {
            singleton = new Singleton();
        }
        return singleton;
    }
}


class Test{
    public static void main(String[] args)
    {
        Singleton sing1 = Singleton.getSingleton();
        Singleton sing2 = Singleton.getSingleton();



        System.out.println(sing1.nextNumber());
        System.out.println(sing2.nextNumber());
        System.out.println(sing1);
        System.out.println(sing2);
    }
}
