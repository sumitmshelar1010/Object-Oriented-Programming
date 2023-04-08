package MainPackage.objectorientedprograming.downcasting;

public class ChildClass extends ParentClass{
int age;
   /* void m1(){
         super.m1();
        System.out.println("It is a Child class method");
    }*/
    public static void main(String[] args) {
        //----------------------------Downcasting---------------------//
        ParentClass p1 = new ChildClass();
        ChildClass c1 = (ChildClass) p1;
        c1.age=50;
        System.out.println(c1.age);
        c1.name="King";
        System.out.println(c1.name);
        c1.m1();
    }
}
