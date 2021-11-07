package FightEngine;

import Characters.Character;
import Utilities.Utilities;

public class FightThread extends Thread{

    public float cooldown;
    public Character character1;
    public Character character2;
    public Thread t;
    public  FightThread(Character c1, Character c2){
        this.character1 = c1;
        this.character2 = c2;
        this.cooldown = Utilities.dexToCooldown(character1.dexterity);

    }

    @Override
    public void run(){
        while(character1.health > 0 && character2.health > 0){
            try{
                Thread.sleep((int)cooldown*1000);
                int atk = character1.attack();
                int def = character2.defend();
                System.out.println(character1.name + " ATTACKS " + character2.name + " with " + atk + " damage.");
                System.out.println(character2.name + " DEFENDS " + character1.name + "'s attack with " + def);
                int effectiveDamage = atk - def;
                if(effectiveDamage > 0){
                    character2.health = character2.health - effectiveDamage;
                }
                character1.printHealthInfo();
                character2.printHealthInfo();
            }
            catch(Exception ex){
                ex.printStackTrace();
            }
        }
        if(character1.health > 0){
            System.out.println(character1.name + " WINS!!");
            this.interrupt();
        }
        else{
            System.out.println(character1.name + " LOSES!!");
            this.interrupt();
        }
    }

}
