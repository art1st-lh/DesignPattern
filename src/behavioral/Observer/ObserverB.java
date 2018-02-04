package behavioral.Observer;

/**
 * Created by Art1st on 17/10/18.
 */
public class ObserverB implements Observer {
    @Override
    public void update() {
        System.out.println("I'm ObserverB! Got updated too!");
    }
}
