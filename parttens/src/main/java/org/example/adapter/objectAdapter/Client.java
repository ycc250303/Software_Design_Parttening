package org.example.adapter.objectAdapter;

public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        String msg = computer.readSD(new SDCardImpl());
        System.out.println(msg);

        // 使用适配器
        SDAdapterTF sdAdapterTF = new SDAdapterTF(new TFCardImpl());
        msg = computer.readSD(sdAdapterTF);
        System.out.println(msg);
    }
}
