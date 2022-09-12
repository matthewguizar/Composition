public class Door {
    private boolean isOpen;


    public Door(boolean isOpen) {
        this.isOpen = isOpen;
    }

    public boolean isIsOpen() {
        return this.isOpen;
    }

    public boolean getIsOpen() {
        return this.isOpen;
    }

    public void setIsOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }

    public void switchDoor(){
        if (isOpen){
            System.out.println("door was open = " + getIsOpen());
            System.out.println("door now closed");
            isOpen = false;
        } else if (!isOpen) {
            System.out.println("door was closed = "+ getIsOpen());
            System.out.println("door now open");
            isOpen = true;
        }
    }

    
}
