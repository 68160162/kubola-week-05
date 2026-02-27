public class ThreeDice12_1 {
    public static void main(String[] args) {
        int d1 = (int)(Math.random() * 6) + 1;
        int d2 = (int)(Math.random() * 6) + 1;
        int d3 = (int)(Math.random() * 6) + 1;

        System.out.println(d1 + " " + d2 + " " + d3);

        boolean allSame = (d1 == d2) && (d2 == d3);
        boolean allOdd  = (d1 % 2 == 1) && (d2 % 2 == 1) && (d3 % 2 == 1);
        boolean allEven = (d1 % 2 == 0) && (d2 % 2 == 0) && (d3 % 2 == 0);

        if (allSame || allOdd || allEven)
            System.out.println("You win.");
        else
            System.out.println("You lose.");
    }
}