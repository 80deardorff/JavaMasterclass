public class Hamburger {
    private double totalPrice = 0.00;
    private double basePrice = 5.00;
    private String rollType;
    private double costRoll = 1.50;
    private double costBrownRye = 1.00;
    private boolean meat = true;
    private double costMeat = 3.50;
    private boolean lettuce = false;
    private double costLettuce = 0.25;
    private boolean tomato = false;
    private double costTomato = 0.25;
    private boolean onion = false;
    private double costOnion = 0.25;
    private boolean pickle = false;
    private double costPickle = 0.25;

    public Hamburger(String rollType, boolean meat, boolean lettuce, boolean tomato, boolean onion, boolean pickle) {
        this.rollType = rollType;
        this.meat = meat;
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.onion = onion;
        this.pickle = pickle;
        this.totalPrice = this.basePrice;

        if (lettuce) totalPrice += costLettuce;
        if (tomato) totalPrice += costTomato;
        if (onion) totalPrice += costOnion;
        if (pickle) totalPrice += costPickle;
        if (!meat) totalPrice -= costMeat;

        switch (rollType) {
            case "None":
                totalPrice -= costRoll;
                break;
            case "Brown Rye":
                totalPrice += costBrownRye;
                break;
            default:
                break;
        }
    }

    public void addAddition(double costItem) {
        totalPrice += costItem;
    }

    public void printBasePrice() {
        System.out.println("Base price of the hamburger = $" + String.format("%.2f", basePrice));
    }

    public void printAdditions() {
        if (lettuce) System.out.println("+ Lettuce = $" + String.format("%.2f", costLettuce));
        if (tomato) System.out.println("+ Tomato = $" + String.format("%.2f", costTomato));
        if (onion) System.out.println("+ Onion = $" + String.format("%.2f", costOnion));
        if (pickle) System.out.println("+ Pickle = $" + String.format("%.2f", costPickle));
        if (!meat) System.out.println("- Meat = $" + String.format("%.2f", costMeat));
        if (rollType.equals("None")) {
            System.out.println("- Bun = $" + String.format("%.2f", costRoll));
        }else if (rollType.equals("Brown Rye")) {
            System.out.println("+ Brown Rye = $" + String.format("%.2f", costBrownRye));
        }
    }

    public void printFinalPrice() {
        System.out.println("Final price of burger = $" + String.format("%.2f", totalPrice));
    }

    public void printAll() {
        printBasePrice();
        printAdditions();
        printFinalPrice();
    }

    public String getRollType() {
        return rollType;
    }

    public boolean hasMeat() {
        return meat;
    }

    public boolean hasLettuce() {
        return lettuce;
    }

    public boolean hasTomato() {
        return tomato;
    }

    public boolean hasOnion() {
        return onion;
    }

    public boolean hasPickle() {
        return pickle;
    }
}
