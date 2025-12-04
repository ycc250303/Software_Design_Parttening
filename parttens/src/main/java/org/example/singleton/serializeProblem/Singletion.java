package org.example.singleton.serializeProblem;

import java.io.Serializable;

public class Singletion implements Serializable {

    private Singletion() {}

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
