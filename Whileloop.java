import java.util.Scanner;


public class Whileloop{

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String message = "Got the right number!";
    int value;
    String ask = "What is 5+5?";
    System.out.println(ask);

    do {

    value = scanner.nextInt();
        if (value != 10){
            System.out.println("Wrong!");
        }
    }
    while(value != 10);

    System.out.println(message);

    }
}