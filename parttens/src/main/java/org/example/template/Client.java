package org.example.template;

public class Client {
    public static void main(String[] args) {
        ConcreteClass_Baocai baocai = new ConcreteClass_Baocai();
        baocai.coolProcess();

        ConcreteClass_Caixin caixin = new ConcreteClass_Caixin();
        caixin.coolProcess();
    }
}
