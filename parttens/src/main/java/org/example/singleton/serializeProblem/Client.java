package org.example.singleton.serializeProblem;

import org.example.singleton.serializeProblem.Singletion;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Client {
    public static void main(String[] args) throws Exception{
        writeObjectToFile();
        readObjectFromFile();
        readObjectFromFile();
    }

    public static void readObjectFromFile() throws Exception{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\35160\\Desktop\\test.txt"));

        Singletion instance = (Singletion) ois.readObject();

        System.out.println(instance);

        ois.close();
    }

    public static void writeObjectToFile() throws Exception{
        Singletion instance = Singletion.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\35160\\Desktop\\test.txt"));

        oos.writeObject(instance);
        oos.close();
    }
}
