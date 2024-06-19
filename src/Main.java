package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void startFight(Character char1, Character char2){
     char1.attack(char2);
     char2.attack(char1);
     //TODO: Fighting mechanic


    }
    public static void main(String[] args) {
        boolean start = true;
        List<Character> chars = new ArrayList<>();
        do {
            int option;
            Scanner in = new Scanner(System.in);
            System.out.println("""
                    ***********************************************************************
                     Welcome to the game!
                    
                     Please select an option before you continue!\

                     1: Create Wizard
                     2: Create Warrior
                     3: Start fight
                     4: Delete Previous Character
                     5: Quit Game
                    ************************************************************************""");

            option = in.nextInt();
            in.nextLine();
            String name;
            switch (option){
                case 1:
                    if (chars.size() >= 2){
                        System.out.println("Too many characters in the arena. Start the game to continue");
                    } else {
                        System.out.println("\nPlease enter your Wizard's Name: ");
                        name = in.nextLine();
                        Wizard mage = new Wizard(name);
                        chars.add(mage);
                    }
                    break;
                case 2:
                    if (chars.size() >= 2){
                        System.out.println("Too many characters in the arena. Start the game to continue");
                    } else {
                        System.out.println("\nPlease enter your Warrior's Name: ");
                        name = in.nextLine();
                        Warrior fighter = new Warrior(name);
                        chars.add(fighter);
                    }
                    break;
                case 3:
                    if (chars.size() != 2){
                        System.out.println("\nPlease add more characters before starting the fight!\n");

                    } else {
                        startFight(chars.get(0), chars.get(1));
                        chars.clear();
                    }
                    break;
                case 4:
                    if (chars.isEmpty()){
                        System.out.println("\nNo characters left to delete.\n");
                    }
                    else {
                        System.out.println("\n" + chars.get(chars.size()-1).getName() + " will be deleted.\n");
                        chars.remove(chars.size()-1);

                    }

                    break;
                case 5:
                    start = false;
                    System.out.println("Thank you for playing!");
                    break;
                default:
                    System.out.println("Missing or Wrong Input please try again.");
                    break;
            }


        }
        while (start);


    }
}

