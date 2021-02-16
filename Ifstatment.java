public class Ifstatment {
    public static void main(String[] args){

        int myInt = 5;

        while(true) {
            System.out.printf("Looping %d\n", myInt);
            if (myInt == 7) {
                System.out.println("Out of the loop, I went into the if!");
                break;
            }
        myInt++;
        }
    }
}