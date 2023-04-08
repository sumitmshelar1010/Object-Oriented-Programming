package MainPackage.objectorientedprograming.callby.callbyvalue;

public class CallByValue {
    int a=100;
    void method1(int a){
       a=a+500;
        System.out.println("Inside Method1"+ " "+a);
    }

    public static void main(String[] args) {
        CallByValue v1 = new CallByValue();
        v1.method1(50);// CALLED BY VALUE OF INSTANCE VARIABLE,THE CHANGES BEING DONE IN THE CALLED METHOD1
       // v1.method1(v1.a);
        System.out.println("After Method1"+ " " +v1.a);
    }
}
