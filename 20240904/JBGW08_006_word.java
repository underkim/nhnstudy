import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class JBGW08_006_word {
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

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("검색할 단어를 입력하세요: ");
            String searchWord = sc.nextLine().trim();
            if (searchWord.equals("exit()"))
                break;
            System.out.println(map.get(searchWord));
        }

        sc.close();
        reader.close();
    }
}
