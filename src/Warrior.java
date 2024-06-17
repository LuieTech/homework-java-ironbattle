package src;

public class Warrior extends Character implements Attacker{
    private int stamina;
    private int strength;

    public Warrior(String name, int hp, int stamina, int strength) {
        super(name, hp);
        setStamina(stamina);
        setStrength(strength);
    }

    @Override
    public void attack(Character character) {
        int warriorAttack = getStrength();
        int characterHp = character.getHp();
        int attackResult = characterHp - warriorAttack;
        character.setHp(attackResult);
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = (int) (Math.random() * 50 + 10);
        this.stamina = stamina;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = (int) (Math.random() * 10 + 1);
        this.strength = strength;
    }
}
