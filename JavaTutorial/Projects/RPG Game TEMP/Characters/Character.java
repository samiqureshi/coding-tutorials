package Characters;

import java.util.Scanner;

public abstract class Character {
    public String name;
    public String race;
    public int age;
    public int level;
    public int attack;
    public int defense;
    public int magic;
    public int dexterity;
    public int health;
    
    public abstract void attack(Character c);
    public abstract void defend();
    public abstract void special(Character c);

    public Character(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name of " + this.getClass().getSimpleName() + ": ");
        this.name = sc.nextLine();
        System.out.print("Enter race of " + this.getClass().getSimpleName() + ": ");
        this.race = sc.nextLine();
        System.out.print("Enter age of " + this.getClass().getSimpleName() + ": ");
        this.age = sc.nextInt();
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
            System.out.println("Points remaining: " + points);
            System.out.println("DEF?");
            choice = sc.nextInt();
            if(choice >= 1 && choice <=17){
                this.defense= choice;
                points = points - choice;
            }
            System.out.println("Points remaining: " + points);
            System.out.println("MGK?");
            choice = sc.nextInt();
            if(choice >= 1 && choice <=17){
                this.magic= choice;
                points = points - choice;
            }
            System.out.println("Points remaining: " + points);
            System.out.println("DEX?");
            choice = sc.nextInt();
            if(choice >= 1 && choice <=17){
                this.dexterity= choice;
                points = points - choice;
            }

        }

    }

    public void printInfo() {
        System.out.println("-------------------------");
        System.out.println("Character Info:");
        System.out.println("Class: " + this.getClass().getSimpleName());
        System.out.println("Name: " + this.name);
        System.out.println("Race: " + this.race);
        System.out.println("Age: " + this.age + " years");
        System.out.println("-------------------------");

    }

    public void fight(Character c) {
        System.out.println("------FIGHT STARTING------");
        System.out.println(String.format("%s %s VS %s %s", this.getClass().getSimpleName(), this.name, c.getClass().getSimpleName(), c.name));
        
    }
}