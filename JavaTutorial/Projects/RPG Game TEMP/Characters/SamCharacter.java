package Characters;

import java.util.Scanner;

import Utilities.Utilities;

public class SamCharacter extends Character {


    public SamCharacter(){
        super();
    }

    @Override
    public int attack() {
        return Utilities.atkToDamage(this.attack);
    }

    @Override
    public int defend() {
        return Utilities.defToBlock(this.defense);        
    }

    @Override
    public void special() {
        // TODO Auto-generated method stub
        
    }
    
}
