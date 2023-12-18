
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class DogDoorSimulator {
    public static void main(String[] args) {
      dogDoor door = new dogDoor();
      Remote remote = new Remote(door);
        System.out.println("Fido barks to go outside....");
        remote.pressButton();
        System.out.println("\nFido has gone outside....");
        System.out.println("\nFido's all done....");
        try{
            Thread.sleep(10000);
        }catch (InterruptedException e){
            System.out.println("\nFido's back inside....");
        }



    }
}