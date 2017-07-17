import java.util.ArrayList;

/**
 * Created by Steve on 7/17/2017.
 */
public class MagicUsingCharacters extends GameCharacter {

    private int magicalEnergy;

    public MagicUsingCharacters(String name, int strength, int intelligence, int magicalEnergy) {
        super(name, strength, intelligence);
        this.magicalEnergy = magicalEnergy;
    }

    public int getMagicalEnergy() {
        return magicalEnergy;
    }

    @Override
    public void play() {
        super.play();
        System.out.println("Magical Energy: " + getMagicalEnergy());

    }
}
