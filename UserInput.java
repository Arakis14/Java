import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);

    System.out.println("Input your name: ");

    input.nextLine(); //potrzebne, jeśli wczytujemy napis po wczytaniu liczby

    String name = input.nextLine();

    System.out.println("Input your number: ");

    int number = input.nextInt();

    System.out.println("Hello: " + name + " your wlucky number is: " + number);

    }
}