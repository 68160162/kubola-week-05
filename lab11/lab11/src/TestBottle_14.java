public class TestBottle_14 {
    public static void main(String[] args) {
        Bottle_14 b3 = new Bottle_14(3, 0); // ขวด 3 ลิตร
        Bottle_14 b5 = new Bottle_14(5, 0); // ขวด 5 ลิตร

        System.out.println("------------ Start -----------");
        b3.showInfo();
        b5.showInfo();

        // 1) เติมน้ำเต็มขวด 5 ลิตร
        System.out.println("---- Step 1: Fill bottle 5L (b5) ----");
        System.out.println("Before:");
        b3.showInfo();
        b5.showInfo();

        b5.filled();

        System.out.println("After:");
        b3.showInfo();
        b5.showInfo();

        // 2) เทจากขวด 5 ลิตร ลงขวด 3 ลิตร ให้เต็ม (จะเหลือ 2 ลิตรในขวด 5 ลิตร)
        System.out.println("---- Step 2: Pour b5 -> b3 until b3 full ----");
        System.out.println("Before:");
        b3.showInfo();
        b5.showInfo();

        b5.pourUntilFull(b3);

        System.out.println("After:");
        b3.showInfo();
        b5.showInfo();

        System.out.println("------------ Done (Need 2L in 5L) -----------");
    }
}