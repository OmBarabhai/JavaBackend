package Day_6;

/*
===============================================================================
DAY 06 - SHIFT OPERATORS (REVISION FRIENDLY FILE)
Author: Om
Goal: Easy Revision + Fast Understanding + Interview Clarity
===============================================================================

CORE IDEA:
Shift operators move BITS (0 and 1), not decimal numbers.

3 Types:
<<  → Left Shift  (Multiply by 2)
>>  → Right Shift (Divide by 2, keeps sign)
>>> → Unsigned Right Shift (Zero fill)
===============================================================================
*/

public class Day06_Shift_Operators {

    public static void main(String[] args) {

        leftShift();
        rightShift();
        unsignedRightShift();
        interviewEdgeCase();
    }

    // ================= 1️⃣ LEFT SHIFT (<<) =================
    public static void leftShift() {

        /*
        LEFT SHIFT (<<)

        Formula:
        a << n = a * (2^n)

        Example:
        a = 5

        Binary of 5 (8-bit):
        00000101

        After 1 Left Shift:
        00001010  = 10

        Table:
        --------------------------------
        | Value | Binary   | Result |
        --------------------------------
        | 5     | 00000101 | 5 << 1 = 10 |
        --------------------------------
        */

        int a = 5;
        int result = a << 1;

        System.out.println("LEFT SHIFT (5 << 1) = " + result);
    }

    // ================= 2️⃣ RIGHT SHIFT (>>) =================
    public static void rightShift() {

        /*
        RIGHT SHIFT (>>)

        Formula:
        a >> n = a / (2^n)  (for positive numbers)

        Example:
        a = 8

        Binary:
        00001000

        After Right Shift:
        00000100 = 4

        IMPORTANT:
        Sign bit (MSB) is preserved.
        */

        int a = 8;
        int result = a >> 1;

        System.out.println("RIGHT SHIFT (8 >> 1) = " + result);
    }

    // ================= 3️⃣ UNSIGNED RIGHT SHIFT (>>>) =================
    public static void unsignedRightShift() {

        /*
        DIFFERENCE: >> vs >>>

        >>  → Keeps sign (negative stays negative)
        >>> → Fills left with 0 (becomes positive)

        Example:
        a = -8

        >> 1  → -4   (sign preserved)
        >>> 1 → Large positive number (zero fill)
        */

        int a = -8;

        System.out.println("SIGNED SHIFT (-8 >> 1) = " + (a >> 1));
        System.out.println("UNSIGNED SHIFT (-8 >>> 1) = " + (a >>> 1));
    }

    // ================= ⭐ MOST IMPORTANT INTERVIEW CASE =================
    public static void interviewEdgeCase() {

        /*
        INTERVIEW GOLD QUESTION:

        int g = 1;
        g = g << 33;

        Why output = 2 ?

        REASON:
        Java uses only LOWER 5 bits for shift (int)

        So:
        33 % 32 = 1

        Therefore:
        1 << 33 = 1 << 1 = 2
        */

        int g = 1;
        g = g << 33;

        System.out.println("EDGE CASE (1 << 33) = " + g);
    }
}