package org.example.builder;

public class Phone {
    private String cpu;
    private String screen;
    private String memory;
    private String mainboard;

    private Phone(Builder builder){
        this.cpu = builder.cpu;
        this.screen = builder.screen;
        this.memory = builder.memory;
        this.mainboard = builder.mainboard;
        System.out.println("手机创建成功");
    }

   @Override
   public String toString(){
       return "手机的配置是："+cpu+"--"+screen+"--"+memory+"--"+mainboard;
    }

    public static class Builder{
        private String cpu;
        private String screen;
        private String memory;
        private String mainboard;

        public Builder setCpu(String cpu){
            this.cpu = cpu;
            return this;
        }

        public Builder setScreen(String screen){
            this.screen = screen;
            return this;
        }

        public Builder setMemory(String memory){
            this.memory = memory;
            return this;
        }

        public Builder setMainboard(String mainboard){
            this.mainboard = mainboard;
            return this;
        }

        public Phone build(){
            Phone phone = new Phone(this);
            phone.cpu = this.cpu;
            phone.screen = this.screen;
            phone.memory = this.memory;
            phone.mainboard = this.mainboard;
            return phone;
        }
    }
}
