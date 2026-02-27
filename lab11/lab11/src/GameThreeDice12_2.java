public class GameThreeDice12_2 {
    public static void main(String[] args) {
        Dice12_2 d1, d2, d3;
        int total;

        d1 = new Dice12_2();
        d2 = new Dice12_2();
        d3 = new Dice12_2();

        d1.score = (int)(Math.random() * 6) + 1;
        d2.score = (int)(Math.random() * 6) + 1;
        d3.score = (int)(Math.random() * 6) + 1;

        System.out.println(d1.score + " " + d2.score + " " + d3.score);

        total = d1.score + d2.score + d3.score; // (ไม่จำเป็นต่อเงื่อนไข แต่ใส่ไว้ได้)

        boolean allSame = (d1.score == d2.score) && (d2.score == d3.score);
        boolean allOdd  = (d1.score % 2 == 1) && (d2.score % 2 == 1) && (d3.score % 2 == 1);
        boolean allEven = (d1.score % 2 == 0) && (d2.score % 2 == 0) && (d3.score % 2 == 0);

        if (allSame || allOdd || allEven)
            System.out.println("You win.");
        else
            System.out.println("You lose.");
    }
}