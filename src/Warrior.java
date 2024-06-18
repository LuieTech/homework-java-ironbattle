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

        int warriorAttack = 0;
        int characterHp = character.getHp();

        if(this.stamina >= 5){
            warriorAttack = heavyAttack();
        } else if(this.stamina >= 1) {
            warriorAttack = weakAttack();
        } else {
            setStamina(getStamina() + 2);
        }

        int attackResult = characterHp - warriorAttack;
        character.setHp(attackResult);
    }

    public int heavyAttack(){
        setStamina(getStamina() - 5);
        return getStrength();
    }
    public int weakAttack(){
        setStamina(getStamina()+1);
        return Math.round((float) getStrength()/2 );
    }

    @Override
    public int getHp() {
        return hp;
    }

    @Override
    public void setHp(int hp) {
        if(hp < 100 || hp > 200){
            this.hp = (int) (Math.random() * 101 + 100);
        } else {
            this.hp = hp;
        }
        super.setHp(this.hp);
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        if(stamina < 10 || stamina > 50){
            this.stamina = (int) (Math.random() * 41 + 10);
        } else {
            this.stamina = stamina;
        }
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {

        if(strength < 1 || strength > 10){
            this.strength = (int) (Math.random() * 10 + 1);
        } else {
            this.strength = strength;
        }
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "stamina=" + stamina +
                ", strength=" + strength +
                ", hp=" + hp +
                '}';
    }
}
