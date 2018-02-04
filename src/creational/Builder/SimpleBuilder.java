package creational.Builder;

/**
 * Created by Art1st on 17/10/18.
 */
public class SimpleBuilder {

    private String name;
    private String gender;
    private String hobby;
    private String province;
    private int age;

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getHobby() {
        return hobby;
    }

    public String getProvince() {
        return province;
    }

    public static class Builder {
        SimpleBuilder target;

        public Builder() {
            target = new SimpleBuilder();
        }

        public Builder name(String name) {
            target.name = name;
            return this;
        }

        public Builder age(int age) {
            target.age = age;
            return this;
        }

        public Builder hobby(String hobby) {
            target.hobby = hobby;
            return this;
        }

        public Builder province(String province) {
            target.province = province;
            return this;
        }

        public Builder gendor(String gendor) {
            target.gender = gendor;
            return this;
        }

        public SimpleBuilder build() {
            return this.target;
        }

    }
}
