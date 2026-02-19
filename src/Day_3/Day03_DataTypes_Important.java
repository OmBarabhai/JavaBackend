package Day_3;

/*
===========================================================
DAY 03 - Primitive Data Types (Important Revision File)
Author: Om
Focus: Integer, Real Numbers, Character, Boolean
===========================================================
*/

public class Day03_DataTypes_Important {

    public static void main(String[] args) {

        // ================= INTEGER TYPES =================
        byte b = 10;       // 1 byte
        short s = 1000;    // 2 bytes
        int i = 50000;     // 4 bytes (Most used)
        long l = 100000L;  // 8 bytes

        // ================= REAL NUMBERS =================
        float f = 10.5f;   // Single precision
        double d = 99.99;  // Double precision (Preferred)

        // ================= CHARACTER =================
        char c = 'A';  // Unicode character

        // ================= BOOLEAN =================
        boolean flag = true; // true or false only

        System.out.println("===== INTEGER TYPES =====");
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);

        System.out.println("\n===== REAL NUMBERS =====");
        System.out.println("float: " + f);
        System.out.println("double: " + d);

        System.out.println("\n===== CHARACTER =====");
        System.out.println("char: " + c);

        System.out.println("\n===== BOOLEAN =====");
        System.out.println("boolean: " + flag);
    }
}
