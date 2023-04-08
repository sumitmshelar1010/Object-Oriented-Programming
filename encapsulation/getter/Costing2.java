package MainPackage.objectorientedprograming.encapsulation.getter;

public class Costing2 extends Costing1{

    public static void main(String[] args) {
        Costing2 c2 = new Costing2();
        c2.getBuildingcost(); // use variable created by using getter method
        System.out.println(c2.getBuildingcost());
    }
}
