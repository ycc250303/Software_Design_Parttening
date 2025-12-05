package org.example.proxy.jdkDynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {

    private final TrainStation trainStation = new TrainStation();
    public SellTickets getProxyObject(){
        // 返回代理对象
        return (SellTickets) Proxy.newProxyInstance(
                trainStation.getClass().getClassLoader(),
                trainStation.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("jdk代理代售点收取服务费");
                        return method.invoke(trainStation, args);
                    }
                }
        );
    }
}
