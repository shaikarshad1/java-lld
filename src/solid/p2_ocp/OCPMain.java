package src.solid.p2_ocp;

public class OCPMain {
    public static void main(String[] args) {
        CaluclateArea circle=new CircleArea(5);
        System.out.println(circle.caluclateArea());

        CaluclateArea rectangleArea=new RectangleArea(3,7);
        System.out.println(rectangleArea.caluclateArea());
    }
}
