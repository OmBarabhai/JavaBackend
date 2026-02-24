package Day_6;

/*
===========================================================
DAY 06 - ARITHMETIC OPERATORS (MASTER REVISION FILE)
Author: Om
Focus: +, -, *, /, %, +=, -=, ++, --
Level: Beginner → Interview Ready
===========================================================

WHAT ARE ARITHMETIC OPERATORS?
These operators are used to perform mathematical calculations.

-----------------------------------------------------------
| Operator | Name        | Example | Result |
-----------------------------------------------------------
| +        | Addition    | 5 + 3   | 8      |
| -        | Subtraction | 5 - 3   | 2      |
| *        | Multiply    | 5 * 3   | 15     |
| /        | Division    | 10 / 3  | 3      |
| %        | Modulus     | 10 % 3  | 1      |
-----------------------------------------------------------

VERY IMPORTANT:
Integer Division removes decimal part (Truncation)
10 / 3 = 3 (NOT 3.33)
*/

public class Day06_Arithmetic_Operators {

    public static void main(String[] args) {

        printTitle();

        // ================= BASIC ARITHMETIC =================
        int a = 10;
        int b = 3;

        int add = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;   // Integer division
        int mod = a % b;

        System.out.println("\n[1] BASIC OPERATIONS");
        System.out.println("Addition (10 + 3) = " + add);
        System.out.println("Subtraction (10 - 3) = " + sub);
        System.out.println("Multiplication (10 * 3) = " + mul);
        System.out.println("Division (10 / 3) = " + div);
        System.out.println("Modulus (10 % 3) = " + mod);

        showDivisionTable();

        // ================= COMPOUND ASSIGNMENT =================
        int x = 5;

        x += 2;  // x = x + 2 → 7
        x -= 1;  // x = x - 1 → 6
        x *= 3;  // x = x * 3 → 18
        x /= 2;  // x = x / 2 → 9
        x %= 4;  // x = x % 4 → 1

        System.out.println("\n[2] COMPOUND OPERATORS FINAL VALUE = " + x);

        showCompoundTable();

        // ================= INCREMENT & DECREMENT =================
        int i = 5;

        i++; // Post Increment
        ++i; // Pre Increment
        i--; // Post Decrement
        --i; // Pre Decrement

        System.out.println("\n[3] FINAL VALUE AFTER ++ and -- = " + i);

        showIncrementTable();
    }

    // Title
    public static void printTitle() {
        System.out.println("======================================");
        System.out.println("DAY 06 - ARITHMETIC OPERATORS");
        System.out.println("+, -, *, /, %, ++, --, +=");
        System.out.println("======================================");
    }

    // ⭐ DIVISION CONCEPT TABLE (VERY IMPORTANT)
    public static void showDivisionTable() {

        /*
        ================= INTEGER DIVISION TABLE =================

        Example: 10 / 3

        Step-by-Step:
        3 × 3 = 9
        Remainder = 1

        So:
        10 / 3 = 3  (Decimal removed)
        10 % 3 = 1  (Remainder)

        IMPORTANT RULE:
        int / int = int (Decimal gets truncated)

        Example Table:
        --------------------------------
        | Expression | Result |
        --------------------------------
        | 10 / 2     | 5      |
        | 10 / 3     | 3      |
        | 10 % 3     | 1      |
        --------------------------------
        */
    }

    // ⭐ COMPOUND OPERATOR TABLE
    public static void showCompoundTable() {

        /*
        ================= COMPOUND ASSIGNMENT =================

        Short form operators (Memory Efficient)

        Example:
        x = 5

        --------------------------------
        | Statement | Equivalent | x |
        --------------------------------
        | x += 2    | x = x + 2  | 7 |
        | x -= 1    | x = x - 1  | 6 |
        | x *= 3    | x = x * 3  |18 |
        | x /= 2    | x = x / 2  | 9 |
        | x %= 4    | x = x % 4  | 1 |
        --------------------------------
        */
    }

    // ⭐ PRE vs POST INCREMENT (INTERVIEW FAVORITE)
    public static void showIncrementTable() {

        /*
        ================= PRE vs POST INCREMENT =================

        Pre Increment (++a):
        - First increase value
        - Then use it

        Post Increment (a++):
        - First use value
        - Then increase it

        Example:
        int a = 5;
        int b = a++; → b = 5, a = 6
        int c = ++a; → a = 7, c = 7

        TABLE:
        --------------------------------
        | Expression | a | Result |
        --------------------------------
        | a = 5      | 5 | -      |
        | b = a++    | 6 | b = 5  |
        | c = ++a    | 7 | c = 7  |
        --------------------------------
        */
    }
}