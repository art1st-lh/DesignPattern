package creational.Factory;

/**
 * Created by Art1st on 17/10/18.
 */
public class SimpleFactory implements IFactory {

    public SimpleFactory() {}

    public IProduct createProduct(String type) {
        switch (type) {
            case "A":
                return new ProductA();
            case "B":
                return new ProductB();
            default:
                break;
        }

        return new Product();
    }

    static public class Product implements IProduct {}

    static public class ProductA implements IProduct {}

    static public class ProductB implements IProduct {}


}
