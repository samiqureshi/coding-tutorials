import Characters.Character;
import Characters.SamCharacter;

public class Main {
    public static void main(String[] args) {
        System.out.println("HELLO");
        Character c1 = new SamCharacter();
        c1.printInfo();
        Character c2 = new SamCharacter();
        c2.printInfo();
        c1.fight(c2);
    }
}
