import java.util.Scanner;

import Characters.Character;
import Characters.SamCharacter;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("1 - Choose Character");
        System.out.print("2 - Create Character");
        System.out.print("Enter Choice [1 or 2]");
        int choice = sc.nextInt();
        Character c1 = null;
        Character c2 = null;
        if(choice==1){

        }
        else{
            c1 = new SamCharacter();
            c2 = new SamCharacter();
        }        
        c1.fight(c2);

    }

    public static Character loadCharacter(){

    }
}
