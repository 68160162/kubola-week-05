public class GameThreeDice12_3 {
    public static void main(String[] args) {
        Dice12_3 d1, d2, d3;
        int total;

        d1 = new Dice12_3();
        d2 = new Dice12_3();
        d3 = new Dice12_3();

        d1.roll();
        d2.roll();
        d3.roll();

        System.out.println(d1.getScore() + " " + d2.getScore() + " " + d3.getScore());

        total = d1.getScore() + d2.getScore() + d3.getScore(); // (ไม่จำเป็นต่อเงื่อนไข แต่ใส่ไว้ได้)

        boolean allSame = (d1.getScore() == d2.getScore()) && (d2.getScore() == d3.getScore());
        boolean allOdd  = (d1.getScore() % 2 == 1) && (d2.getScore() % 2 == 1) && (d3.getScore() % 2 == 1);
        boolean allEven = (d1.getScore() % 2 == 0) && (d2.getScore() % 2 == 0) && (d3.getScore() % 2 == 0);

        if (allSame || allOdd || allEven)
            System.out.println("You win.");
        else
            System.out.println("You lose.");
    }
}