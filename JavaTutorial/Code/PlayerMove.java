public class PlayerMove {
    public String playerName;
    public String playerMove;
    public int score;

    public PlayerMove(String name, String move){
        playerName = name;
        playerMove = move;
        score = 0;
    }

    public void fight(PlayerMove player2){
        String p2Move = player2.playerMove;
        String p2Name = player2.playerName;

        switch(playerMove){
            case "r":
                if(p2Move.equals("r")){
                    System.out.println("It's a DRAW");
                }
                if(p2Move.equals("p")){
                    System.out.println(p2Name + " wins because " + p2Move + " beats " + playerMove);
                    player2.score++;
                }
                if(p2Move.equals("s")){
                    System.out.println(playerName + " wins because " + playerMove + " beats " + p2Move);
                    this.score++;
                }
            break;

            case "p":
                if(p2Move.equals("r")){
                    System.out.println(playerName + " wins because " + playerMove + " beats " + p2Move);
                    this.score++;
                }
                if(p2Move.equals("p")){
                    System.out.println("It's a DRAW");
                }
                if(p2Move.equals("s")){
                    System.out.println(p2Name + " wins because " + p2Move + " beats " + playerMove);
                    player2.score++;
                }
            break;

            case "s":
                if(p2Move.equals("r")){
                    System.out.println(p2Name + " wins because " + p2Move + " beats " + playerMove);
                    player2.score++;
                }
                if(p2Move.equals("p")){
                    System.out.println(playerName + " wins because " + playerMove + " beats " + p2Move);
                    this.score++;
                }
                if(p2Move.equals("s")){
                    System.out.println("It's a DRAW");
                }
            break;
        }
    }
    
}
