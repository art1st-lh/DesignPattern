package behavioral.Decorator;

/**
 * Created by Art1st on 17/10/18.
 */
public class Person implements Appearance {

    @Override
    public String wear() {
        return "换一身行囊吧！ ";
    }

    @Override
    public String act() {
        return "施展身手：   ";
    }
}
