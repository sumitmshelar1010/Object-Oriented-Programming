package MainPackage.objectorientedprograming.encapsulation.setter;


public class Pricing2 extends Pricing1 {
    int p = 1000;
    public static void main(String[] args) {
        Pricing2 p2  = new Pricing2();
        p2.setName("Hero");
        p2.setA(10000);
        System.out.println("Name of Cycle          = "+" "+ p2.getName());
        System.out.println("Price of Cycle (In Rs) = "+ " "+p2.getA());
        System.out.println("Price of Accessories   = " + " "+p2.p);
        System.out.println("Final Price of Cycle   = "+" " + (p2.getA()+p2.p));
    }
}

