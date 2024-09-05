import java.util.Comparator;

public class Bubble<T> {

    public static <T extends Comparable<T>> void sort(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    T temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }

    public static <T extends Comparable<T>> void sort(T[] arr, Comparator<T> comparator) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (comparator.compare(arr[j], arr[i]) > 0) {
                    T temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }

    public static void main(String[] arg) {

        Integer[] intArr = { 1, 23, 4, 56, 765, 76, 746, 4675, 574, 6, 6754, 46757456, 12 };
        String[] strArr = { "DFSA", "dfgs", "asdf", "zcvx", "WEQR" };

        for (int i : intArr) {
            System.out.println(i);
        }
        System.out.println();
        for (String s : strArr) {
            System.out.println(s);
        }
        System.out.println();

        sort(intArr);
        sort(strArr, new Comparator<String>() {
            @Override
            public int compare(String t1, String t2) {
                if (t2.toLowerCase().compareTo(t1.toLowerCase()) > 0) {
                    return 1;
                } else if (t2.toLowerCase().compareTo(t1.toLowerCase()) == 0) {
                    return 0;
                } else {
                    return -1;
                }
            }
        });
        for (int i : intArr) {
            System.out.println(i);
        }
        System.out.println();

        for (String s : strArr) {
            System.out.println(s);
        }

        System.out.println();
    }
}