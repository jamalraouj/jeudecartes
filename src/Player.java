public class Player extends SuperPlayer{

    private int amount;
    public Player(String name, int amount) {
        super(name);
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
