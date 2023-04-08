package MainPackage.objectorientedprograming.encapsulation.getter;

public class Costing1 { // Encapsulation for hiding/wrapping data into single unit

    private int buildingcost=500000; // Use Private access MainPackage.JavaBasics.operators.modifier to restrict the access of data

    //----------------------------getter method to access data in private access-------------------//

    public int getBuildingcost() {
        return buildingcost;
    }

    public static void main(String[] args) {

    }
}

