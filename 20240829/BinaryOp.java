import java.util.function.Function;

@FunctionalInterface
public interface BinaryOp {
    public int apply(int i, int j);
}

@FunctionalInterface
interface RunSomething {
    void doIt();

    static void printName() {
        System.out.println("catsbi");
    }

    default void printAge() {
        System.out.println("33");
    }
}

class Adder implements BinaryOp {
    public int apply(int i, int j) {
        return i + j;
    }
}

class Test {
    public static int calc(BinaryOp binder, int i, int j) {
        return binder.apply(i, j);
    }

    public static void main(String[] args) {
        BinaryOp binder = new BinaryOp() {
            public int apply(int i, int j) {
                return i + j;
            }
        };
        BinaryOp binder2 = (x, y) -> x + y;
        
        System.out.println(calc(binder, 1, 2));
        System.out.println(calc((x, y) -> x + y, 1, 3));
        RunSomething run = new RunSomething() {
            public void doIt() {
                System.out.print("Hello");
            }
        };
        run.printAge();
        BinaryOp b = (int i, int j) -> {
            int x = i + j;
            return x;
        };

            
    } 
}
