package opgave1;

import java.util.Scanner;

public class Main {
    private Scanner scan = new Scanner(System.in);

    public int promptNumber(String msg) {
        System.out.println(msg);
        try {
            return Integer.parseInt(scan.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Ugyldigt input – du skal indtaste et heltal. Prøv igen.");
            return promptNumber(msg);
        }
    }

    public static void main(String[] args) {
        Main program = new Main();
        int tal = program.promptNumber("Indtast et tal:");
        System.out.println("Du indtastede: " + tal);
    }
}