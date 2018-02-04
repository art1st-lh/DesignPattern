package behavioral.Decorator;

/**
 * Created by Art1st on 17/10/18.
 */
public class SmartClothes extends Clothes {

    public SmartClothes(Appearance appearance) {
        super(appearance);
    }

    @Override
    public String wear() {
        super.wear();
        return appearance.wear() + getSmartChain();
    }

    private String getSmartChain() {
        return "    获得了杀马特之项链！";
    }

    @Override
    public String act() {
        super.act();
        return appearance.act() + getSmartSkill() + actAsSmarter();

    }

    private String getSmartSkill() {
        return "    学会了杀马特之遗忘爱！";
    }

    private String actAsSmarter() {
        return "    学会了变得ぉ閃閃發侊のゞ";
    }

    private String wearSmartClothes() {
        return "    卧很懷棯檛魼,ィ旦現實哠訴卧那4檛魼、";
    }
}
