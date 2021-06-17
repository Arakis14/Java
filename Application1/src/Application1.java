import mypack.*;

public class Application1 {
    public static void main(String[] args) {
        
        Myitem item1 = new Myitem(50);

        Armor armor1 = new Armor(30,59);

        Weapon weapon1 = new Weapon(10, 60);

        System.out.println(weapon1.getAttack() + " " + weapon1.getDurability());

        System.out.println(weapon1);
        Iitem item2 = new Myitem();
        System.out.println(item2);

        Myitem item3 = weapon1;
        System.out.println(item3.getDurability());
        
        breakItem(item3); 

        System.out.println(item3); // not yet collected?
    }
    
    public static void breakItem(Myitem item) {
        item = null;
    }
}