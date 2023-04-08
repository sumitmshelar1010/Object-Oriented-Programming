package MainPackage.objectorientedprograming.encapsulation.setterwithstaticvariable;

public class TestParent  implements java.io.Serializable {

    private static int money; //WE ARE USING STATIC VARIABLE
    public static int getMoney() {
        return money;
    }
    public static void setMoney(int money) {
        TestParent.money = money; /*IF WE USE STATIC VARIABLE WITH PRIVATE ACCESS MODIFIER THEN SETTER METHOD USE
                                     CLASS NAME.VARIABLE OTHERWISE FOR NON-STATIC VARIABLE IT WILL USE THIS KEYWORD */
    }
    public static void main(String[] args){}
}