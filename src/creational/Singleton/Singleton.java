package creational.Singleton; /**
 * Created by Art1st on 17/10/17.
 */

/**
 * 懒汉式
 * 使用时再加载，节省资源
 * 线程不安全 多个线程可能会new出多个对象
 * 解决：可以使用synchronize关键字来加锁代码块
 */
public class Singleton {
    //懒汉式原始写法
//    private Singleton() {}
//    private static Singleton singleton = null;
//    public static Singleton getInstance() {
//        if (singleton == null) {
//            singleton = new Singleton();
//        }
//        return singleton;
//    }
// -----------------------------------------------------

    //以下为解决懒汉式线程安全的三种方案
    //1、直接加锁  每次调用都同步，对性能有影响
//    private Singleton() {}
//    private static Singleton singleton = null;
//    private static synchronized Singleton getInstance() {
//        if (singleton == null) {
//            singleton = new Singleton();
//        }
//        return singleton;
//    }
// -----------------------------------------------------
    //2、双重检查锁定  确保只有再第一次调用时才做同步 避免了不必要的性能损耗
//    private Singleton() {}
//    private static Singleton singleton = null;
//    private static Singleton getInstance() {
//        if (singleton == null) {
//            synchronized (Singleton.class) {
//                if (singleton == null) {
//                    singleton = new Singleton();
//                }
//            }
//        }
//        return singleton;
//    }
// -----------------------------------------------------
    //3、静态内部类  没有性能损耗
    private Singleton() {
        System.out.println("Singleton has been initialized.");
    }
    private static Singleton singleton = null;
    private static class lazyHolder {
        private static final Singleton INSTANCE = new Singleton();
    }
    public static Singleton getInstance() {
        return lazyHolder.INSTANCE;
    }
// -----------------------------------------------------

/**
 * 饿汉式
 * 事先加载好，使用时直接调用 相比懒汉式更耗费资源
 * 天然线程安全
 */
//    private Singleton(){
//        System.out.println("Singleton has been initialized.");
//    }
//    private static Singleton singleton = new Singleton();
//
//    public Singleton getInstance() {
//        return singleton;
//    }

// -----------------------------------------------------


}
