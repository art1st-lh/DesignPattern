package creational.Factory;

/**
 * Created by Art1st on 17/10/18.
 */
public class SimpleFactoryMain {

    public static void main(String[] args) {

        //简单工厂
        IFactory simpleFactory = new SimpleFactory();
        IProduct product = simpleFactory.createProduct("A");

        //工厂
        IFactory factory = new Factory();
        IProduct product1 = factory.createProduct("xxx");

        //以上两种工厂的实现即是抽象工厂的思想，不同的工厂生产不同的产品，都实现自IFactory，使用哪种工厂即调用哪种

    }

}
