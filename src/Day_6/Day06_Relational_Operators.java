package Day_6;

/*
===========================================================
DAY 06 - RELATIONAL OPERATORS (MASTER REVISION FILE)
Author: Om
Focus: Comparison Operators + Boolean Logic
Level: Beginner Friendly + Interview Ready
===========================================================

WHAT ARE RELATIONAL OPERATORS?
Relational operators are used to compare two values.
They always return BOOLEAN (true or false).

-----------------------------------------------------------
| Operator | Meaning              | Example | Result |
-----------------------------------------------------------
| ==       | Equal to             | 5 == 5  | true   |
| !=       | Not Equal to         | 5 != 3  | true   |
| >        | Greater than         | 7 > 5   | true   |
| <        | Less than            | 3 < 8   | true   |
| >=       | Greater than equal   | 5 >= 5  | true   |
| <=       | Less than equal      | 4 <= 6  | true   |
-----------------------------------------------------------

VERY IMPORTANT:
=  → Assignment
== → Comparison (INTERVIEW TRAP)
*/

public class Day06_Relational_Operators {

    public static void main(String[] args) {

        printTitle();

        // ================= BASIC COMPARISON =================
        int a = 10;
        int b = 5;
        int c = 10;

        boolean eq = (a == c);   // true
        boolean neq = (a != b);  // true
        boolean gt = (a > b);    // true
        boolean lt = (b < a);    // true
        boolean gte = (a >= c);  // true
        boolean lte = (b <= a);  // true

        System.out.println("\n[1] BASIC RELATIONAL OPERATIONS");
        System.out.println("a == c : " + eq);
        System.out.println("a != b : " + neq);
        System.out.println("a > b  : " + gt);
        System.out.println("b < a  : " + lt);
        System.out.println("a >= c : " + gte);
        System.out.println("b <= a : " + lte);

        showComparisonTable();
        showAssignmentVsEquality();
        showInterviewTraps();
    }

    // Title
    public static void printTitle() {
        System.out.println("======================================");
        System.out.println("DAY 06 - RELATIONAL OPERATORS");
        System.out.println("==, !=, >, <, >=, <=");
        System.out.println("======================================");
    }

    // ⭐ COMPARISON LOGIC TABLE (VERY IMPORTANT)
    public static void showComparisonTable() {

        /*
        ================= COMPARISON TRUTH TABLE =================

        Let:
        a = 10
        b = 5
        c = 10

        -------------------------------------------------
        | Expression | Calculation | Result (Boolean) |
        -------------------------------------------------
        | a == c     | 10 == 10    | true             |
        | a == b     | 10 == 5     | false            |
        | a != b     | 10 != 5     | true             |
        | a > b      | 10 > 5      | true             |
        | a < b      | 10 < 5      | false            |
        | a >= c     | 10 >= 10    | true             |
        | b <= a     | 5 <= 10     | true             |
        -------------------------------------------------

        KEY RULE:
        Relational operators ALWAYS return boolean (true/false)
        */
    }

    // ⭐ MOST COMMON MISTAKE (INTERVIEW)
    public static void showAssignmentVsEquality() {

        /*
        ================= '=' vs '==' (CRITICAL) =================

        '='  → Assignment Operator
        '==' → Comparison Operator

        Example:
        int x = 5;   // Assignment (store value)
        x == 5;      // Comparison (check value)

        INTERVIEW TRAP:
        if (a = b)   ❌ WRONG (Compilation Error)
        if (a == b)  ✅ CORRECT (Comparison)

        MEMORY TIP:
        =  → Store value
        == → Compare value
        */
    }

    // ⭐ INTERVIEW EDGE CASES
    public static void showInterviewTraps() {

        /*
        ================= INTERVIEW IMPORTANT NOTES =================

        1. Relational operators work with:
           - int
           - float
           - char
           - double

        2. char comparison uses ASCII values:
           Example:
           'a' = 97
           'b' = 98

           'a' < 'b' → true (97 < 98)

        3. Cannot compare boolean with relational operators:
           boolean x = true;
           x > false ❌ INVALID

        4. Output type is ALWAYS boolean:
           (5 > 3) → true
           (2 == 4) → false
        */
    }
}