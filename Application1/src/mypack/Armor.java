package mypack;

public class Armor extends Myitem {

    protected int defense;
    
    public Armor() {
        this.defense = 0;
    }

    public Armor(int def) {
        this.defense = def;
    }

    public Armor(int def, int dura) {
        this.defense = def;
        this.durability= dura;
    }

    public int getDefense() {
        return this.defense;
    }
    
}
