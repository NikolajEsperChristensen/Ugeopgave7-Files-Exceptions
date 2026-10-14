package opgave4;

import java.util.ArrayList;

public class Main {



    static void main(String[] args) {



        ArrayList<String> data = new ArrayList<>();
        data.add("Espresso, En kraftfuld og koncentreret kaffe, 25.0");
        data.add("Latte, Espresso med dampet mælk, 45.0");
        data.add("Cola, Kold og brusende, 30.0");

        for (String s : data ) {
            String[] splitString = s.split(",");
            String type = splitString[0].trim();
            String description = splitString[1].trim();
            double price = Double.parseDouble(splitString[2].trim());

            System.out.println(type + " - " + description + + price);
        }



    }








}
