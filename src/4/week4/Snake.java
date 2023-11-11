package week4;
import java.util.Random;

public class Snake extends Monster {
    public Snake() {
        super(4, "Snake", snakeDamage(), 12, 0);
    }

    private static int snakeDamage() {
        Random r = new Random();
        return r.nextInt(4) + 3;
    }
}