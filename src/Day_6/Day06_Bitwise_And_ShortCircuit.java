package Day_6;

/*
===============================================================================
DAY 06 - BITWISE OPERATORS + SHORT CIRCUIT (MASTER REVISION FILE)
Author: Om
Focus:
1) Bitwise Operators (&, |, ^, ~)
2) Binary Calculation Tables
3) Short Circuit vs Non Short Circuit (INTERVIEW CRITICAL)
Level: Placement + Interview + Concept Clarity
===============================================================================

CORE IDEA:
Bitwise operators work on BINARY (0 and 1).
Logical operators work on BOOLEAN (true / false).

IMPORTANT DIFFERENCE:
&& → Logical AND (Short Circuit)
&  → Bitwise AND (No Short Circuit)
===============================================================================
*/

public class Day06_Bitwise_And_ShortCircuit {

    public static void main(String[] args) {

        printTitle();

        // ================= BITWISE BASIC =================
        int a = 2; // 10
        int b = 3; // 11

        int andResult = a & b;
        int orResult = a | b;
        int xorResult = a ^ b;
        int notResult = ~a;

        System.out.println("\n[1] BITWISE RESULTS");
        System.out.println("a & b  = " + andResult);
        System.out.println("a | b  = " + orResult);
        System.out.println("a ^ b  = " + xorResult);
        System.out.println("~a     = " + notResult);

        shortCircuitValueCheck(); // ⭐ Added Properly
        dangerousShortCircuitExample();
    }

    // ================= TITLE =================
    public static void printTitle() {
        System.out.println("======================================");
        System.out.println("DAY 06 - BITWISE + SHORT CIRCUIT");
        System.out.println("& | ^ ~  AND  && vs &");
        System.out.println("======================================");
    }

    // ⭐ BITWISE AND TABLE
    public static void bitwiseAndTable() {

        /*
        ================= BITWISE AND (&) =================

        Rule:
        1 & 1 = 1
        Otherwise = 0

        Example:
        a = 2 → 10
        b = 3 → 11

            10
        &   11
        --------
            10  → 2 (Decimal)

        TRUTH TABLE:
        --------------------------------
        | A | B | A & B |
        --------------------------------
        | 0 | 0 |   0   |
        | 0 | 1 |   0   |
        | 1 | 0 |   0   |
        | 1 | 1 |   1   |
        --------------------------------
        */
    }

    // ⭐ BITWISE NOT (~) CALCULATION (VERY IMPORTANT)
    public static void bitwiseNotExplanation() {

        /*
        ================= BITWISE NOT (~) =================

        Formula (INTERVIEW GOLD):
        ~x = -(x + 1)

        Example:
        a = 2

        Step 1: Binary (32-bit)
        2 = 00000000 00000000 00000000 00000010

        Step 2: Flip Bits (~)
        ~2 = 11111111 11111111 11111111 11111101

        Step 3: Convert to Decimal (2's Complement)
        ~2 = -3

        FINAL:
        ~2 = -3
        */
    }

    // ⭐ SHORT CIRCUIT VALUE CHECK (YOU ASKED THIS)
    public static void shortCircuitValueCheck() {

        /*
        ===========================================================
        SHORT CIRCUIT vs NON-SHORT CIRCUIT (VALUE CHECK)
        ===========================================================

        Let:
        a = 5
        b = 10

        Expression:
        (a < b) && (a > b)

        Step 1:
        a < b  → 5 < 10 → true
        a > b  → 5 > 10 → false

        Final:
        true && false = false

        COMPARISON TABLE:
        ------------------------------------------------
        | Expression            | Evaluation | Result |
        ------------------------------------------------
        | a < b && a > b        | Short stop | false  |
        | a < b & a > b         | Both check | false  |
        ------------------------------------------------

        KEY DIFFERENCE:
        && → Short Circuit (Stops early)
        &  → No Short Circuit (Evaluates both)
        */

        int a = 5;
        int b = 10;

        boolean logicalAnd = (a < b) && (a > b);
        boolean bitwiseAnd = (a < b) & (a > b);

        System.out.println("\n[2] SHORT CIRCUIT VALUE CHECK");
        System.out.println("(a < b) && (a > b) = " + logicalAnd);
        System.out.println("(a < b) & (a > b)  = " + bitwiseAnd);
    }

    // ⭐ MOST IMPORTANT INTERVIEW EXAMPLE
    public static void dangerousShortCircuitExample() {

        /*
        ===========================================================
        DANGEROUS SHORT CIRCUIT INTERVIEW QUESTION
        ===========================================================

        int x = 5;

        CASE 1:
        (x < 3) && (10 / 0 > 1)
        Step:
        x < 3 → false
        Due to SHORT CIRCUIT, second condition NOT executed
        → NO Exception (SAFE)

        CASE 2:
        (x < 3) & (10 / 0 > 1)
        Step:
        First false BUT & still evaluates second
        10 / 0 → ArithmeticException ❌

        CONCLUSION:
        && is safer than &
        */

        int x = 5;

        boolean safeCheck = (x < 3) && (10 > 1); // safe short circuit
        boolean fullCheck = (x < 3) & (10 > 1);  // both evaluated

        System.out.println("\n[3] SAFETY COMPARISON");
        System.out.println("Using && (Safe) = " + safeCheck);
        System.out.println("Using &  (Full Evaluation) = " + fullCheck);
    }
}