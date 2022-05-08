import java.util.Scanner;

public class StuckInTheMud {

    public static void main(String[] args) {

        boolean gameIsPlaying = true;
        int gameRound = 0;
        Player playersArray[] = new Player[2];

        System.out.println("Welcome to Stuck In The Mud Game!");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Player 1 name: ");
        String playerName1 = sc.nextLine();

        System.out.println("Enter Player 2 name: ");
        String playerName2 = sc.nextLine();

        playersArray[0] = new Player(playerName1);
        playersArray[1] = new Player(playerName2);

        while (gameIsPlaying) {

            if (playersArray[0].canStillPlay == false && playersArray[1].canStillPlay == false) {
                System.out.println("Both players are stuck in the mud. You cannot play any more rounds.");
                gameIsPlaying = false;
                continue;
            } else if (playersArray[0].canStillPlay == false) {
                System.out.println(playerName1 + " has all 5 die in the mud. You cannot play any more rounds.");
                gameIsPlaying = false;
                continue;
            } else if (playersArray[1].canStillPlay == false) {
                System.out.println(playerName2 + " has all 5 die in the mud. You cannot play any more rounds.");
                gameIsPlaying = false;
                continue;
            }

            System.out.println("Round " + gameRound);

            playersArray[0].playGame();
            playersArray[1].playGame();

            System.out.println(
                    "\n" + playerName1 + " has a total score of " + playersArray[0].getTotalScore() + " points");
            System.out.println(playerName2 + " has a total score of " + playersArray[1].getTotalScore() + " points");

            if (playersArray[0].getTotalScore() > playersArray[1].getTotalScore()) {
                System.out.println(playerName1 + " is winning Stuck In The Mud!");
            } else if (playersArray[0].getTotalScore() < playersArray[1].getTotalScore()) {
                System.out.println(playerName2 + " is winning Stuck In The Mud!");
            } else {
                System.out.println("You tied. You need to play another round!");
                continue;
            }

            System.out.println("\nDo you want to play another round? Press enter to play again");

            if (sc.nextLine().equals("")) {
                gameRound++;
            } else {
                gameIsPlaying = false;
            }
        }
        System.out.println("Thank you for playing Stuck In The Mud!");
    }
}
