package structural.Proxy;

import structural.Proxy.Subject;

/**
 * Created by Art1st on 17/10/18.
 */
public class RealSubject implements Subject {

    @Override
    public void operate() {
        System.out.println("doSomething.");
    }
}
