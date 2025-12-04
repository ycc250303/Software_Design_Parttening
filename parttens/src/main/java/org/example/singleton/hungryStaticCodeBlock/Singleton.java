package org.example.singleton.hungryStaticCodeBlock;

/**
 * 懒汉式单例模式
 * 静态代码块实现
 */
public class Singleton {
    // 私有构造方法
    private Singleton() {}

    // 静态变量
    private static Singleton instance;

    // 静态代码块
    static {
        instance = new Singleton();
    }

    // 静态方法
    public static Singleton getInstance() {
        return instance;
    }
}
