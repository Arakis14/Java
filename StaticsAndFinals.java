class Thing {
    public String name;
    public static String description = "I am a thing";
    public static final int LUCKY_NUMBER = 7;
    public int id;
    public static int count = 0;

    public Thing () {

        id = count;
        count++;
    }
    public static void showInfo() {
        System.out.println("Hi!");
        System.out.println(Thing.description);
    }

    public int getId() {
        return this.id;
    }
}

public class StaticsAndFinals {

    public static void main(String[] args) {

        Thing.showInfo();

        Thing.description = "I am a longer thing";

        System.out.println(Thing.description);

        System.out.println(Math.PI);

        System.out.println(Thing.LUCKY_NUMBER);

        Thing Bob = new Thing();
        System.out.println(Bob.getId());
        System.out.println(Thing.count);

    }
}