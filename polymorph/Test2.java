package MainPackage.objectorientedprograming.polymorph;


public class Test2 extends Test1 {
    public void method2(){
        int a =200;
        System.out.println(a);
    }

    public void method1(){
        int a=20;
        System.out.println(a);
    }

    public static void main(String[] args) {
Test2 t2 = new Test2();
t2.method1();
t2.method2();
    }}
