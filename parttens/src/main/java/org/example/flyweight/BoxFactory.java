package org.example.flyweight;

import javax.swing.*;
import java.util.HashMap;

public class BoxFactory {
    private HashMap<String,AbstractBox> map;

    private BoxFactory(){
        map = new HashMap<String,AbstractBox>();
        map.put("L",new LBox());
        map.put("I",new IBox());
        map.put("O",new OBox());
    }

    public static BoxFactory getInstance(){
        return factory;
    }

    public static BoxFactory factory = new BoxFactory();

    public AbstractBox getShape(String name){
        return map.get(name);
    }
}
