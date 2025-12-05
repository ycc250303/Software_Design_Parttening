package org.example.adapter.classAdapter;

public class Computer {
    public String readSD(SDCard sdCard){
        if(sdCard == null){
            throw new NullPointerException("SDCard is null");
        }
        return sdCard.readSD();
    }

    public void writeSD(SDCard sdCard, String msg){
        if(sdCard == null){
            throw new NullPointerException("SDCard is null");
        }
        sdCard.writeSD(msg);
    }
}
