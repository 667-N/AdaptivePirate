package game.actions;
import game.Pirate;
import java.util.Random;

public class SailAction implements Action{
    @Override
    public String getDescription(){
        return """
                Go to sea (30% risk)
                - Chance to find treasure (+50 gold, +30 gems)
                - Get caught in a storm (-5 supplies)
                """;
    }
    @Override
    public void execute(Pirate pirate){
        System.out.println("You set out to sea...");
        Random random = new Random();
        int chance = random.nextInt(100);
        if (chance < 30) {
            pirate.reduceSupplies(5);
            System.out.println("A storm has appeared. You lost 5 supplies.");
        } else {
            pirate.addGold(50);
            pirate.addGems(30);
            System.out.println("Treasure! You gained +50 gold and +30 gems!");
        }
        pirate.showResources();
    }
}
