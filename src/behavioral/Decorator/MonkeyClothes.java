package behavioral.Decorator;

/**
 * Created by Art1st on 17/10/18.
 */
public class MonkeyClothes extends Clothes {

    public MonkeyClothes(Appearance appearance) {
        super(appearance);
    }

    @Override
    public String wear() {
        super.wear();
        return appearance.wear() + wearMonkeyClothes();
    }

    @Override
    public String act() {
        super.act();
        return appearance.act() + actAsMonkey();
    }

    private String actAsMonkey() {
        return "    学会了七十二变！";
    }

    private String wearMonkeyClothes() {
        return "    获得了猴皮大衣！";
    }
}
