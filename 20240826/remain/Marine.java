package remain;

public class Marine extends Unit implements Attackable{
    
    public Marine(String name, int hp , int attackPower)
    {
       super(name, hp, attackPower);
    }


    public void attack(Unit unit)
    {
        System.out.println(this.getName() + "이 " + unit.getName() + "을 두두두두두둗두두두두두두 공격합니다.");
        unit.setHp(unit.getHP() - this.getAttackPower());
    }




}
