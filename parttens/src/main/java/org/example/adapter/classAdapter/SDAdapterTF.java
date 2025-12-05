package org.example.adapter.classAdapter;

public class SDAdapterTF extends TFCardImpl implements SDCard{
    @Override
    public String readSD() {
        System.out.println("类适配器模式，读取TF卡");
        return readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("类适配器模式，写入TF卡");
        writeTF(msg);
    }
}
