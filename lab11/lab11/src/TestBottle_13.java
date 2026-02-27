public class TestBottle_13 {
    public static void main(String[] args) {
        Bottle_13 b1 = new Bottle_13(3, 0); // ถัง 3 ลิตร
        Bottle_13 b2 = new Bottle_13(5, 0); // ถัง 5 ลิตร

        System.out.println("------------ Start -----------");
        b1.showInfo();
        b2.showInfo();

        // 1) เติมน้ำเต็มถัง 5 ลิตร
        b2.filled();
        System.out.println("---- Step 1: Fill bottle 5L (b2) ----");
        b1.showInfo();
        b2.showInfo();

        // 2) เทจากถัง 5L ไปถัง 3L จน 3L เต็ม (เหลือ 2L ในถัง 5L)
        b2.pourUntilFull(b1);
        System.out.println("---- Step 2: Pour b2 -> b1 until b1 full ----");
        b1.showInfo();
        b2.showInfo();

        // 3) เทน้ำในถัง 3L ทิ้งให้หมด
        b1.pourAll();
        System.out.println("---- Step 3: Empty bottle 3L (b1) ----");
        b1.showInfo();
        b2.showInfo();

        // 4) เทน้ำที่เหลือ 2L จากถัง 5L ไปถัง 3L
        b2.pourAll(b1);
        System.out.println("---- Step 4: Pour all b2 -> b1 ----");
        b1.showInfo();
        b2.showInfo();

        // 5) เติมน้ำเต็มถัง 5L อีกครั้ง
        b2.filled();
        System.out.println("---- Step 5: Fill bottle 5L (b2) ----");
        b1.showInfo();
        b2.showInfo();

        // 6) เทจาก 5L ไป 3L จน 3L เต็ม (ต้องเติมอีก 1L) => ถัง 5L เหลือ 4L
        b2.pourUntilFull(b1);
        System.out.println("---- Step 6: Pour b2 -> b1 until b1 full (NOW b2 = 4L) ----");
        b1.showInfo();
        b2.showInfo();

        System.out.println("------------ Done (Need 4L) -----------");
    }
}