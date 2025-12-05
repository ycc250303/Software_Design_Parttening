package org.example.proxy.jdkDynamicProxy;

public class Client {
    public static void main(String[] args) {
        // 创建代理对象
        ProxyFactory proxyFactory = new ProxyFactory();
        // 获取代理对象
        SellTickets proxyObject = proxyFactory.getProxyObject();
        // 调用代理对象
        proxyObject.sell();
    }
}
