package game.actions;
import game.Pirate;

public interface Action {
    public String getDescription();
    public void execute(Pirate pirate);
}
