package src.solid.p2_ocp;

public class CircleArea implements CaluclateArea{
    private final long radius;

    public CircleArea(long radius){
        this.radius =radius;
    }
    @Override
    public double caluclateArea() {
        return Math.PI* radius * radius;
    }
}
