package MainPackage.objectorientedprograming.callby.callbyreference;

public class Test2 {

    public void method1(Test1 t){
        t.a=1000;
        t.b=2000;
        System.out.println("Inside a method"+ " "+t.a+":"+t.b);
    }
    public static void main(String[] args) {
        Test1 t1 =new Test1();
        t1.a=500;                //CHANGES will REFLECT IN THE CALLER'S SCOPE
        t1.b=300;                //CHANGES will REFLECT IN THE CALLER'S SCOPE
        System.out.println("just Outside a method"+ " "+t1.a+":"+ t1.b);
        Test2 t2=new Test2();
        t2.method1(t1);    // CALLED BY OBJECT REFERENCE
        System.out.println("Outside a method"+ " "+t1.a+":"+ t1.b);//CHANGES will REFLECT IN THE CALLER'S SCOPE

    }
}
