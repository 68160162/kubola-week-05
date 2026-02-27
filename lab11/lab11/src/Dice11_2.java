public class Dice11_2 {
    private int score;

    public int getScore() {
        return score;
    }

    public void roll() {
        score = (int)(Math.random() * 6) + 1;
    }
}