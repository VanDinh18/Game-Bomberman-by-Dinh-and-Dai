package uet.oop.bomberman.input;

import java.util.Random;

public class AutomaticInput {

    public static int calculate() {
        Random rd = new Random();
        int random = rd.nextInt(4);
        //System.out.println( random);
        return random;
    }
}
