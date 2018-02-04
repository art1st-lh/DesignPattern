package behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Art1st on 17/10/18.
 */
public class ConcreteSubject implements Subject {

    private List<Observer> observers = new ArrayList<Observer>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        if (observers.isEmpty()) {
            System.out.println("No observer!");
            return;
        }

        for (Observer observer : observers) {
            observer.update();
        }

    }
}
