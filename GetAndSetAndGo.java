class Hero {
    String name;
    String subclass;
    int exp;
    int gold;

    int getExp() {
        return exp;
    }

    void setExp(int newExp) {
        this.exp = newExp;
    }

    String getName() {
        return name;
    }

    void setName(String newName) {
        this.name = newName;
    }
}

public class GetAndSetAndGo {
    
    public static void main (String[] args) {
        
        Hero viking = new Hero();
        viking.name = "Bjorn";
        viking.gold = 10;
        viking.exp = 100;
        viking.subclass = "Shaman";

        System.out.println(viking.getName() + " has " + viking.getExp() + " experiance.");
        viking.setName("Ragnar");
        viking.setExp(5000);
        System.out.println(viking.getName() + " has " + viking.getExp() + " experiance.");
    }
}