public class Room {
    String name;
    Wall wall1;
    Wall wall2;
    Wall wall3;
    Wall wall4;
    Ceiling ceiling;
    Window window;
    Door door;


    public Room(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Window window, Door door) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.window = window;
        this.door = door;
    }

    public void door(){
        door.switchDoor();

        
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wall getWall1() {
        return this.wall1;
    }

    public void setWall1(Wall wall1) {
        this.wall1 = wall1;
    }

    public Wall getWall2() {
        return this.wall2;
    }

    public void setWall2(Wall wall2) {
        this.wall2 = wall2;
    }

    public Wall getWall3() {
        return this.wall3;
    }

    public void setWall3(Wall wall3) {
        this.wall3 = wall3;
    }

    public Wall getWall4() {
        return this.wall4;
    }

    public void setWall4(Wall wall4) {
        this.wall4 = wall4;
    }

    public Ceiling getCeiling() {
        return this.ceiling;
    }

    public void setCeiling(Ceiling ceiling) {
        this.ceiling = ceiling;
    }

    public Window getWindow() {
        return this.window;
    }

    public void setWindow(Window window) {
        this.window = window;
    }

    public Door getDoor() {
        return this.door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }


}