package FightEngine;

import Characters.Character;
import Utilities.Utilities;

public class FightThread extends Thread{
    public Character character1;
    public Character character2;
    public Thread t;
    public float cooldown;

    public FightThread(Character c1, Character c2){
        this.character1 = c1;
        this.character2 = c2;
        this.cooldown = Utilities.dexToCooldown(character1.dexterity);
    }
}
