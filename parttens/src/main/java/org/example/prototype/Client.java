package org.example.prototype;

import java.io.*;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        // 浅克隆
        Citation r1 = new Citation();

        Student s = new Student();
        s.setName("张三");
        r1.setStu(s);

        Citation r2 = r1.clone();
        r2.getStu().setName("李四");

        r1.show();
        r2.show();

        // 深克隆
        Citation c = new Citation();
        c.setStu(new Student());
        c.getStu().setName("张三");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:/test1/a.txt"));
        oos.writeObject(c);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:/test1/a.txt"));
        Citation c2 = (Citation)ois.readObject();
        c2.getStu().setName("王五");

        c.show();
        c2.show();
    }
}
