public class TextMagic {


    public static void main(String[] args) {
        
        String s = "";
        s += "My name is Bob,";
        s += " ";
        s += "I do nothing";

        StringBuilder ss = new StringBuilder();

        ss.append("My name is Is.")
        .append(" ")
        .append("I do nothing.");

        System.out.println(s);
        System.out.println(ss.toString());
        System.out.println(ss);

        //Formating

        System.out.println("Haaha new tab\t and\na newline");

        //Intigers

        System.out.printf("Total cost %-10d; quantity is %d\n", 5, 120);

        for (int i = 0; i < 13; i++) {
            System.out.printf("Value %-2d: %s\n", i, "here is the text");
        }

        //Floating

        System.out.printf("Value: %.2f\n", 5.697);
        System.out.printf("Value: %-10.1f\n", 341.697);
    }
}