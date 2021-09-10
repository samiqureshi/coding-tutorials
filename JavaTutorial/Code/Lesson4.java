
public class Lesson4 {

    public static void main(String[] args) {
        int[] integers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        String[] strings = { "Scorpion", "Sub Zero", "Liu Kang" };
        float[] floats = { 1.2f, 3.456f, 37.2f, 0.003f };
        boolean b = true;

        int i = 0;
        while (i < strings.length) {
            System.out.print(strings[i] + " | ");
            i++;
        }

    }

    // public static void main(String[] args){
    // int[] integers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    // String[] strings = {"Sub Zero", "Scorpion", "Kung Lao", "Liu Kang"};

    // int i = 0;
    // while(i < strings.length){
    // System.out.print(strings[i] + " | ");
    // i = i+1;
    // }
    // }
}