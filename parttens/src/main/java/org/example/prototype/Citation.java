package org.example.prototype;

import java.io.Serializable;

public class Citation implements Cloneable, Serializable {
    private Student student;

    public void setStu(Student stu) {
        this.student = stu;
    }

    public Student getStu() {
        return this.student;
    }

    public void show(){
        System.out.println(this.student.getName()+"同学：被评为三好学生。");
    }
    @Override
    public Citation clone() throws CloneNotSupportedException{
        System.out.println("奖状复制成功");
        return (Citation)super.clone();
    }
}
