package org.example.observer;

public class Client {
    public static void main(String[] args) {
        // 1. 创建公众号
        SubscriptionSubject subject = new SubscriptionSubject();

        // 2. 订阅公众号
        subject.addObserver(new WeiXinUser("张三"));
        subject.addObserver(new WeiXinUser("李四"));
        subject.addObserver(new WeiXinUser("王五"));

        // 3. 公众号发布消息
        subject.notifyObservers("黑马程序员的专栏更新了！");
    }
}

