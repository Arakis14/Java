import mypack.Armor;
import mypack.Myitem;
import mypack.*;

public class Application1 {
    public static void main(String[] args) {
        
        Myitem item1 = new Myitem(50);
        Armor armor1 = new Armor(30,59);
        Weapon weapon1 = new Weapon(10, 60);

        System.out.println(weapon1.getAttack() + " " + weapon1.getDurability());

        System.out.println(weapon1);

    }
}