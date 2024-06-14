package src;

public class Wizard extends Character{
        private int mana = (int)(Math.random() * 41) + 10;  // 10 to 50
        private int intelligence = (int)(Math.random() * 50) + 1;  // 1 to 50

    public Wizard(String name, int hp) {
        super(name, hp);
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
    // A public function that overloads attack() implemented in the Attacker
}
