import java.util.Random;

public class Dice {
    int side;
    boolean intheMud;

    public Dice() {
        intheMud = false;
    }

    void roll() {
        if (!intheMud) {
            side = (int) (Math.random() * (6) + 1);
        } else {
            System.out.println("Your dice is in the mud. It cant be used");
        }
    }

    int getSide() {
        return side;
    }

    void disableDice() {
        intheMud = true;
    }

}