import java.util.Random;

public class Player {
    Dice die[] = new Dice[5];
    String name;
    int totalScore;
    boolean canStillPlay;

    public Player(String playerName) {
        name = playerName;
        totalScore = 0;
        canStillPlay = true;

        for (int i = 0; i < 5; i++) {
            die[i] = new Dice();
        }

    }

    void playGame() {

        System.out.println("\n" + name + " is rolling their dice now!");
        int roundScore = 0;

        for (int i = 0; i < 5; i++) {

            Dice currentDice = die[i];

            if (die[i].intheMud) {
                System.out.println("This die is stuck in the mud.");
                continue;
            }

            currentDice.roll();
            int sideNumber = currentDice.getSide();

            if (sideNumber == 2) {
                System.out
                        .println("You rolled a 2 and your dice was stuck in the mud. You got 0 points for the round.");
                roundScore = 0;
                currentDice.disableDice();
                break;
            } else {
                System.out.println("You rolled a " + sideNumber);
                roundScore += sideNumber;

            }

        }

        int dieinMud = 0;

        for (int i = 0; i < 5; i++) {

            if (die[i].intheMud) {
                dieinMud++;
            }
        }

        if (dieinMud == 5) {
            canStillPlay = false;
        }
        System.out.println(name + " scored " + roundScore + " this round!");
        totalScore += roundScore;
    }

    int getTotalScore() {
        return totalScore;
    }

    boolean playerCanPlay() {
        return canStillPlay;
    }

}
