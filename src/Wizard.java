import java.util.ArrayList;

/**
 * Created by Steve on 7/17/2017.
 */
public class Wizard extends MagicUsingCharacters {

    private int spellNumber;

    public Wizard(String name, int strength, int intelligence, int magicalEnergy, int spellNumber) {
        super(name, strength, intelligence, magicalEnergy);
        this.spellNumber = spellNumber;
    }



    public int getSpellNumber() {
        return spellNumber;
    }

    @Override
    public void play() {
        super.play();
        System.out.println("Spell Number: " + getSpellNumber());



    }
}
