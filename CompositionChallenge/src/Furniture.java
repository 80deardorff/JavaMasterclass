public class Furniture {
    private String name;
    private String color;
    private int numLegs;
    private Dimensions dimensions;

    public Furniture(String name, String color, int numLegs, Dimensions dimensions) {
        this.name = name;
        this.color = color;
        this.numLegs = numLegs;
        this.dimensions = dimensions;
    }

    public void straightenFurniture() {
        System.out.println("Straightening up furniture...");
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getNumLegs() {
        return numLegs;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
