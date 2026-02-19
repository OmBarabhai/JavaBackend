package Day_3;

/*
===========================================================
DAY 03 - IMPORTANT VARIABLES & DATA TYPES (MASTER REVISION)
Author: Om
Focus: Important Concepts Only (Clean + Interview Ready)
===========================================================

Covers:
1. Primitive Data Types
2. Number Systems (Binary, Octal, Hexadecimal)
3. Scientific Notation
4. Underscore in Numbers
5. char & boolean
*/

public class Day03_Variables_DataTypes {

    public static void main(String[] args) {

        // ================= 1. INTEGER DATA TYPES =================
        // Most Important for Beginners + Interviews

        byte byteValue = 10;          // 1 byte (-128 to 127)
        short shortValue = 1000;      // 2 bytes
        int intValue = 50000;         // 4 bytes (MOST USED)
        long longValue = 100000L;     // 8 bytes (use L suffix)

        // ================= 2. NUMBER SYSTEM (VERY IMPORTANT) =================

        int binaryNumber = 0b1010;    // Binary (base 2) → 10 in decimal
        int octalNumber = 012;        // Octal (base 8) → 10 in decimal
        int hexNumber = 0xA;          // Hexadecimal (base 16) → 10 in decimal

        // ================= 3. FLOATING POINT TYPES =================

        float floatValue = 10.5f;     // single precision (must use 'f')
        double doubleValue = 99.999;  // double precision (default)
        double scientific = 6.022e23; // Scientific Notation (6.022 × 10^23)

        // ================= 4. UNDERSCORE IN NUMBERS (READABILITY) =================
        long population = 1_400_000_000L; // Same as 1400000000 (Java ignores _)

        // ================= 5. CHARACTER TYPE =================
        char letter = 'A';  // Stored internally as Unicode integer

        // ================= 6. BOOLEAN TYPE =================
        boolean isJavaFun = true; // Only true or false allowed

        // ================= OUTPUT (USING ALL VARIABLES = NO WARNINGS) =================
        System.out.println("===== INTEGER TYPES =====");
        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);

        System.out.println("\n===== NUMBER SYSTEM =====");
        System.out.println("Binary (0b1010): " + binaryNumber);
        System.out.println("Octal (012): " + octalNumber);
        System.out.println("Hexadecimal (0xA): " + hexNumber);

        System.out.println("\n===== FLOATING TYPES =====");
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);
        System.out.println("scientific (6.022e23): " + scientific);

        System.out.println("\n===== SPECIAL TYPES =====");
        System.out.println("char: " + letter);
        System.out.println("boolean: " + isJavaFun);
        System.out.println("population (underscore): " + population);
    }
}
