package liskov_substitution_principle;

public class Square implements Quadrilateral {
    private double side;

    public void setSide(double side){
        this.side = side;
    }

    public double getSide(){
        return side;
    }

    @Override
    public double getLength() {
        return side;
    }

    @Override
    public double getWidth() {
        return side;
    }
}
