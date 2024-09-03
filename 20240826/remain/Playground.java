package remain;
import java.util.List;
import java.util.ArrayList;


public class Playground {
    
    public static void main(String[] args)
    {
        Marine marine1 = new Marine("Marine 1", 30, 5);
        Marine marine2 = new Marine("Marine 2", 30, 5);
        Zealot zealot1 = new Zealot("Zealot", 50, 20);
        Zergling zergling1 = new Zergling("Zergling 1", 100, 1);
        Medic medic = new Medic("Medic 1", 5000, 1);

        List<Unit> list = new ArrayList<>();

        list.add(marine1);
        list.add(zealot1);

        list.add(medic);
        System.out.println(marine2.getHP());

        for(Unit u :list)
        {
            if(u instanceof Attackable) ((Attackable)u).attack(marine2);
        }
        System.out.println(marine2.getHP());
    }
}
