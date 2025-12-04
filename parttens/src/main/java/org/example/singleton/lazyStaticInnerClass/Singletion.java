package org.example.singleton.lazyStaticInnerClass;

public class Singletion {
    private Singletion() {}

    private static class SingletionHolder {
        private static final Singletion INSTANCE = new Singletion();
    }

    public static Singletion getInstance() {
        return SingletionHolder.INSTANCE;
    }

}
