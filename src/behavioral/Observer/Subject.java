package behavioral.Observer;

/**
 * Created by Art1st on 17/10/18.
 */
public interface Subject {
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
