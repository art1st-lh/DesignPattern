package structural.Proxy;

import java.lang.reflect.*;
import java.lang.reflect.Proxy;

/**
 * Created by Art1st on 17/10/18.
 */
public class DynamicProxy<T> implements InvocationHandler {

    T clazz = null;

    public DynamicProxy(T clazz) {
        this.clazz = clazz;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理执行：" + method.getName()+" 方法");
        System.out.println("Before invocation:  ");
        Object realVal = method.invoke(clazz,args);
        System.out.println("After invocation:   ");
        return realVal;
    }

    public Object createProxy(ClassLoader loader, Class<?>[] interfaces, InvocationHandler invocationHandler) {
        return Proxy.newProxyInstance(loader,interfaces,invocationHandler);
    }

}
