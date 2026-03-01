package Day_8;

/*
===============================================================================
DAY 08 - FOR LOOP (FLOW OF CONTROL - INTERVIEW IMPORTANT)
Author: Om
===============================================================================

FOR LOOP SYNTAX:
for(initialization; condition; increment/decrement) {
    // body
}

Example:
for(int i = 1; i <= 10; i++)

===============================================================================
FLOW OF CONTROL OF FOR LOOP (VERY IMPORTANT)
===============================================================================

STEP 1: Initialization executes (only once)
STEP 2: Condition is checked (true/false)
STEP 3: If true → Loop body executes
STEP 4: Increment/Decrement executes
STEP 5: Again condition checked
STEP 6: Repeat steps 3-5 until condition becomes false

===============================================================================
*/

public class Day08_For_Loop_Revision {

    public static void main(String[] args) {

        basicForLoop();
        reverseLoop();
        commaSeparatedVariation();
        nestedLoopPattern();
    }

    // 1️⃣ BASIC FOR LOOP (1 to 5)
    public static void basicForLoop() {

        System.out.println("===== BASIC FOR LOOP =====");

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }

    // 2️⃣ REVERSE LOOP (From your lecture code)
    public static void reverseLoop() {

        System.out.println("\n===== REVERSE LOOP (10 to 1) =====");

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }

    // 3️⃣ COMMA SEPARATED VARIATION (Lecture Advanced Concept)
    public static void commaSeparatedVariation() {

        System.out.println("\n===== COMMA SEPARATED FOR LOOP =====");

        for (int i = 1, j = 1; i <= 5 && j <= 5; i++, j += 2) {
            System.out.println("i = " + i + ", j = " + j + ", Product = " + (i * j));
        }
    }

    // 4️⃣ NESTED LOOP (Pattern Logic from your notes)
    public static void nestedLoopPattern() {

        System.out.println("\n===== NESTED LOOP (Star Pattern) =====");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        /*
        TIME COMPLEXITY UNDERSTANDING (VERY IMPORTANT):

        Outer Loop = n times
        Inner Loop = n times
        Total = n * n = O(n²)
        */
    }
}