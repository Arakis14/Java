package mypack;

public class Myitem {

    int durability;

    public Myitem() {
        this.durability = 100;
    }

    public Myitem(int number) {
        this.durability = number;
    }

    public int getDurability() {
        return this.durability;
    }

    void setDurability(int newDurability) {
        this.durability = newDurability;
    }
    
}