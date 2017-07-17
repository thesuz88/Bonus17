import java.util.ArrayList;

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
        ArrayList<GameCharacter> gameCharacters = new ArrayList<>();

        gameCharacters.add(new Warrior("Thor", 100, 47, "Hammer"));
        gameCharacters.add(new Warrior("Rambo", 87, 62, "Bow and Arrow"));
        gameCharacters.add(new Wizard("Harry Potter", 57, 94, 68, 4));
        gameCharacters.add(new Wizard("Merlin", 24, 110, 92, 7));
        gameCharacters.add(new Wizard("Gandalf", 62, 82, 88, 12));

        return gameCharacters;
    }
}




