public class GameThreeDice12_5 {
    private Dice12_5 d1;
    private Dice12_5 d2;
    private Dice12_5 d3;
    private int total;

    public GameThreeDice12_5() {
        d1 = new Dice12_5();
        d2 = new Dice12_5();
        d3 = new Dice12_5();
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
        d3.roll();
    }

    private void showDiceScore() {
        System.out.println(d1.getScore() + " " + d2.getScore() + " " + d3.getScore());
    }

    private void addDiceScore() {
        total = d1.getScore() + d2.getScore() + d3.getScore();
    }

    private void showGameResult() {
        boolean allSame = (d1.getScore() == d2.getScore()) && (d2.getScore() == d3.getScore());
        boolean allOdd  = (d1.getScore() % 2 == 1) && (d2.getScore() % 2 == 1) && (d3.getScore() % 2 == 1);
        boolean allEven = (d1.getScore() % 2 == 0) && (d2.getScore() % 2 == 0) && (d3.getScore() % 2 == 0);

        if (allSame || allOdd || allEven)
            System.out.println("You win.");
        else
            System.out.println("You lose.");
    }
}