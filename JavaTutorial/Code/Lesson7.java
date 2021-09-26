import java.util.Scanner;
import java.io.Console;  
public class Lesson7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------------------------");
        System.out.println("Welcome to multiplayer Rock Paper Scissors");
        System.out.println("------------------------------------------");
        System.out.println("\n");
        System.out.print("Player 1 enter your name: ");
        String p1Name = sc.nextLine();
        System.out.print("Player 2 enter your name: ");
        String p2Name = sc.nextLine();
        System.out.println(p1Name + " VS " + p2Name);
        System.out.println("------------------------------------------");

        Console console = System.console();
        String p1Choice = new String(console.readPassword(p1Name + " enter your choice (Rock (r), Paper (p), Scissors (s)): "));
        String p2Choice = new String(console.readPassword(p2Name + " enter your choice (Rock (r), Paper (p), Scissors (s)): "));

        // System.out.print(p1Name + " enter your choice (Rock (r), Paper (p), Scissors (s)): ");
        // String p1Choice = sc.nextLine();
        // System.out.print(p2Name + " enter your choice (Rock (r), Paper (p), Scissors (s)): ");
        // String p2Choice = sc.nextLine();

        PlayerMove p1 = new PlayerMove(p1Name, p1Choice);
        PlayerMove p2 = new PlayerMove(p2Name, p2Choice);

        p1.fight(p2);


    }
}

