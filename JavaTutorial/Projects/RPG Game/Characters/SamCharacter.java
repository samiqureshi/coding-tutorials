package Characters;

public class SamCharacter extends Character {

    @Override
    public void fight(Character other) {
        System.out.println("This Character: " + this.name);
        System.out.println("Other Character: " + other.name);
        
    }
    
}
