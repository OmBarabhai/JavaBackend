package Day_4;

/*
===========================================================
DAY 04 - NUMBER STORAGE IN MEMORY
Author: Om
Based On Lecture + Notes:
- Binary Storage
- 2's Complement (Negative Numbers)
- MSB & LSB Concept
- Floating Point (IEEE 754)
- Precision Issue (0.7)
===========================================================

CORE RULE:
Computer understands ONLY Binary (0 and 1).
All numbers (int, float, negative) are stored in binary in memory.
*/

public class Day04_Number_Storage_In_Memory {

    public static void main(String[] args) {

        // ===========================================================
        // 1️⃣ DECIMAL → BINARY (AS IN YOUR NOTES: +42)
        // ===========================================================

        /*
        Division Method (42 to Binary)

        | Step | Number | /2 | Quotient | Remainder |
        |------|--------|----|----------|-----------|
        | 1    | 42     | /2 | 21       | 0         |
        | 2    | 21     | /2 | 10       | 1         |
        | 3    | 10     | /2 | 5        | 0         |
        | 4    | 5      | /2 | 2        | 1         |
        | 5    | 2      | /2 | 1        | 0         |
        | 6    | 1      | /2 | 0        | 1         |

        Binary (Bottom → Top) = 101010
        8-bit = 00101010
        */

        int positive = 42;
        System.out.println("Binary of +42: " + Integer.toBinaryString(positive));


        // ===========================================================
        // 2️⃣ NEGATIVE NUMBER STORAGE (2’s COMPLEMENT) - EXACT NOTES
        // ===========================================================

        /*
        Example: byte b = -42  (from your notes)

        STEP 1: Convert +42 to Binary (8-bit)
        +42 = 00101010

        STEP 2: 1’s Complement (Flip Bits)
        00101010  →  11010101

        Rule:
        0 → 1
        1 → 0

        STEP 3: Add +1 (2’s Complement)
              11010101
            +        1
            -----------
              11010110  ← Final stored value of -42

        Memory Representation:
        ---------------------------------
        | 1 | 1 | 0 | 1 | 0 | 1 | 1 | 0 |
        ---------------------------------
        */

        int negative = -42;
        System.out.println("Binary of -42: " + Integer.toBinaryString(negative));


        // ===========================================================
        // 3️⃣ MSB & LSB (FROM LECTURE DIAGRAM)
        // ===========================================================

        /*
        MSB = Most Significant Bit (Leftmost Bit)
        LSB = Least Significant Bit (Rightmost Bit)

        SIGN RULE:
        MSB = 0 → Positive Number
        MSB = 1 → Negative Number

        Example:
        00101010 → MSB = 0 → Positive
        11010110 → MSB = 1 → Negative
        */


        // ===========================================================
        // 4️⃣ BYTE RANGE (IMPORTANT FORMULA)
        // ===========================================================

        /*
        Byte = 8 bits

        Range Formula:
        -2^(n-1) to 2^(n-1) - 1

        For 8-bit:
        = -2^7 to 2^7 - 1
        = -128 to +127
        */

        byte max = 127;
        byte min = -128;
        System.out.println("Max Byte: " + max);
        System.out.println("Min Byte: " + min);


        // ===========================================================
        // 5️⃣ FLOAT MEMORY STRUCTURE (AS IN YOUR NOTES)
        // ===========================================================

        /*
        Float = 32-bit (IEEE 754)

        Memory Layout (From Notes Diagram):
        -------------------------------------------------
        | Sign (1 bit) | Exponent (8 bit) | Mantissa (23)|
        -------------------------------------------------

        Total = 1 + 8 + 23 = 32 bits
        Bias (Float) = 127
        */


        // ===========================================================
        // 6️⃣ IEEE 754 FORMULA (INTERVIEW MOST IMPORTANT)
        // ===========================================================

        /*
        FINAL FLOAT VALUE FORMULA:

        Value = (-1)^S × (1.M) × 2^(E - 127)

        Where:
        S = Sign Bit
        E = Stored Exponent (Biased)
        M = Mantissa (Fraction)
        Bias = 127

        NOTE:
        Leading 1 is NOT stored (Hidden Bit Concept)
        Actual Mantissa = 1.M
        */


        // ===========================================================
        // 7️⃣ FLOAT STEP-BY-STEP (EXAMPLE: 8.125 from your notes)
        // ===========================================================

        /*
        STEP 1: Convert 8.125 to Binary
        8 = 1000
        0.125 = 0.001
        So: 8.125 = 1000.001

        STEP 2: Normalize
        1000.001 = 1.000001 × 2^3

        STEP 3: Sign Bit
        Positive → S = 0

        STEP 4: Exponent
        Actual Exponent = 3
        Stored Exponent = 3 + 127 = 130
        130 (binary) = 10000010

        STEP 5: Mantissa
        Take fraction after decimal:
        00000100000000000000000 (23 bits)
        */


        // ===========================================================
        // 8️⃣ FLOAT PRECISION ISSUE (0.7 FROM YOUR NOTES)
        // ===========================================================

        /*
        Example: float f = 0.7

        Convert to Binary (Multiply by 2 method):

        0.7 × 2 = 1.4 → 1
        0.4 × 2 = 0.8 → 0
        0.8 × 2 = 1.6 → 1
        0.6 × 2 = 1.2 → 1
        0.2 × 2 = 0.4 → 0

        Binary = 0.101100110011... (Infinite)

        But float has only 23 mantissa bits,
        So memory stores APPROXIMATE value.
        That’s why 0.7 ≠ exact in Java.
        */

        float f = 0.7f;
        System.out.println("0.7 stored as: " + f);


        // ===========================================================
        // 9️⃣ INTERVIEW ONE-LINE SUMMARY (MUST REMEMBER)
        // ===========================================================

        /*
        GOLD INTERVIEW LINE:

        "In Java, integers are stored in binary using 2’s complement,
        and floating point numbers are stored using IEEE 754 format
        consisting of Sign, Exponent, and Mantissa."
        */
    }
}