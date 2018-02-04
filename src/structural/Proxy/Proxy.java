package structural.Proxy;

/**
 * Created by Art1st on 17/10/18.
 */
public class Proxy implements Subject {

    private Subject subject = null;

    @Override
    public void operate() {
        if (subject == null) {
            subject = new RealSubject();
        }
        System.out.println("Proxy invoking...");
        subject.operate();
    }
}
