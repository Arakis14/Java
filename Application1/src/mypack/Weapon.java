package mypack;

public class Weapon extends Myitem {

    int attack;
    
    public Weapon() {
        this.attack = 0;
    }

    public Weapon(int def) {
        this.attack = def;
    }

    public Weapon(int def, int dura) {
        this.attack = def;
        this.durability= dura;
    }

    public int getAttack() {
        return this.attack;
    }
    
}
