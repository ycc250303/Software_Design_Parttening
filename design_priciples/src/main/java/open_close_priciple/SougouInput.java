package open_close_priciple;

public class SougouInput {
    private AbstarctSkin skin;

    public void setSkin(AbstarctSkin skin){
        this.skin = skin;
    }

    public void display(){
        this.skin.display();
    }
}
