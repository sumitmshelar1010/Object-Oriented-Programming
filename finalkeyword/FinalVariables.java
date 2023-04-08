package MainPackage.objectorientedprograming.finalkeyword;

public class FinalVariables{
    final int a; //Final instance Variables
    FinalVariables(){ // Final instance variable initialized in between MainPackage.JavaBasics.constructor
        a=10;    //Because of Final Keyword we cannot provide another value for variable a
    }

    final static int c;//Final static Variables
    static{ c=20; // initialization in static block
        //Because of Final Keyword we cannot provide another value for variable c
        }

    void method1(){
        final int b; //Final local Variables
        b=30;  //Because of Final Keyword we cannot provide another value for variable b
        System.out.println(b);
    }

        public static void main(String[] args){
            FinalVariables f1 = new FinalVariables();
            System.out.println(f1.a);
            System.out.println(f1.c);
            f1.method1();
    }
}