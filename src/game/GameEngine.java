package game;
import game.actions.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class GameEngine {
    private final Pirate pirate;
    private final List<Action> actions;
    private boolean gameOver;
    private int day;

    public GameEngine(){
        this.pirate = new Pirate(100, 20, 10);
        this.actions = new ArrayList<>();
        this.gameOver = false;
        this.day = 1;

        actions.add(new HuntAction());
        actions.add(new SailAction());
        actions.add(new RestAction());
        actions.add(new TradeAction());
    }

    private void checkGameOver(){
        if(!pirate.isAlive()) {
            if (pirate.getGold() <= 0) {
                System.out.println("\nYou have lost all your gold! GAME OVER.");
            }

            if (pirate.getSupplies() <= 0) {
                System.out.println("\nYou finished all of your supplies! GAME OVER.");
            }
            gameOver = true;
        }
    }

    public void showDayHeader(int day){
        System.out.println("\n-------------------------------------------");
        System.out.println("Day " + day);
        System.out.println("-------------------------------------------");
    }

    public int readChoice(int min, int max){
        int choice;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Your choice: (" + min + "-" + max + "): ");
            choice = input.nextInt();
            if(choice < min || choice > max){
                System.out.println("Invalid choice! Please try again.");
            } else{
                break;
            }
        } while (true);
        return choice;
    }
    public void playTurn(){
        Market.generatePrices();
        showDayHeader(day);
        pirate.showResources();
        System.out.println();
        for (int i = 0; i < actions.size(); i++){
            System.out.println((i+1) + ". " + actions.get(i).getDescription());
        }
        System.out.println();
        int choice = readChoice(1, actions.size());
        Action action = actions.get(choice - 1);
        action.execute(pirate);
        checkGameOver();
        day++;
    }
    public void showGameStart(){
        System.out.println("===========================================");
        System.out.println("Game \"Adaptive Pirate\"");
        System.out.println("===========================================");
        System.out.println();
        System.out.println("You are a pirate with limited resources.");
        System.out.println("Make a decision");
        System.out.println();
    }
    public void showGameEnd(){
        System.out.println("\n===========================================");
        System.out.println("GAME OVER!");
        System.out.println("===========================================");
        System.out.println("You lasted " + (day - 1) + " days.");
    }
    public void start(){
        showGameStart();
        while(!gameOver){
            playTurn();
        }
        showGameEnd();
    }
}
