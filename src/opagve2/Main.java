package opagve2;

public class Main {

    static void main(String[] args) {


    Drink drink = new Drink();
    try{
        drink.setPrice(42.2);
    } catch (IllegalArgumentException e) {
        System.out.println("ugydlig pris" + e.getMessage());


    }
    }
}
