import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Test {

    public static void main(String[] args) {

        List<String> list = new LinkedList<>();
        list.add("C");
        list.add("R");
        list.add("J");

        for (String s : list) {
            System.out.println(s);
        }

        list.remove(0);
        list.remove(1);

        for (String s : list) {
            System.out.println(s);
        }
        // // LinkedList<String> s = new LinkedList();

        // // s.add("A");
        // // s.add("AE");
        // // s.add("AW");
        // // s.add("AA");
        // // s.add("X");
        // // s.add("K");
        // // s.add("K");
        // // s.add("J");
        // // s.add("H");
        // // s.add("G");
        // // s.add("F");
        // // s.add("C");
        // // s.add("A");
        // // s.add("Ç");
        // // s.add("B");

        // // // int len = s.size();
        // // // for (int i = 0; i < len; i++) {
        // // // System.out.println(s.remove(0));
        // // // }

        // // System.out.println(s.remove(10));
        // // System.out.println(s.remove(9));
        // // System.out.println(s.remove(8));
        // // System.out.println(s.remove(7));
        // // System.out.println(s.remove(6));

        // LinkedList<Integer> in = new LinkedList<>();

        // in.add(10);
        // in.add(16);
        // in.add(112432);
        // in.add(10243);
        // in.add(103645);
        // in.add(178960);
        // in.add(106978);
        // in.add(10068);
        // in.add(107698);
        // in.add(105764);
        // in.add(635410);

        // for (int i = 0; i < in.size(); i++) {
        // System.out.println(in.get(i));
        // }
    }
}