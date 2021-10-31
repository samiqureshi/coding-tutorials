package Characters;

import Utilities.Utilities;

public class SamCharacter extends Character {

    public SamCharacter(){
        super();
    }

    @Override
    public int attack() {
        return Utilities.atkToDmg(this.attack);
    }

    @Override
    public int defend() {
        return Utilities.defToBlk(this.defense);               
    }

    @Override
    public void special() {
        // TODO Auto-generated method stub
        
    }

    
    
}
