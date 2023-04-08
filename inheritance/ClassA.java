package MainPackage.objectorientedprograming.inheritance;

public class ClassA {
    public void method1(int x,int y){
        x=x+y;
        System.out.println(x);
    }

    public static void main(String[] args) {
        ClassA t =new ClassA();
        t.method1(100,200);
    }
}
