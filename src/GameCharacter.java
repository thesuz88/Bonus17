import java.util.ArrayList;

/**
 * Created by Steve on 7/17/2017.
 */
public class GameCharacter {

    private String name;
    private int strength;
    private int intelligence;

    public GameCharacter(String name, int strength, int intelligence) {
        this.name = name;
        this.strength = strength;
        this.intelligence = intelligence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void play(){
        System.out.println("Name: " + getName());
        System.out.println("Strength: " + getStrength());
        System.out.println("Intelligence: " + getIntelligence());
    }

    @Override
    public String toString() {
        return "GameCharacter{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", intelligence=" + intelligence +
                '}';
    }
}
