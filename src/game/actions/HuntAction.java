package game.actions;
import game.Pirate;
import java.util.Random;

public class HuntAction implements Action {
    @Override
    public String getDescription() {
        return """
                Hunt (10% risk)
                - +10 supplies
                - Stumble upon another pirate ship (-30 gold)
                """;
    }
    @Override
    public void execute(Pirate pirate) {
        System.out.println("You have gone hunting...");
        pirate.addSupplies(10);
        System.out.println("Hunt was successful! +10 supplies.");
        Random random = new Random();
        int chance = random.nextInt(100);
        if (chance < 10) {
            pirate.reduceGold(30);
            System.out.println("Pirates! You lost -30 gold.");
        }
        pirate.showResources();
    }
}
