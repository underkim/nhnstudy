public class Card {
    private int no;
    private String suit;
    private String displayNo;

    public Card(int no , String suit, String displayNo)
    {
        this.no = no;
        this.suit = suit;
        this.displayNo = displayNo;
    }

    @Override
    public String toString(){
        return this.displayNo + ", "+ this.suit;
    }
}
