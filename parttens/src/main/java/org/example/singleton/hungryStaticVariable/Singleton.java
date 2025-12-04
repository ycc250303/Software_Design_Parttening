package org.example.singleton.hungryStaticVariable;

/**
 * 懒汉式，静态内部类
 */
public class Singleton {
    // 私有构造方法
    private Singleton() {}

    /**
     * 静态内部类
     */
    private static Singleton instance = new Singleton();

    // 静态方法
    public static Singleton getInstance() {
        return instance;
    }
}
