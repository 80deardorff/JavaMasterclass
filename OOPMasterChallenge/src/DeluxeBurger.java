public class DeluxeBurger extends Hamburger{
    private boolean chips = true;
    private double costChips = 0.50;
    private boolean drink = true;
    private double costDrink = 1.00;

    public DeluxeBurger(String rollType) {
        super(rollType, true, true, true, true, true);
        super.addAddition(costChips);
        super.addAddition(costDrink);
    }

    public boolean hasChips() {
        return chips;
    }

    public boolean hasDrink() {
        return drink;
    }
}
