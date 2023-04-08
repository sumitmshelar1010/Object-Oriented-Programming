package MainPackage.objectorientedprograming.inheritance;

public class ClassB extends ClassA { // we can acquire functions and behaviours of parent class to child class
                                     // It used to increase usability of code
                                     // allow to easy maintenance
    public void method2(int w, int z){
        w= w-z;
        System.out.println(w);
    }

    public static void main(String[] args) {
        ClassB t1 = new ClassB();  //Single inheritance
        t1.method1(100,200);
        ClassB t2 = new ClassB();
        t1.method2(600,300);
    }

}
