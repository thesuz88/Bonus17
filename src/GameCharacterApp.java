import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Steve on 7/17/2017.
 */
public class GameCharacterApp {

    public static void main(String[] args) {

        ArrayList<GameCharacter> gameCharacters = getGameCharacters();

        for (GameCharacter player : gameCharacters) {
            player.play();
            System.out.println("_____________________");
        }
    }

    private static ArrayList<GameCharacter> getGameCharacters() {
        Validate validate = new Validate();
        Scanner scan = new Scanner(System.in);
        ArrayList<GameCharacter> gameCharacters = new ArrayList<>();

        gameCharacters.add(new Warrior("Thor", 100, 47, "Hammer"));
        gameCharacters.add(new Warrior("Rambo", 87, 62, "Bow and Arrow"));
        gameCharacters.add(new Wizard("Harry Potter", 57, 94, 68, 4));
        gameCharacters.add(new Wizard("Merlin", 24, 110, 92, 7));
        gameCharacters.add(new Wizard("Gandalf", 62, 82, 88, 12));

        System.out.println("Welcome to Fantasy World!");
        if(validate.validateContinue()){
            System.out.println("Which class would you like to be?\nChoose:\n1-Wizard\n2-Warrior");
            int classChoice = validate.numberIsBetweenTwoNumbers(1,2);
            if(classChoice == 1){
                System.out.println("Enter character name:");
                String charName = scan.nextLine();
                System.out.println("What do you want your focus to be?\n1-Magical Energy\n2-Number or spells");
                int focus = validate.numberIsBetweenTwoNumbers(1,2);
                if (focus == 1){
                    gameCharacters.add(new Wizard (charName, 30,80,100,2));
                }
                else if (focus ==2){
                    gameCharacters.add(new Wizard(charName,30,80,70,5));
                }
            }else if (classChoice == 2){
                System.out.println("Enter character name:");
                String charName = scan.nextLine();
                System.out.println("Choose a weapon:\n1-Hammer\n2-Long Sword\n3-Bow and Arrow");
                int weapon = validate.numberIsBetweenTwoNumbers(1,3);
                if(weapon ==1){
                    gameCharacters.add(new Warrior(charName, 75,35,"Hammer"));
                }
                else if (weapon == 2){
                    gameCharacters.add(new Warrior(charName,68,55, "Long Sword"));
                }
                else if (weapon == 3){
                    gameCharacters.add(new Warrior(charName, 60,65,"Bow and Arrow"));
                }
            }
        }else {
            System.out.println("Choose Your Character: ");
        }

        return gameCharacters;
    }
}




