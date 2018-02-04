package behavioral.Decorator;

/**
 * Created by Art1st on 17/10/18.
 */
public abstract class Clothes implements Appearance {

    protected Appearance appearance;

    public Clothes(Appearance appearance) {
        this.appearance = appearance;
    }

    @Override
    public String wear() {
        return appearance.wear();
    }

    @Override
    public String act() {
        return appearance.act();
    }
}
