package org.example.prototype;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
