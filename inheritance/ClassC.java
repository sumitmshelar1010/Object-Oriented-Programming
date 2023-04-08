package MainPackage.objectorientedprograming.inheritance;

public class ClassC extends ClassB {
    static public void  main(String[] args) {
        ClassC t3 = new ClassC();
        t3.method1(100,200); // multi level inheritance
        t3.method2(600,300);

        // If Single parent class inherited by two or more child class so, it is hierarchical inheritance
    }
}
