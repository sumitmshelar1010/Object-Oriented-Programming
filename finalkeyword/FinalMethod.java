package MainPackage.objectorientedprograming.finalkeyword;

public class FinalMethod {

    final void method1(int a, int b){ //final method
        System.out.println(a+b);
    }//We can overload final method
    // we cannot override final method

    final void method1 (int a, int b, int c){ // overloaded final method
        System.out.println(a+b+c);}

    public static void main(String[] args){
        FinalMethod f1 = new FinalMethod();
        f1.method1(100,200);
        f1.method1(100,200,300);}}
