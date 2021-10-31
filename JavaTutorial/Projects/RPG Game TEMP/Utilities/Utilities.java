package Utilities;

public class Utilities {
    public static float dexToCooldown(int dex){
        float cooldown = 0;
        cooldown = (float)(10.5625 - (0.5625 * dex));
        return cooldown;
    }

    public static int atkToDamage(int atk){
        float dmg = 0;
        dmg = (float)((0.5625*atk) + 0.4375);        
        double random = 1 + Math.random();
        int rndDmg = (int)(random * dmg);
        return rndDmg;
    }

    public static int defToBlock(int def){
        float blk = 0;
        blk = (float)((0.25*def) + 0.75);
        double random = 1 + Math.random();
        int rndBlk = (int)(random*blk);
        return rndBlk;

    }
    
}
