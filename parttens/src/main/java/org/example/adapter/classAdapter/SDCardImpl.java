package org.example.adapter.classAdapter;

public class SDCardImpl implements SDCard{
    @Override
    public String readSD() {
        return "SD卡读取数据";
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("SDCardImpl 写入数据" + msg);
    }
}
