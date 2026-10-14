package opgave3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static void main(String[] args) {
        try {
            ArrayList<String> lines = Lines.readLines("datas/data.csv");
            System.out.println("Læser fra: " + new java.io.File("data/data.csv").getAbsolutePath());
            System.out.println("Antal linjer: " + lines.size());
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Filen blev ikke fundet");
        }
    }



}
