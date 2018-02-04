package behavioral.Strategy;

/**
 * Created by Art1st on 17/10/18.
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        TravelStrategy strategy = new AirplaneStrategy();
        person.setStrategy(strategy);
        person.travel();

        strategy = new TrainStrategy();
        person.setStrategy(strategy);
        person.travel();
    }
}
