package structural.Proxy;

import java.lang.reflect.InvocationHandler;

/**
 * Created by Art1st on 17/10/18.
 */
public class Main {
    public static void main(String[] args) {
        //静态代理
        Subject subject = new Proxy();
        subject.operate();

        //动态代理
        RealSubject realSubject = new RealSubject();
        InvocationHandler dynamicProxy = new DynamicProxy<Subject>(realSubject);
        Subject subject1 = (Subject) java.lang.reflect.Proxy.newProxyInstance(realSubject.getClass().getClassLoader(),
                                                                    realSubject.getClass().getInterfaces(),
                                                                    dynamicProxy);
        subject1.operate();
    }
}
