package org.example.singleton.reflectionProblem;

import java.io.Serializable;

public class Singletion implements Serializable {

    private static boolean flag = false;

    private Singletion() {
        synchronized (Singletion.class) {
            if (flag) {
                throw new RuntimeException("不能创建多个对象");
            }
            flag = true;
        }
    }

    private static class SingletionHolder {
        private static final Singletion INSTANCE = new Singletion();
    }

    public static Singletion getInstance() {
        return SingletionHolder.INSTANCE;
    }

    // 防止序列化
    public Object readResolve() {
        return getInstance();
    }
}
