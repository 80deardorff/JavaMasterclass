public class Walls {
    private String type;
    private String color;
    private Dimensions dimensions;

    public Walls(String type, String color, Dimensions dimensions) {
        this.type = type;
        this.color = color;
        this.dimensions = dimensions;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
