class Machine {
    private String name;
    private int number;

    public Machine() {
        this("None", 0);
        System.out.println("Default contructor running");
        
    }

    public Machine(String name) {
        this(name, 0);
        System.out.println("1 arg contructor running");
    }

    public Machine(String name, int number) {
        System.out.println("2 args contructor running");
        this.name = name;
        this.number = number;
    }
}


public class LearningContructors {
    public static void main (String[] args) {
        Machine m1 = new Machine();
        Machine m2 = new Machine("Beta");
        Machine m3 = new Machine("Gama", 3);

    }
}