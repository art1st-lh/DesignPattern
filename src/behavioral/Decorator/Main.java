package behavioral.Decorator;

/**
 * Created by Art1st on 17/10/18.
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Clothes clothes = new MonkeyClothes(new SmartClothes(person));

        System.out.println(clothes.wear());
        System.out.println(clothes.act());
    }
}
