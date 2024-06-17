package src;
import java.util.Random;

public class Wizard extends Character implements Attacker{
        private int mana;
        private int intelligence;
        private Random random;
        private int damageDealtByWiz;

    public Wizard(String name, int hp) {
        super(name, hp);
        this.mana = (int)(Math.random() * 41) + 10;  // 10 to 50;
        this.intelligence = (int)(Math.random() * 50) + 1;  // 1 to 50
        this.random = new Random();

    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void castFireball() {
        System.out.println("Cast Fireball");
        mana -= 5;
    }

    public void staffHit() {
        System.out.println("Staff hit");
        mana += 1;
    }

    public void noManaToAttack() {
        System.out.println("No mana left to attack");
        mana += 2;
    }

    public void randomWizardAttack() {
        if (mana >= 5) {
            if (random.nextBoolean()) {
                castFireball();
            } else {
                staffHit();
            } else if (mana >= 1) {
                staffHit();
            } else {
                noManaToAttack();
        }
    }

    @Override
    public void attack(Character character) {
        randomWizardAttack();
    }






}
