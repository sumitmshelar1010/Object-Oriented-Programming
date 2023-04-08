package MainPackage.objectorientedprograming.abstractioninterface;

public class RedColor implements PaintColor{

    public void oilpaintcolor() {
        System.out.println("Color of wall is Red");
    }
    @Override
    public void method1() {
    }

    public static void main(String[] args) {
        PaintColor p1= new RedColor();
        p1.oilpaintcolor();
    }
}
