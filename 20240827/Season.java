enum Season
{
    Spring("봄"),
    Summer("여름"),
    Fall("가을"),
    Winter("겨울");

    private String korName;

    private Season(String KorName)
    {
        this.korName = korName;
    }
}

class Test{
    public static void main(String [] args)
    {
        Season s1 = Season.Winter;
        Season s2 = Season.Spring;
        System.out.println(s1 == s2);
    }
}