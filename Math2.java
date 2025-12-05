//lesson on increments and accumulation, and decrements.



class ScoreBoard {

    int playerXP = 0;
    int playerLevel = 0;
    static String gameName = "Booty Slayer";
    int playerHealth = 0;
    String playerName = " ";

    ScoreBoard(String n){
        playerName = n;
    }

    void gainXP(int amount) {
        playerXP = playerXP + amount; // accumulation, long way of doing it.
        System.out.println(playerName = " gained " + amount + " XP");
    }

    void heal() {
        playerHealth += 50; //compound addition, compound accumulation
    }

    void damage() {
        playerHealth -= 50; //compound subtraction
    }

    void levelUp() {
        playerLevel++;

    }

    void levelDown() {
        playerLevel--;

    }



}


public class Math2 {
    public static void main(String[] args){

        ScoreBoard player1 = new ScoreBoard();
        ScoreBoard player2 = new ScoreBoard();

        player1.gainXP(200);
        player1.heal();
        player1.gainXP(100);
        player1.damage();
        player1.levelUp();
        player1.levelUp();
        player1.levelDown();

        player2.gainXP(100);
        player2.heal();
        player2.gainXP(80);
        player2.damage();
        player2.levelUp();
        player2.levelUp();
        player2.levelDown();

        System.out.println("Player 1 XP: " + player1.playerXP);
        System.out.println("Player 1 Level: " + player1.playerLevel);
        System.out.println("Player 1 Health: " + player1.playerHealth);
        System.out.println("Game Name: " + player1.gameName);

        System.out.println("Player 2 XP: " + player2.playerXP);
        System.out.println("Player 2 Level: " + player2.playerLevel);
        System.out.println("Player 2 Health: " + player2.playerHealth);


    }
}

