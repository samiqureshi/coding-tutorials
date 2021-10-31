package FightEngine;

import Characters.Character;
import Utilities.Utilities;

public class FightThread extends Thread{
    public Character character1;
    public Character character2;
    public float cooldown;

    public FightThread(Character c1, Character c2){
        this.character1 = c1;
        this.character2 = c2;
        this.cooldown = Utilities.dexToCooldown(character1.dexterity);
    }

    @Override
    public void run(){
        while(character1.health > 0 && character2.health > 0){
            try{
                Thread.sleep((int)cooldown*1000);
                int dmg = character1.attack();
                int blk = character2.defend();
                System.out.println(character1.name + " ATTACKS " + character2.name + " with " + dmg + " damage");
                System.out.println(character2.name + " DEFENDS " + character1.name + "'s attack with " + blk);
                int effectiveDmg = dmg - blk;
                if(effectiveDmg > 0){
                    character2.health = character2.health - effectiveDmg;
                }
                character1.printHealthInfo();
                character2.printHealthInfo();

                System.out.println("HELLO " + character1.name);
            }
            catch(Exception ex){
                ex.printStackTrace();
            }
        }
    }

}
