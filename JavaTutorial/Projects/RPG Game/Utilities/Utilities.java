package Utilities;

public class Utilities {
    public static float dexToCooldown(int dex){
        return (float)(10.5625 - (0.5625 * dex));
    }

    public static int atkToDmg(int atk){
        float dmg = 0;
        dmg = (float)((0.5625*atk) + 0.4375);        
        double random = 1 + Math.random();
        int rndDmg = (int)(random * dmg);
        return rndDmg;
    }

    public static int defToBlk(int def){
        float blk = 0;
        blk = (float)((0.25*def) + 0.75);
        double random = 1 + Math.random();
        int rndBlk = (int)(random*blk);
        return rndBlk;
    }
}
