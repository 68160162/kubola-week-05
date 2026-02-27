public class GameSeven11_3 {
    public static void main(String[] args) {
        Dice11_3 d1, d2;
        int total;

        d1 = new Dice11_3();
        d2 = new Dice11_3();

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