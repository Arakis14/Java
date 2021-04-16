import java.util.Objects;
import java.util.Scanner;
import java.io.*;

public class Switchexample {

    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a command: ");

        String text = input.nextLine();
        String s = text.toLowerCase();

        /*
        switch (text) {
            case "start":
                System.out.println("Machine started!");
                break;

            case "stop":
                System.out.println("Machine stoped!");
                break;
        
            default:
                System.out.println("Command not recognized");
                break;
                */
        if (Objects.equals(s, "start")) {
            System.out.println("Machine started!");
        }
        else if (Objects.equals(s, "stop")) {
            System.out.println("Machine stoped!");
        } else { 
            System.out.println("Command not recognized");
        }
    }
}