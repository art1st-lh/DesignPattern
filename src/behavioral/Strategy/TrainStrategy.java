package behavioral.Strategy;

/**
 * Created by Art1st on 17/10/18.
 */
public class TrainStrategy implements TravelStrategy {

    @Override
    public void travel() {
        System.out.println("Travel by train!");
    }
}
