package Day_4;

/*
===========================================================
DAY 04 - NUMBER STORAGE IN MEMORY (MASTER PREPARATION FILE)
Author: Om
Based on Lecture: Negative Numbers, Floating Precision, MSB, Memory
===========================================================

CORE RULE:
Computer understands ONLY 0 and 1 (Binary)
All numbers (int, float, negative) are stored in binary in memory.
 */
public class Day04_Number_Storage_In_Memory {

    public static void main(String[] args) {

        // ===========================================================
        // 1️⃣ DECIMAL → BINARY CONVERSION (STEP-BY-STEP CALCULATION)
        // Example: 42
        // ===========================================================

        /*
        METHOD 1: Division by 2 (Table Method)

        | Step | Number | Divide by 2 | Quotient | Remainder |
        |------|--------|-------------|----------|-----------|
        | 1    | 42     | 42 / 2      | 21       | 0         |
        | 2    | 21     | 21 / 2      | 10       | 1         |
        | 3    | 10     | 10 / 2      | 5        | 0         |
        | 4    | 5      | 5 / 2       | 2        | 1         |
        | 5    | 2      | 2 / 2       | 1        | 0         |
        | 6    | 1      | 1 / 2       | 0        | 1         |

        Binary (Bottom to Top) = 101010
        8-bit Representation   = 00101010
         */
        int num = 42;
        System.out.println("Decimal 42 in Binary (8-bit): "
                + String.format("%8s", Integer.toBinaryString(num)).replace(' ', '0'));

        // ===========================================================
        // 2️⃣ POSITIVE NUMBER MEMORY STORAGE (VISUAL)
        // ===========================================================

        /*
        Example: byte b = 42

        8-bit Memory Box:
        ---------------------------------
        | 0 | 0 | 1 | 0 | 1 | 0 | 1 | 0 |
        ---------------------------------
          128 64 32 16  8  4  2  1

        Calculation:
        42 = 32 + 8 + 2
           = (1*32) + (1*8) + (1*2)
         */
        // ===========================================================
        // 3️⃣ NEGATIVE NUMBER STORAGE (2's COMPLEMENT) - FULL STEPS
        // Example: -42
        // ===========================================================

        /*
        STEP 1: Ignore sign → Convert +42 to binary
        +42 = 00101010  (8-bit)

        STEP 2: Find 1's Complement (Flip bits)
        00101010  →  11010101

        Table (Bit Flipping):
        0 → 1
        1 → 0

        STEP 3: Add +1 (2's Complement)

              11010101
            +        1
            -----------
              11010110   ← Final Stored Binary of -42

        FINAL MEMORY STORAGE OF -42 (byte):
        -----------------------------------
        | 1 | 1 | 0 | 1 | 0 | 1 | 1 | 0 |
        -----------------------------------
         */
        int negative = -42;
        System.out.println("Binary of -42 (32-bit memory): "
                + String.format("%32s", Integer.toBinaryString(negative)).replace(' ', '0'));

        // ===========================================================
        // 4️⃣ HOW COMPUTER DETECTS NEGATIVE NUMBER (MSB CONCEPT)
        // ===========================================================

        /*
        MSB = Most Significant Bit (Leftmost Bit)
        LSB = Least Significant Bit (Rightmost Bit)

        RULE:
        MSB = 0 → Positive Number
        MSB = 1 → Negative Number

        Example Table:

        | Binary     | MSB | Number Type |
        |------------|-----|-------------|
        | 00101010   | 0   | Positive    |
        | 11010110   | 1   | Negative    |
         */
        // ===========================================================
        // 5️⃣ BYTE RANGE (IMPORTANT INTERVIEW CONCEPT)
        // ===========================================================

        /*
        Byte = 8 bits

        Range Formula:
        -2^(n-1) to 2^(n-1) - 1

        For 8-bit:
        -2^7 to 2^7 - 1
        = -128 to 127

        Table:

        | Value | Binary (8-bit) |
        |-------|----------------|
        | 127   | 01111111       |
        | -128  | 10000000       |
         */
        byte max = 127;
        byte min = -128;

        System.out.println("Max Byte Binary : "
                + String.format("%8s", Integer.toBinaryString(max)).replace(' ', '0'));
        System.out.println("Min Byte Binary : "
                + String.format("%8s", Integer.toBinaryString(min & 0xFF)).replace(' ', '0'));

        // ===========================================================
        // 6️⃣ FLOATING POINT PRECISION (LECTURE CORE CONCEPT)
        // ===========================================================

        /*
        Example: float f = 0.7f

        PROBLEM:
        0.7 cannot be represented exactly in binary.

        Binary Conversion (Fraction Method):
        Multiply by 2 repeatedly:

        | Step | Value × 2 | Integer Part |
        |------|-----------|--------------|
        | 1    | 0.7 × 2 = 1.4 | 1 |
        | 2    | 0.4 × 2 = 0.8 | 0 |
        | 3    | 0.8 × 2 = 1.6 | 1 |
        | 4    | 0.6 × 2 = 1.2 | 1 |
        | 5    | 0.2 × 2 = 0.4 | 0 |

        Binary becomes repeating:
        0.101100110011... (infinite)

        Since float has LIMITED 32 bits,
        memory stores approximate value.
         */
        float f = 0.7f;
        System.out.println("Normal Print (0.7f): " + f);
        System.out.printf("Actual Stored Value (20 precision): %.20f%n", f);

        // ===========================================================
        // 7️⃣ FLOAT MEMORY STRUCTURE (IEEE 754 - VISUAL)
        // ===========================================================

        /*
        Float = 32 bits memory layout:

        -------------------------------------------------
        | Sign (1 bit) | Exponent (8 bit) | Mantissa (23) |
        -------------------------------------------------

        Sign Bit:
        0 → Positive
        1 → Negative

        Memory Formula (Concept):
        Value = (-1)^sign × (1 + mantissa) × 2^(exponent - bias)

        Bias for float = 127



         */
 /*
        ===========================================================
        FLOAT MEMORY FORMULA (IEEE 754 - EXPANDED & PROPER)
        ===========================================================
        
        FLOAT (Single Precision) = 32 Bits Total
        
        Complete Memory Layout (IEEE 754):
        ---------------------------------------------------------
        | Sign (1 bit) | Exponent (8 bits) | Mantissa (23 bits) |
        ---------------------------------------------------------
        
        Bit Index (Left → Right):
        [31] Sign | [30-23] Exponent | [22-0] Mantissa
        
        
        ===========================================================
        FINAL FLOAT VALUE FORMULA (MOST IMPORTANT)
        ===========================================================
        
        Value = (-1)^S × (1.M) × 2^(E - Bias)
        
        Where:
        S = Sign Bit
        E = Stored Exponent (Unsigned 8-bit value)
        M = Mantissa / Fraction bits (23-bit)
        Bias = 127 (for float, single precision)
        
        
        ===========================================================
        STEP-BY-STEP MEANING OF EACH PART
        ===========================================================
        
        1️⃣ SIGN BIT (S) – 1 BIT
        ---------------------------------
        S = 0 → Positive Number
        S = 1 → Negative Number
        
        Example:
        +10.5 → Sign = 0
        -10.5 → Sign = 1
        
        
        2️⃣ EXPONENT (E) – 8 BITS (BIASED EXPONENT)
        ---------------------------------
        Exponent is NOT stored directly.
        It is stored using BIAS FORM.
        
        Formula:
        Stored Exponent (E) = Actual Exponent + Bias
        
        For Float:
        Bias = 127
        
        Actual Exponent = E - 127
        
        
        3️⃣ MANTISSA (M) – 23 BITS (FRACTION PART)
        ---------------------------------
        Mantissa stores ONLY the fraction part of normalized binary.
        
        Important Rule:
        Leading 1 is NOT stored (Hidden Bit Concept)
        
        Normalized Form:
        1.M × 2^nl̥
        
        Stored Mantissa = Bits after decimal point (M)
        
        
        ===========================================================
        NORMALIZATION (VERY IMPORTANT STEP)
        ===========================================================
        
        Before storing, number is converted into normalized binary form:
        
        Scientific Binary Form:
        1.M × 2^n
        
        Example:
        Decimal = 10.5
        Binary  = 1010.1
        Normalized = 1.0101 × 2^3
        
        Here:
        Actual Exponent = 3
        Mantissa = 0101...
        
        
        ===========================================================
        EXPONENT CALCULATION (PROPER METHOD)
        ===========================================================
        
        Step 1: Find Actual Exponent from normalization
        Step 2: Add Bias (127 for float)
        
        Example:
        Actual Exponent = 3
        Bias = 127
        
        Stored Exponent (E) = 3 + 127 = 130
        Binary of 130 = 10000010 (8 bits)
        
        
        ===========================================================
        MANTISSA CALCULATION (PROPER METHOD)
        ===========================================================
        
        Normalized Form:
        1.0101
        
        Stored Mantissa = digits after decimal:
        01010000000000000000000 (fill up to 23 bits)
        
        NOTE:
        Leading '1' is implicit (not stored in memory)
        This is called the "Hidden Bit" optimization.
        
        
        ===========================================================
        FULL WORKED EXAMPLE (CONCEPTUAL)
        ===========================================================
        
        Given:
        Value = 10.5
        
        Binary Conversion:
        10.5 = 1010.1
        
        Normalization:
        1010.1 = 1.0101 × 2^3
        
        Now:
        S = 0 (positive)
        Actual Exponent = 3
        Bias = 127
        E = 3 + 127 = 130 = 10000010 (binary)
        M = 01010000000000000000000 (23 bits)
        
        Final IEEE 754 Representation:
        -------------------------------------------------
        | S |   Exponent   |        Mantissa            |
        -------------------------------------------------
        | 0 | 10000010     | 01010000000000000000000    |
        -------------------------------------------------
        
        
        ===========================================================
        SPECIAL NOTE (FLOATING POINT PRECISION - LECTURE CORE)
        ===========================================================
        
        Decimal numbers like 0.7 cannot be represented exactly in binary.
        Their binary becomes repeating (infinite).
        
        Example:
        0.7 ≈ 0.1011001100110011... (repeating)
        
        But float has only 23 mantissa bits,
        So memory stores an APPROXIMATE value,
        which causes precision errors in Java.
        
        
        ===========================================================
        QUICK INTERVIEW REVISION (1 LINE)
        ===========================================================
        
        Float Value = (-1)^S × (1.M) × 2^(E - 127)
        Where:
        S = Sign Bit, E = Biased Exponent, M = Mantissa (23 bits)
         */
        // ===========================================================
        // FINAL REVISION SUMMARY (EXAM READY)
        // ===========================================================

        /*
        DAY 4 FINAL REVISION (1-MINUTE QUICK RECAP)

        1. Computer stores everything in Binary (0 & 1)
        2. Positive numbers → Direct binary storage
        3. Negative numbers → 2's Complement method
        4. MSB decides sign of number
        5. Byte range = -128 to 127
        6. Floating numbers are stored approximately
        7. 0.7 ≠ exact in memory (precision issue)
         */
    }
}
