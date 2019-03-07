package rpg;

import java.util.Random;

public class Dice {

    private Random r;

    public Dice() {
        r = new Random();
        roll();
    }

    public int roll() {

        int x = 1 + r.nextInt(6);
        return x;
    }
}
