package org.example.adapter.objectAdapter;

public class SDAdapterTF implements SDCard {
    private final TFCard tfCard;

    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }
    @Override
    public String readSD() {
        System.out.println("类适配器模式，读取TF卡");
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("类适配器模式，写入TF卡");
        tfCard.writeTF(msg);
    }
}
