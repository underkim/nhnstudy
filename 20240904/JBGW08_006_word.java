import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class JBGW08_006_word {

    static List<Map.Entry<String, String>> list;

    public static String binarySearching(String target) {
        Collections.sort(list, new Comparator<Map.Entry<String, String>>() {
            @Override
            public int compare(Entry<String, String> o1, Entry<String, String> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });

        int left = 0;
        int right = list.size() - 1;
        String word = "not found";
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (list.get(mid).getKey().equals(target)) {
                word = list.get(mid).getValue();
                break;
            } else if (list.get(mid).getKey().compareTo(target) > 0) {
                right = mid + 1;
            } else
                left = mid - 1;
        }
        return word;
    }

    public static void main(String[] arg) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("words.txt"));

        String line = reader.readLine();
        Map<String, String> map = new HashMap<>();
        while (true) {

            if (line == null)
                break;
            String word = "";
            String meen = "";
            line = line.trim();
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == ' ') {
                    line = line.substring(i, line.length()).trim();
                    break;
                }
            }

            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == ' ' || line.charAt(i) == '\t') {
                    word = line.substring(0, i).trim();
                    meen = line.substring(i, line.length()).trim();
                    break;
                }
            }

            map.put(word, meen);
            line = reader.readLine();

        }

        list = new ArrayList<>(map.entrySet());

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("검색할 단어를 입력하세요: ");
            String searchWord = sc.nextLine().trim();
            if (searchWord.equals("exit()"))
                break;
            System.out.println(binarySearching(searchWord));

        }

        sc.close();
        reader.close();
    }
}
