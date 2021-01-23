package behavioral.stragyExample;

public class Demo {

    public static void main(String[] args) {
        //Strategy
        Mage mage = new Mage();
        mage.attack();
        mage.levelUp();
        mage.attack();
        mage.levelUp();
        mage.attack();
        mage.levelUp();
        mage.attack();
    }

}
