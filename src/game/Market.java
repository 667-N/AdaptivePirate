package game;
import java.util.Random;

public class Market {
    public static int rumPrice;
    public static int spicesPrice;
    public static void generatePrices(){
        Random rand = new Random();
        rumPrice = rand.nextInt(51) + 25; //from 25 to 75
        spicesPrice = rand.nextInt(31) + 15;// from 15 to 45
    }
}
