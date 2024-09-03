package remain;
public class Zergling {
    
    private String name;
    private int hp;
    private int attackPower;

    public Zergling(String name , int hp , int attackPower)
    {
        this.name = name;
        this.hp  = hp;
        this.attackPower= attackPower;
    }

    public void attack(Zergling zergling){
        System.out.println(this.name + "이 "+zergling.name + "을 어택합니다.");
        zergling.hp -= this.attackPower;
    }
    public void attack(Marine marine){
        System.out.println(this.name + "이 "+marine.getName() + "을 어택합니다.");
        marine.setHp(marine.getHP() - this.attackPower);
    }

    public void setHp(int hp)
    {
        this.hp = hp;
    }

    public int getHp(){
        return this.hp;
    }
    public String getName()
    {
        return this.name;
    }
}
