package MainPackage.objectorientedprograming.downcasting;

public class ParentClass {
    String name;
    void m1(){
        System.out.println("It is a Parent class method");
    }

    public static void main(String[] args) {
        ParentClass p1=new ParentClass();
                p1.m1();
    }
}
