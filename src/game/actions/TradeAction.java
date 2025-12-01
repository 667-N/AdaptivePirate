package game.actions;
import java.util.Scanner;

import game.Market;
import game.Pirate;

public class TradeAction implements Action{
    @Override
    public String getDescription() {
        return """
                Trade (0% risk)
                - Buy items
                """;
    }
    @Override
    public void execute(Pirate pirate) {
        Scanner input = new Scanner(System.in);
        boolean trading = true;
        while(trading){
            System.out.println("---Trading menu---");
            System.out.println("Gold: " + pirate.getGold());
            System.out.println("You can sell");
            System.out.println("1. Rum: " + pirate.getRum() + " --> Price: " + Market.rumPrice + " G");
            System.out.println("2. Spices: " + pirate.getSpices() + " --> Price: " + Market.spicesPrice + " G");
            System.out.println("You can buy");
            System.out.println("3. Rum price: " + Market.rumPrice + " G");
            System.out.println("4. Spice price: " + Market.spicesPrice + " G");
            System.out.println("5. Exit trade");
            int choice;
            do {
                System.out.print("Your choice: ");
                choice = input.nextInt();
                if (choice < 1 || choice > 5) {
                    System.out.println("Invalid choice! Please try again.");
                } else {
                    break;
                }
            } while (true);
            switch (choice) {
                case 1: //sell rum
                    if (pirate.getRum() > 0) {
                        pirate.addGold(Market.rumPrice);
                        pirate.reduceRum(1);
                        System.out.println("Sold rum");
                    } else {
                        System.out.println("You don't have any rum!");
                    }
                    break;
                case 2: //sell spices
                    if (pirate.getSpices() > 0) {
                        pirate.addGold(Market.spicesPrice);
                        pirate.reduceSpices(1);
                        System.out.println("Sold spices");
                    } else {
                        System.out.println("You don't have any spices!");
                    }
                    break;
                case 3: //buy rum
                    if (pirate.getGold() >= Market.rumPrice) {
                        pirate.reduceGold(Market.rumPrice);
                        pirate.addRum(1);
                        System.out.println("Bought rum");
                    } else {
                        System.out.println("You don't have enough gold!");
                    }
                    break;
                case 4: //buy spices
                    if (pirate.getGold() >= Market.spicesPrice) {
                        pirate.reduceGold(Market.spicesPrice);
                        pirate.addSpices(1);
                        System.out.println("Bought spices");
                    } else {
                        System.out.println("You don't have enough gold!");
                    }
                    break;
                case 5:
                    trading = false;
                    break;
                    default:
                        System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
