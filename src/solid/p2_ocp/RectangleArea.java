package src.solid.p2_ocp;

public class RectangleArea implements CaluclateArea{
    private final long width;
    private final long height;

    public RectangleArea(long width, long height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double caluclateArea() {
        return width*height;
    }
}
