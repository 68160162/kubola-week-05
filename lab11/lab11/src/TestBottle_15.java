public class TestBottle_15 {
    public static void main(String[] args) {

        Bottle_15 b3 = new Bottle_15(3,0); // ขวด 3 ลิตร
        Bottle_15 b5 = new Bottle_15(5,0); // ขวด 5 ลิตร

        System.out.println("------------ Start -----------");
        b3.showInfo();
        b5.showInfo();

        // 1) เติมน้ำเต็มขวด 3 ลิตร
        System.out.println("---- Step 1: Fill bottle 3L (b3) ----");
        System.out.println("Before:");
        b3.showInfo();
        b5.showInfo();

        b3.filled();

        System.out.println("After:");
        b3.showInfo();
        b5.showInfo();

        // 2) เทน้ำจากขวด 3 ลิตร ออกให้หมดลงไปที่ขวด 5 ลิตร
        System.out.println("---- Step 2: Pour all b3 -> b5 ----");
        System.out.println("Before:");
        b3.showInfo();
        b5.showInfo();

        b3.pourAll(b5);

        System.out.println("After:");
        b3.showInfo();
        b5.showInfo();

        // 3) เติมน้ำเต็มขวด 3 ลิตร
        System.out.println("---- Step 3: Fill bottle 3L (b3) ----");
        System.out.println("Before:");
        b3.showInfo();
        b5.showInfo();

        b3.filled();

        System.out.println("After:");
        b3.showInfo();
        b5.showInfo();

        // 4) เทน้ำจากขวด 3 ลิตร ลงไปที่ขวด 5 ลิตรจนกว่าจะเต็ม
        System.out.println("---- Step 4: Pour b3 -> b5 until b5 full ----");
        System.out.println("Before:");
        b3.showInfo();
        b5.showInfo();

        b3.pourUntilFull(b5);

        System.out.println("After:");
        b3.showInfo();
        b5.showInfo();

        // 5) ที่ขวด 3 ลิตร จะเหลือน้ำ 1 ลิตร
        System.out.println("------------ Done (Need 1L in 3L) -----------");
        b3.showInfo();
        b5.showInfo();
    }
}