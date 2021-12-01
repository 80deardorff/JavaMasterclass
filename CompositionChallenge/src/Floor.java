public class Floor {
    private String type;
    private String color;
    private Dimensions dimensions;

    public Floor(String type, String color, Dimensions dimensions) {
        this.type = type;
        this.color = color;
        this.dimensions = dimensions;
    }

    public void cleanFloor() {
        if (type == "carpet") {
            System.out.println("Carpet is being vaccummed...");
        } else if (type == "tile" || type == "linoleum") {
            System.out.println("Floor is being mopped...");
        } else {
            System.out.println("Floor is being cleaned...");
        }
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
