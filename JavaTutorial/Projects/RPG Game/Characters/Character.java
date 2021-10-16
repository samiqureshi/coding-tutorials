package Characters;

import java.util.Scanner;

public abstract class Character {
    public String name;
    public int age;
    public int level;
    public int attack;
    public int defense;
    public int magic;
    public int health;

    public abstract void fight(Character other);

    public Character(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name of your character: ");
        this.name = sc.nextLine();
    }
}
