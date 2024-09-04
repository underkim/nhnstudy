
public class Test {
    public static void main(String[] arg) {

        Hashtable<String, String> s = new Hashtable<>();

        s.put("g", "g");
        s.put("h", "h");
        s.put("ㅁㄴㅁㅇㅁㄴ", "ㅁㄴㅇㅁㄴㅇㄴㅁㅇㅁ");
        s.put("213415432", "123124");
        s.put("564ㅇㄹㄴ", "4536ㄹㄹ");
        s.put("gdfsgdfs", "fdsgfgds");
        s.put("apple", "ap");
        s.put("banana", "ba");
        s.put("cl", "cl");
        s.put("de", "de");
        s.put("gr", "gr");
        s.put("hh", "hh");
        s.put("jjj", "jjj");
        s.put("qqq", "qqq");
        s.put("aaa", "aaa");

        System.out.println(s.get("h"));

        s.forEach(System.out::println);
    }

}
