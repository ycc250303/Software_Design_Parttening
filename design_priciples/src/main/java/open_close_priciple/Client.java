package open_close_priciple;

public class Client {
    public static void main(String[] args){
        SougouInput input = new SougouInput();

        DefaultSkin skin = new DefaultSkin();

        input.setSkin(skin);

        input.display();
    }
}
