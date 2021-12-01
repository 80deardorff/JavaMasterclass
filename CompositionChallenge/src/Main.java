public class Main {
    public static void main(String[] args) {
        Floor floor = new Floor("linoleum", "Gray", new Dimensions(10, 10, 0));

        Walls walls = new Walls("Brick", "Red", new Dimensions(10, 10, 14));

        Furniture furniture = new Furniture("Couch", "Black", 4, new Dimensions(8, 3, 4));

        Room room = new Room(floor, walls, furniture);
        room.cleanRoom();
    }
}
