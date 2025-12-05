package org.example.adapter.classAdapter;

public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        String msg = computer.readSD(new SDCardImpl());
        System.out.println(msg);

        // 使用适配器
        msg = computer.readSD(new SDAdapterTF());
        System.out.println(msg);
    }
}
