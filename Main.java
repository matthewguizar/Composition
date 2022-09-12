public class Main {
    public static void main(String[] args) {
        
       Wall wall1 = new Wall("North");
       Wall wall2 = new Wall("South");
       Wall wall3 = new Wall("East");
       Wall wall4 = new Wall("West");

       Door door = new Door(false);

       Window window = new Window(100);

       Ceiling ceiling = new Ceiling(1000, "white");

       Room room = new Room("bedroom", wall1, wall2, wall3, wall4, ceiling, window, door);
        room.door();
        room.door();
    }
}