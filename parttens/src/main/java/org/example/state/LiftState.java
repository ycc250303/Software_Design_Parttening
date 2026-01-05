package org.example.state;

/**
 * 抽象状态类
 */
public abstract class LiftState {
    // 定义环境角色，记录当前状态
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    // 电梯门开
    public abstract void open();

    // 电梯门关
    public abstract void close();

    // 电梯运行
    public abstract void run();

    // 电梯停止
    public abstract void stop();
}

