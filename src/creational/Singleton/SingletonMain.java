package creational.Singleton;

/**
 * Created by Art1st on 17/10/18.
 */
public class SingletonMain {
    
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();

        System.out.println(singleton.equals(singleton1));
    }
    
}
