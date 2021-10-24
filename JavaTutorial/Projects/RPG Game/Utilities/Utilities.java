package Utilities;

public class Utilities {
    public static float dexToCooldown(int dex){
        return (float)(10.5625 - (0.5625 * dex));
    }
}
