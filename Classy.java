import java.util.function.Function;

class Animal {

    boolean human;
    int legs;
    String name;

    void printer () {
        System.out.println(this.name + " " + this.legs + " " + this.human);
    }
}


public class Classy {

    public static void main(String[] args) {

        Animal cat = new Animal();
        cat.human = false;
        cat.legs = 4;
        cat.name = "Xurek";

        Animal man = new Animal();
        man.human = true;
        man.legs = 2;
        man.name = "Mark";

        man.printer();
        cat.printer();
    }
}
