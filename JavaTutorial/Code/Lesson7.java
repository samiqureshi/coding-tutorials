import java.util.Scanner;

public class Lesson7 {
    public static void main(String[] args){
        System.out.println("-------------------------------");
        System.out.println("Multiplayer Rock/Paper/Scissors");
        System.out.println("-------------------------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("Player 1 Enter your name: ");
        String p1Name = sc.nextLine();
        System.out.print("Player 2 Enter your name: ");
        String p2Name = sc.nextLine();
        int p1Score = 0;
        int p2Score = 0;
        System.out.println("-------------------------------");
        System.out.println(String.format("%s VS %s", p1Name, p2Name));
        System.out.println("-------------------------------");

        String p1Choice = "";
        String p2Choice = "";

        PlayerMove p1 = new PlayerMove(p1Name, p1Choice);
        PlayerMove p2 = new PlayerMove(p2Name, p2Choice);
        while(!p1Choice.equals("q") && !p2Choice.equals("q")){
            System.out.print(p1Name + " enter your move (R/P/S....Q to quit): ");
            p1Choice = sc.nextLine().toLowerCase();
            System.out.print(p2Name + " enter your move (R/P/S....Q to quit): ");
            p2Choice = sc.nextLine().toLowerCase();
            p1.playerMove = p1Choice;
            p2.playerMove = p2Choice;
            if(p1Choice.equals("q") || p2Choice.equals("q")){
                continue;
            }
            
            p1.fight(p2);
            System.out.println("-------------------------------");
        }
        System.out.println("--------------------------------------");
        System.out.println(p1.playerName + ": " + p1.score);
        System.out.println(p2.playerName + ": " + p2.score);

    }
}
