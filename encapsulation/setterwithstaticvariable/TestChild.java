package MainPackage.objectorientedprograming.encapsulation.setterwithstaticvariable;

public class TestChild extends TestParent{
    public static void main(String[] args) {
        TestChild t1 = new TestChild();
        t1.setMoney(1000);
        System.out.println(t1.getMoney());
    }
}
