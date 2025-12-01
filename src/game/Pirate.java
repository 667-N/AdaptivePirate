package game;

public class Pirate {
    private int gold;
    private int gems;
    private int supplies;
    private int rum;
    private int spices;

    public Pirate() {
        this.gold = 100;
        this.gems = 20;
        this.supplies = 10;
        this.rum = 0;
        this.spices = 0;
    }
    public Pirate(int gold, int gems, int supplies) {
        this.gold = gold;
        this.gems = gems;
        this.supplies = supplies;
        this.rum = 0;
        this.spices = 0;
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
    public int getRum() {
        return rum;
    }
    public void addRum(int rum) {
        this.rum += rum;
    }
    public void reduceRum(int rum) {
        this.rum -= rum;
    }
    public int getSpices() {
        return spices;
    }
    public void addSpices(int spices) {
        this.spices += spices;
    }
    public void reduceSpices(int spices) {
        this.spices -= spices;
    }
    public boolean isAlive() {
        return gold > 0 && gems > 0 && supplies > 0;
    }
    public void showResources() {
        System.out.println("Gold: " + this.gold);
        System.out.println("Gems: " + this.gems);
        System.out.println("Supplies: " + this.supplies);
        System.out.println("Rum: " + this.rum);
        System.out.println("Spices: " + this.spices);
    }
}
