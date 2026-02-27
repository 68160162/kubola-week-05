public class GameSeven11_4 {
    private Dice11_4 d1;
    private Dice11_4 d2;
    private int total;

    public GameSeven11_4() {
        d1 = new Dice11_4();
        d2 = new Dice11_4();
    }

    public void play() {
        d1.roll();
        d2.roll();

        System.out.println(d1.getScore() + " " + d2.getScore());

        total = d1.getScore() + d2.getScore();

        if (total == 7)
            System.out.println("You win.");
        else
            System.out.println("You lose.");
    }
}