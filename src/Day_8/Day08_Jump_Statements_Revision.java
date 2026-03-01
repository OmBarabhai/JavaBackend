package Day_8;

/*
===============================================================================
DAY 08 - JUMP STATEMENTS (BREAK, CONTINUE, LABELS)
Author: Om
===============================================================================

JUMP STATEMENTS:
Used to control loop execution flow.

Types:
1. break
2. continue
3. labeled break (advanced)

===============================================================================
BREAK vs CONTINUE (INTERVIEW TABLE)
===============================================================================

+-----------+---------------------------+-------------------------+
| Keyword   | Function                  | Loop Behavior           |
+-----------+---------------------------+-------------------------+
| break     | Exit loop immediately     | Stops entire loop       |
| continue  | Skip current iteration    | Moves to next iteration |
+-----------+---------------------------+-------------------------+

===============================================================================
*/

public class Day08_Jump_Statements_Revision {

    public static void main(String[] args) {

        breakExample();
        continueExample();
        labeledBreakExample();
    }

    // 1️⃣ BREAK STATEMENT (Exit loop)
    public static void breakExample() {

        System.out.println("===== BREAK EXAMPLE =====");

        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break; // loop stops here
            }
            System.out.println(i);
        }
    }

    // 2️⃣ CONTINUE STATEMENT (Skip iteration)
    public static void continueExample() {

        System.out.println("\n===== CONTINUE (Skip Even Numbers) =====");

        for (int i = 1; i <= 10; i++) {

            if (i % 2 == 0) {
                continue; // skip even numbers
            }

            System.out.println(i);
        }
    }

    // 3️⃣ LABELED BREAK (ADVANCED - FROM YOUR CODE)
    public static void labeledBreakExample() {

        System.out.println("\n===== LABELED BREAK (NESTED LOOP) =====");

        outer:
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print("* ");

                if (j >= 5) {
                    break outer; // exits outer loop directly
                }
            }
            System.out.println();
        }
    }
}