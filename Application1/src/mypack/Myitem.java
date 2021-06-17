package mypack;

public class Myitem implements Iitem {

    protected int durability;

    public Myitem() {
        this.durability = 100;
    }

    public Myitem(int number) {
        this.durability = number;
    }

    public int getDurability() {
        return this.durability;
}

    public void setDurability(int newDurability) {
        this.durability = newDurability;
    }
    
    public String toString() {
        StringBuilder sp = new StringBuilder();
        sp.append("Item durability: " + durability);
        return sp.toString();
    }
}