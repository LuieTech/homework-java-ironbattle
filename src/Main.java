package src;

public class Main {
    public static void main(String[] args) {
        Wizard gandalf = new Wizard("Gandalf");
        Wizard sauron =  new Wizard("Sauron");

        System.out.println("Create Wizards and print stats");

        System.out.println("Gandalf HP: " + gandalf.getHp());
        System.out.println("Gandalf Mana: " + gandalf.getMana());
        System.out.println("Gandalf Intelligence: " + gandalf.getIntelligence());

        System.out.println("Sauron HP: " + sauron.getHp());
        System.out.println("Sauron Mana: " + gandalf.getMana());
        System.out.println("Sauron Intelligence: " + gandalf.getIntelligence());

        System.out.println("Battle");

        gandalf.attack(sauron);
        sauron.attack(gandalf);

        System.out.println("Check Stats");

        System.out.println("Gandalf HP: " + gandalf.getHp());
        System.out.println("Gandalf Mana: " + gandalf.getMana());
        System.out.println("Gandalf Intelligence: " + gandalf.getIntelligence());

        System.out.println("Sauron HP: " + sauron.getHp());
        System.out.println("Sauron Mana: " + gandalf.getMana());
        System.out.println("Sauron Intelligence: " + gandalf.getIntelligence());


    }
}
