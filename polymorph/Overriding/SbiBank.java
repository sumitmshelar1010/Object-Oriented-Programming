package MainPackage.objectorientedprograming.polymorph.Overriding;

public class SbiBank extends RbiBank {
    //When we have same method with same parameters, same parameters data type then we will use overriding

public void loanInterestRate(){ //overriding method
    float repoRate=3.5f;
    float loanIntRate= 5f;
    float finalRateOfInterest = repoRate + loanIntRate;
    System.out.println(finalRateOfInterest);
}

    public static void main(String[] args) {
        SbiBank r1 = new SbiBank();
        r1.loanInterestRate();
    }
}