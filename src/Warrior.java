package src;

import java.math.RoundingMode;

public class Warrior extends Character implements Attacker{
    private int stamina;
    private int strength;
    private int hp;

    public Warrior(String name, int hp, int stamina, int strength) {
        super(name, hp);
        setHp(hp);
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

    public int heavyAttack(){
        return getStrength();
    }
    public int weakAttack(){
        return Math.round((float) getStrength()/2 );
    }

    @Override
    public int getHp() {
        return hp;
    }

    @Override
    public void setHp(int hp) {
        this.hp = (int) (Math.random() * 200 + 100);
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = (int) (Math.random() * 50 + 10);
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {

        this.strength = (int) (Math.random() * 10 + 1);
    }


}
