package org.example.state;

public class Client {
    public static void main(String[] args) {
        // 创建环境角色
        Context context = new Context();
        // 设置默认状态
        context.setLiftState(new ClosingState());

        // 执行操作
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}

