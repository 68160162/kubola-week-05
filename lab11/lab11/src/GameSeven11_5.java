public class GameSeven11_5 {
    private Dice11_5 d1;
    private Dice11_5 d2;
    private int total;

    public GameSeven11_5() {
        d1 = new Dice11_5();
        d2 = new Dice11_5();
    }

    public void play() {
        rollDices();
        showDiceScore();
        addDiceScore();
        showGameResult();
    }

    private void rollDices() {
        d1.roll();
        d2.roll();
    }

    private void showDiceScore() {
        System.out.println(d1.getScore() + " " + d2.getScore());
    }

    private void addDiceScore() {
        total = d1.getScore() + d2.getScore();
    }

    private void showGameResult() {
        if (total == 7)
            System.out.println("You win.");
        else
            System.out.println("You lose.");
    }
}