public class Puripongclass2 {
    public static void main(String[] args) {
        String butten = "--------------------------------";
        System.out.println(butten);
        // 1
        String hello = "Hello RMUTP";
        System.out.println(hello);

        System.out.println(butten);
        // 2
        String str = "RMUTP";

        for (int i = 0; i < str.length(); i++) {
            char rmutp = str.charAt(i);
            System.out.println(rmutp);
        }
        System.out.println(butten);
        // 3
        byte s1 = -128, s5 = 127;
        short s2 = -32768, s6 = 32767;
        int s3 = -2147483648, s7 = 2147483647;
        long s4 = -9223372036854775808L, s8 = 9223372036854775807L;
        System.out.println(s1 + " - " + s5);
        System.out.println(s2 + " - " + s6);
        System.out.println(s3 + " - " + s7);
        System.out.println(s4 + " - " + s8);
        System.out.println(butten);
        // 4
        System.out.println(butten);
        float p1 = 2.4425632f;
        double p2 = 2.523456436434634;
        System.out.println(p1);
        System.out.println(p2);
        // 5
        System.out.println(butten);
        boolean g1 = true;
        System.out.println(g1);
        // 6
        System.out.println(butten);
        char j1 = 'D';
        System.out.println(j1);
        // 7
        System.out.println(butten);
        String school1 = "Rajamangala";
        String school2 = "University";
        String school3 = "Phra";
        String school4 = "Nakorn";
        String school5 = school1 + " " + school2 + " " + school3 + " " + school4;
        System.out.println(school5);
        // 8
        System.out.println(butten);
        byte fah1 = 125;
        short fah2 = fah1;
        char fah7 = (char) fah1; // แปลงค่าจาก byte เป็น char จะได้ผลลัพธ์ทีเป็น ASCII
        int fah3 = fah1;
        long fah4 = fah1;
        float fah5 = fah1;
        double fah6 = fah1;
        System.out.println(fah1 + " " + fah2 + " " + fah3 + " " + fah4 + " " + fah5 + " " + fah6 + " " + fah7);
        // 9
        System.out.println(butten);
        double film1 = 30000;
        float film2 = (float) film1;
        long film3 = (long) film1;
        char film4 = (char) film1; // สาเหตุที่ขึ้นว่า ? เพราะว่าเลข 30k ใน ASCII ไม่มี
        short film5 = (short) film1;
        byte film6 = (byte) film1; // ถูกแปลงเป็น 48 เมื่อกลายเป็น byte โดยค่า ASCII ของตัวเลข 48
        System.out.println(film1 + " " + film2 + " " + film3 + " " + film4 + " " + film5 + " " + film6);

        Thread thread2 = new Thread(() -> {
            // โค้ดที่ต้องการให้ทำงานใน Thread 2
        });
    }
}
