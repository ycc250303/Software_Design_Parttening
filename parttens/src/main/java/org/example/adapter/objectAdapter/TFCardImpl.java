package org.example.adapter.objectAdapter;

public class TFCardImpl implements TFCard {
    @Override
    public String readTF() {
        return "TF卡读取数据";
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("TF卡写入数据：" + msg);
    }
}
