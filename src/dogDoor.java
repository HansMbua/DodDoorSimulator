public class dogDoor {
    private boolean open;

    public dogDoor(boolean open) {
        this.open = open;
    }


    public void open(){
        System.out.println("the dog door opens");
        open = true;
    }

    public void close(){
        System.out.println("The dog door closes.");
        open = false;
    }
     public boolean isOpen(){
        return open;
     }


}
