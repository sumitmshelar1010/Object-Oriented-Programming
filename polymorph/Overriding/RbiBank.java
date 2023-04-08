package MainPackage.objectorientedprograming.polymorph.Overriding;

public class RbiBank {
    public void loanInterestRate(){
        float repoRate=3.5f;
        System.out.println(repoRate);
    }
    public static void main(String[] args) {
        RbiBank r1 = new RbiBank();
        r1.loanInterestRate();

    }
}
