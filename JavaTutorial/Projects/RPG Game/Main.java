import Characters.Character;
import Characters.SamCharacter;

public class Main {
    public static void main(String[] args){
        Character c1 = new SamCharacter();
        Character c2 = new SamCharacter();
        c1.fight(c2);

    }
}
