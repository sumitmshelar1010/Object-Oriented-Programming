package MainPackage.objectorientedprograming.abstractionexample;

public class FeedBackOfBike {
    public static void main(String[] args) {

        PerformanceOfBike p1 = new LifeOfBike();

        p1.bajaj();
        p1.honda();
        p1.mahindra();

        PerformanceOfBike p2 =new AverageOfBike();
        p2.bajaj();
        p2.honda();
        p2.mahindra();

    }
}
