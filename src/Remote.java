
public class Remote {
    private dogDoor door;

    public Remote(dogDoor door) {
        this.door = door;
    }

    public void pressButton(){
        System.out.println("Pressing the remote control button....");
        if (door.isOpen()){
            door.open();
        }else {
            door.close();
        }
    }
}
