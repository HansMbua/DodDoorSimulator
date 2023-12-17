import java.util.Timer;
import java.util.TimerTask;

public class Remote {
    private final dogDoor door;
    private final Timer timer = new Timer();

    public Remote(dogDoor door) {
        this.door = door;
    }

    public void pressButton(){
        System.out.println("Pressing the remote control button....");
        if (door.isOpen()){
            door.close();
        }else {
            door.open();
        }
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                door.close();
                timer.cancel();
            }
        },5000);
    }




}
