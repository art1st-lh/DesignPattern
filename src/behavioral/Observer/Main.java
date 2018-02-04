package behavioral.Observer;

/**
 * Created by Art1st on 17/10/18.
 */
public class Main {
    public static void main(String[] args) {
        Subject s = new ConcreteSubject();
        Observer observerA = new ObserverA();
        Observer observerB = new ObserverB();
        Observer observerC = new ObserverC();
        s.addObserver(observerA);
        s.addObserver(observerB);
        s.addObserver(observerC);

        s.notifyObservers();

        s.removeObserver(observerA);
        s.removeObserver(observerB);
        s.removeObserver(observerC);

        s.notifyObservers();


    }
}
