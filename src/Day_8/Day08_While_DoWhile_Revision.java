package Day_8;

/*
===============================================================================
DAY 08 - WHILE & DO-WHILE LOOP (MASTER REVISION)
Author: Om
Based On: Lecture + Notes (Iteration Statements)
===============================================================================

LOOPS = Iteration Statements
Used when we want to repeat a block of code multiple times.

Types of Loops in Java:
1. while loop
2. do-while loop
3. for loop

===============================================================================
WHILE vs DO-WHILE (INTERVIEW TABLE)
===============================================================================

+----------------+------------------------+--------------------------+
| Feature        | WHILE LOOP             | DO-WHILE LOOP            |
+----------------+------------------------+--------------------------+
| Condition Check| Before execution       | After execution          |
| Minimum Runs   | 0 times possible       | Runs at least 1 time     |
| Use Case       | Unknown iterations     | Menu driven programs     |
+----------------+------------------------+--------------------------+

===============================================================================
*/

public class Day08_While_DoWhile_Revision {

    public static void main(String[] args) {

        whileLoopExample();
        doWhileExample();
        infiniteLoopTrap();
    }

    // 1️⃣ WHILE LOOP (Condition checked first)
    public static void whileLoopExample() {

        /*
        SYNTAX:
        while(condition) {
            // body
        }

        FLOW:
        1. Check condition
        2. If true → execute body
        3. Repeat until condition = false
        */

        int i = 1;

        System.out.println("===== WHILE LOOP (1 to 5) =====");

        while (i <= 5) {
            System.out.println(i);
            i++; // IMPORTANT (else infinite loop)
        }
    }

    // 2️⃣ DO-WHILE LOOP (Executes at least once)
    public static void doWhileExample() {

        /*
        SYNTAX:
        do {
            // body
        } while(condition);

        KEY DIFFERENCE:
        First executes body, then checks condition
        */

        int i = 11;

        System.out.println("\n===== DO-WHILE (Runs at least once) =====");

        do {
            System.out.println("Executed Once: " + i);
        } while (i <= 10);
    }

    // ⭐ INFINITE LOOP TRAP (VERY IMPORTANT)
    public static void infiniteLoopTrap() {

        /*
        INFINITE LOOP REASON:
        If variable is NOT updated inside loop,
        condition always remains true.

        Example:
        while(i < 10) {
            // i never changes → infinite loop
        }
        */

        int x = 1;

        System.out.println("\n===== INFINITE LOOP DEMO (CONTROLLED) =====");

        while (x <= 3) {
            System.out.println("x = " + x);
            x++; // Without this → Infinite loop
        }
    }
}