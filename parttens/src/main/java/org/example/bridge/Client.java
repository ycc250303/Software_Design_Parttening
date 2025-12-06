package org.example.bridge;

public class Client {
    public static void main(String[] args) {
        OperatingSystem os = new Windows(new AviFile());
        os.play("windows.avi");
    }
}
