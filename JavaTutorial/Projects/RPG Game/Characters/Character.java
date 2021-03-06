package Characters;

import java.util.Scanner;

import FightEngine.FightThread;

public abstract class Character {
    public String name;
    public String characterClass;
    public int age;
    public int level;
    public int attack;
    public int defense;
    public int dexterity;
    public int magic;
    public int health;

    public abstract int attack();
    public abstract int defend();
    public abstract void special();

    public void fight(Character other){
        System.out.println("------FIGHT STARTING------");
        System.out.println(String.format("%s %s VS %s %s", this.getClass().getSimpleName(), this.name, other.getClass().getSimpleName(), other.name));
        FightThread t1 = new FightThread(this, other);
        FightThread t2 = new FightThread(other, this);
        t1.start();
        t2.start();
    }

    public void printHealthInfo(){
        System.out.println(this.name + " remaining health: " + this.health);
    }

    public Character(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name of your character: ");
        this.name = sc.nextLine();
        System.out.print("Enter class of your character [Warrior, Mage, Archer, Rogue]: ");
        this.characterClass = sc.nextLine();
        System.out.print("Enter age of your character: ");
        this.age = sc.nextInt();
        this.level = 1;
        this.health = 10;

        int points = 20;

        while(points!=0){
            System.out.println("Distribute 20 points into the following attributes. Minimum Value = 1: ");
            System.out.println("ATK");
            System.out.println("DEF");
            System.out.println("MGK");
            System.out.println("DEX");
            System.out.println();
            System.out.println("Points remaining: " + points);
            System.out.println("ATK?");
            int choice = sc.nextInt();
            if(choice >= 1 && choice <=17){
                this.attack = choice;
                points = points - choice;
            }
            else{
                points = 20;
                continue;
            }
            System.out.println("Points remaining: " + points);
            System.out.println("DEF?");
            choice = sc.nextInt();
            if(choice >= 1 && choice <=17){
                this.defense = choice;
                points = points - choice;
            }
            else{
                points = 20;
                continue;
            }
            System.out.println("Points remaining: " + points);
            System.out.println("DEX?");
            choice = sc.nextInt();
            if(choice >= 1 && choice <=17){
                this.dexterity = choice;
                points = points - choice;
            }
            else{
                points = 20;
                continue;
            }
            System.out.println("Points remaining: " + points);
            System.out.println("MGK?");
            choice = sc.nextInt();
            if(choice >= 1 && choice <=17){
                this.magic = choice;
                points = points - choice;
            }
            else{
                points = 20;
                continue;
            }


        }




    }
}
