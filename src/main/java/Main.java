import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args) {
        String name;
        System.out.println("Please print your name.");
        Scanner abc = new Scanner(System.in);
        name = abc.nextLine();
        name=name.toUpperCase();
        if (name.equals("ALICE")) {
            System.out.println("Hi Alice!");
        } else if (name.equals("Bob")) {
            System.out.println("Hi Bob!");
        } else System.out.println("False");

    }
};







