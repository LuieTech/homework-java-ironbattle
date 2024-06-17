package src;
import java.util.Random;

public class Wizard extends Character implements Attacker{
        private int mana;
        private int intelligence;
        private Random random;
        private int damageDealtbyWiz;

    public Wizard(String name, int hp) {
        super(name, (int) (Math.random() * 51) + 50);
        this.mana = (int)(Math.random() * 41) + 10;
        this.intelligence = (int)(Math.random() * 50) + 1;
        this.random = new Random();
        this.damageDealtbyWiz = 0;
        setAlive(true);

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

    public void castFireball(Character character) {
        System.out.println("Cast Fireball");
        mana -= 5;
        damageDealtbyWiz = intelligence;
        int characterHp = character.getHp();
        int attackResult = characterHp - damageDealtbyWiz;
        character.setHp(attackResult);
    }

    public void staffHit(Character character) {
        System.out.println("Staff hit");
        mana += 1;
        damageDealtbyWiz = 2;
        int characterHp = character.getHp();
        int attackResult = characterHp - damageDealtbyWiz;
        character.setHp(attackResult);
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
            }
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
