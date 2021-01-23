package behavioral.stragyExample;

public class Mage {

    private int lvl = 1;
    private AttackStrategy attackStrategy;

    public Mage() {
        attackStrategy = new BasicAttack();
    }

    public void attack() {
        attackStrategy.attack();
    }

    public void levelUp() {
        lvl++;
        updateAttackStrategy();
    }

    private void updateAttackStrategy() {
        if (lvl > 3) {
            attackStrategy = new AdvancedAttack();
        }
    }


}
