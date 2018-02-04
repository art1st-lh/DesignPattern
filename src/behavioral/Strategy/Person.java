package behavioral.Strategy;

/**
 * Created by Art1st on 17/10/18.
 */
public class Person {

    private TravelStrategy strategy;

    public void setStrategy(TravelStrategy strategy) {
        this.strategy = strategy;
    }

    public void travel() {
        strategy.travel();
    }


}
