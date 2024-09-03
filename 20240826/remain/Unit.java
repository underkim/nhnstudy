package remain;
public class Unit {

    private String name;
    private int hp;
    private int attackPower;


    public Unit(String name, int hp , int attackPower)
    {
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
    }



    public int getHP(){
        return this.hp;
    }

    public void setHp(int hp)
    {
        this.hp = hp;
    }
    public String getName()
    {
        return this.name;
    }
    public int getAttackPower()
    {
        return this.attackPower;
    }
}
