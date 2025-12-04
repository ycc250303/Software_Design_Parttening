package org.example.singleton.lazyDoubleLock;

/**
 * 懒汉式单例模式。线程不安全
 */

// 需要添加synchronized才安全
public class Singletion {
    // 懒汉式单例模式
    private Singletion(){}

    // 创建一个静态变量
    private static volatile Singletion instance;

    // 创建一个静态方法
    public static Singletion getInstance(){

        if(instance == null){
            synchronized (Singletion.class) {
                // 抢到锁的线程，会创建一个实例
                if (instance == null) {
                    instance = new Singletion();
                }
            }
        }
        return instance;
    }
}
