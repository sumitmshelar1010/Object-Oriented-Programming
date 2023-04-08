package MainPackage.objectorientedprograming.upcasting;

public class ChildClass extends ParentClass {
    void m1(){
        System.out.println(" it is a Child class");
    }

    public static void main(String[] args) {
        ChildClass c1 = new ChildClass();
        c1.m1();
        //--------------------------Upcasting-------------------------------//
        ParentClass p1=new ChildClass();
        p1.m1();
    }
}
