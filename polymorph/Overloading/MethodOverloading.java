package MainPackage.objectorientedprograming.polymorph.Overloading;

public class MethodOverloading {

     //when we have same methods but different numbers of parameters or different data types of parameters
    //at that time we will use Method Overloading
     public void Method1( int a, String b,float c){
        System.out.println(a+" "+b+" "+c);
}
     public void Method1( int a, String b,float c,int d){
        System.out.println(a+" "+b+" "+c+" "+d);
        }
    public void Method1( String a, float b,int c){
        System.out.println(a+" "+b+ " "+c);
    }
    public static void main(String[] args) {
        MethodOverloading M1 = new MethodOverloading();
        M1.Method1(10,"Sumit", 90.5F);
        M1.Method1(20,"Sumit",99.5f,50);
        M1.Method1("Sumit",50.5f,90);

    }
}
