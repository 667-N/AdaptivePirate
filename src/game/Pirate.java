package game;

public class Pirate {
    private int gold;
    private int gems;
    private int supplies;

    public Pirate(int gold, int gems, int supplies) {
        this.gold = 100;
        this.gems = 20;
        this.supplies = 10;
    }
    public int getGold() {
        return gold;
    }
    public void addGold(int gold) {
        this.gold += gold;
    }
    public void reduceGold(int gold) {
        this.gold -= gold;
    }
    public int getGems() {
        return gems;
    }
    public void addGems(int gems) {
        this.gems += gems;
    }
    public void reduceGems(int gems) {
        this.gems -= gems;
    }
    public int getSupplies() {
        return supplies;
    }
    public void addSupplies(int supplies) {
        this.supplies += supplies;
    }
    public void reduceSupplies(int supplies) {
        this.supplies -= supplies;
    }
    public boolean isAlive() {
        return gold > 0 && gems > 0 && supplies > 0;
    }
    public void showResources() {
        System.out.println("Gold: " + this.gold);
        System.out.println("Gems: " + this.gems);
        System.out.println("Supplies: " + this.supplies);
    }
}
