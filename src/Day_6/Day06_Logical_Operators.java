package Day_6;

/*
===========================================================
DAY 06 - LOGICAL OPERATORS (MASTER REVISION FILE)
Author: Om
Focus: &&, ||, ! + Short Circuit (INTERVIEW IMPORTANT)
Level: Beginner → Interview Ready
===========================================================

WHAT ARE LOGICAL OPERATORS?
Logical operators are used to combine multiple boolean conditions.
They ALWAYS return boolean (true / false).

-----------------------------------------------------------
| Operator | Name        | Meaning                    |
-----------------------------------------------------------
| &&       | Logical AND | True if BOTH are true     |
| ||       | Logical OR  | True if ANY one is true   |
| !        | Logical NOT | Reverses the boolean      |
-----------------------------------------------------------

IMPORTANT:
Logical operators work only with boolean expressions.
Example:
(a > b) && (b < c)
*/


public class Day06_Logical_Operators {

    public static void main(String[] args) {

        printTitle();

        int a = 25;
        int b = 10;
        int c = 15;

        // ================= LOGICAL AND =================
        boolean andResult = (a > b) && (b < c);

        // ================= LOGICAL OR ==================
        boolean orResult = (a < b) || (b < c);

        // ================= LOGICAL NOT =================
        boolean notResult = !(a > b);

        System.out.println("\n[1] LOGICAL OPERATOR RESULTS");
        System.out.println("(a > b) && (b < c) = " + andResult);
        System.out.println("(a < b) || (b < c) = " + orResult);
        System.out.println("!(a > b) = " + notResult);

        demonstrateShortCircuit();
        showTruthTables();
        showInterviewConcepts();
    }

    // Title Method
    public static void printTitle() {
        System.out.println("======================================");
        System.out.println("DAY 06 - LOGICAL OPERATORS");
        System.out.println("&& (AND), || (OR), ! (NOT)");
        System.out.println("======================================");
    }

    // ⭐ SHORT CIRCUIT CONCEPT (VERY IMPORTANT)
    public static void demonstrateShortCircuit() {

        /*
        ================= SHORT CIRCUIT EVALUATION =================

        Short Circuit means:
        Java stops evaluation when result is already decided.

        1) AND (&&) Short Circuit:
           If first condition is FALSE,
           Java does NOT check second condition.

           Example:
           (false && anything) = false (second not executed)

        2) OR (||) Short Circuit:
           If first condition is TRUE,
           Java does NOT check second condition.

           Example:
           (true || anything) = true (second not executed)
        */

        int x = 5;
        int y = 0;

        // Short Circuit AND (Second condition NOT executed)
        boolean result = (x < 3) && (10 / y > 1);

        System.out.println("\n[2] SHORT CIRCUIT DEMO");
        System.out.println("Short Circuit AND executed safely: " + result);
    }

    // ⭐ TRUTH TABLES (INTERVIEW + EXAMS)
    public static void showTruthTables() {

        /*
        ================= LOGICAL AND (&&) TRUTH TABLE =================

        --------------------------------
        | A     | B     | A && B       |
        --------------------------------
        | true  | true  | true         |
        | true  | false | false        |
        | false | true  | false        |
        | false | false | false        |
        --------------------------------


        ================= LOGICAL OR (||) TRUTH TABLE =================

        --------------------------------
        | A     | B     | A || B       |
        --------------------------------
        | true  | true  | true         |
        | true  | false | true         |
        | false | true  | true         |
        | false | false | false        |
        --------------------------------


        ================= LOGICAL NOT (!) TABLE =================

        -------------------
        | A     | !A      |
        -------------------
        | true  | false   |
        | false | true    |
        -------------------
        */
    }

    // ⭐ INTERVIEW IMPORTANT NOTES
    public static void showInterviewConcepts() {

        /*
        ================= INTERVIEW IMPORTANT CONCEPTS =================

        1. && and || are SHORT-CIRCUIT operators
           & and | are NON short-circuit (bitwise + logical)

        2. Logical operators only work with boolean
           (5 && 3) ❌ INVALID

        3. Operator Priority:
           !  >  &&  >  ||

        4. Real Example in Interviews:
           if (a > b && b > c)
           → Both conditions must be true

        5. Difference:
           && → Stops early (faster, safer)
           &  → Evaluates both sides (slower)
        */
    }
}