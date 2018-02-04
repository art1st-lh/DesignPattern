package creational.Builder;

/**
 * Created by Art1st on 17/10/18.
 */
public class SimpleBuilderMain {
    public static void main(String[] args) {

        SimpleBuilder simpleBuilder = new SimpleBuilder.Builder().name("胡汉三")
                                                                 .age(18)
                                                                 .gendor("女")
                                                                 .hobby("打劫")
                                                                 .province("中州")
                                                                 .build();
        System.out.println(simpleBuilder.getAge() +"    "+simpleBuilder.getGender()+"    "+simpleBuilder.getHobby()
                +"    "+simpleBuilder.getName()+"    "+simpleBuilder.getProvince());

    }
}
