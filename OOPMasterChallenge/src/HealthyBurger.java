public class HealthyBurger extends Hamburger{
    private boolean avocado = false;
    private double costAvocado = 0.50;
    private boolean cucumber = false;
    private double costCucumber = 0.25;

    public HealthyBurger(boolean meat, boolean lettuce, boolean tomato, boolean onion, boolean pickle, boolean avocado, boolean cucumber) {
        super("Brown Rye", meat, lettuce, tomato, onion, pickle);
        this.avocado = avocado;
        this.cucumber = cucumber;
        if (avocado) super.addAddition(costAvocado);
        if (cucumber) super.addAddition(costCucumber);
    }

    @Override
    public void printAdditions() {
        super.printAdditions();
        if (avocado) System.out.println("+ Avocado = $" + String.format("%.2f", costAvocado));
        if (cucumber) System.out.println("+ Cucumber = $" + String.format("%.2f", costCucumber));
    }

    public boolean isAvocado() {
        return avocado;
    }

    public boolean isCucumber() {
        return cucumber;
    }
}
