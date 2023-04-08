package MainPackage.objectorientedprograming.polymorph.Overriding;

public class PnBank extends RbiBank {
    public void loanInterestRate(){
        float repoRate=3.5f;
        float loanIntRate= 5.5f;
        float finalRateOfInterest = repoRate + loanIntRate;
        System.out.println(finalRateOfInterest);
}

    public static void main(String[] args) {
        PnBank r1 = new PnBank();
        r1.loanInterestRate();
    }
}
