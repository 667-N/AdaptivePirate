package game.actions;
import game.Pirate;
import java.util.Random;

public class RestAction implements Action {
    @Override
    public String getDescription() {
        return """
                Take a break (0% risk)
                - Consume 1 supply
                """;
    }
    @Override
    public void execute(Pirate pirate) {
        System.out.println("You are resting...");
        pirate.reduceSupplies(1);
        System.out.println("Consumed: -1 supply");
        pirate.showResources();
    }
}
