public class Room {
    private Floor floor;
    private Walls walls;
    private Furniture furniture;

    public Room(Floor floor, Walls walls, Furniture furniture) {
        this.floor = floor;
        this.walls = walls;
        this.furniture = furniture;
    }

    public void cleanRoom() {
        System.out.println("Cleaning room...");
        floor.cleanFloor();
        furniture.straightenFurniture();
    }
}
