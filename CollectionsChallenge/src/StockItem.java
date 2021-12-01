public class StockItem implements Comparable<StockItem> {
    private final String name;
    private double price;
    private int quantityInStock;
    private int reserved;

    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantityInStock = 0;
        this.reserved = 0;
    }

    public StockItem(String name, double price, int quantityInStock) {
        this.name = name;
        this.price = price;
        this.quantityInStock = quantityInStock;
        this.reserved = 0;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int availableQuantity() {
        return quantityInStock - reserved;
    }

    public int getReserved() {
        return reserved;
    }

    public void setPrice(double price) {
        if (price > 0.0) {
            this.price = price;
        }
    }

    public void adjustStock(int quantity) {
        int newQuantity = this.quantityInStock + quantity;
        if (newQuantity >= 0) {
            this.quantityInStock = newQuantity;
        }
    }

    public int reserveStock(int quantity) {
        int newReserve = this.reserved + quantity;
        if ((quantity > 0) && (newReserve <= this.quantityInStock)) {
            this.reserved = newReserve;
            return quantity;
        }
        return 0;
    }

    public int unreserveStock(int quantity) {
        int newReserve = this.reserved - quantity;
        if ((quantity > 0) && (newReserve >= 0)) {
            this.reserved = newReserve;
            return quantity;
        }
        return 0;
    }

    public int finalizeStock(int quantity) {
        if ((quantity >0) && (quantity <= this.reserved)) {
            this.reserved -= quantity;
            return this.reserved;
        }
        return 0;
    }


    @Override
    public boolean equals(Object obj) {
        System.out.println("Entering StockItem.equals");
        if (obj == this) {
            return true;
        }
        if ((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }

        String objName = ((StockItem) obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 31;
    }

    @Override
    public int compareTo(StockItem o) {
//        System.out.println("Entering StockItem.compareTo");
        if (this == o) {
            return 0;
        }
        if (o != null) {
            return this.name.compareTo(o.getName());
        }
        throw new NullPointerException();
    }

    @Override
    public String toString() {
        return this.name + " : price " + String.format("%.2f", this.price);
    }
}
