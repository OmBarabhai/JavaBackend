package Day_7;

/*
===============================================================================
DAY 07 - SELECTION STATEMENTS (FLOW OF CONTROL - REVISION)
Author: Om
===============================================================================

FLOW OF CONTROL (Lecture Core):
Program normally executes Top → Bottom.
Selection statements change execution based on condition (true/false).

Condition = true  → block executes
Condition = false → block skipped

===============================================================================
TYPES OF SELECTION STATEMENTS
===============================================================================

+-------------------+------------------------------------------+
| Type              | Purpose                                  |
+-------------------+------------------------------------------+
| if                | Single condition                         |
| if-else           | Two possible paths                       |
| else-if ladder    | Multiple conditions (range checking)     |
| Nested if         | if inside another if                    |
+-------------------+------------------------------------------+

INTERVIEW NOTE:
else always attaches to the nearest if.
===============================================================================
*/

public class Day07_Selection_Statements {

    public static void main(String[] args) {
        basicIf();
        ifElse();
        elseIfLadder();
        nestedIf();
        importantTrap();
    }

    // 1️⃣ BASIC IF
    public static void basicIf() {
        int age = 25;

        if (age > 18) {
            System.out.println("[IF] Age > 18");
        }
    }

    // 2️⃣ IF-ELSE
    public static void ifElse() {
        int number = 7;

        if (number % 2 == 0) {
            System.out.println("[IF-ELSE] Even");
        } else {
            System.out.println("[IF-ELSE] Odd");
        }
    }

    // 3️⃣ ELSE-IF LADDER (RANGE LOGIC)
    public static void elseIfLadder() {
        int marks = 82;

        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 60) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }
    }

    // 4️⃣ NESTED IF
    public static void nestedIf() {
        int i = 8;

        if (i > 5) {
            if (i < 10) {
                System.out.println("[NESTED IF] i between 5 and 10");
            }
        }
    }

    // ⭐ VERY IMPORTANT INTERVIEW TRAP
    public static void importantTrap() {
        int age = 50;

        System.out.println("\n[TRAP] Multiple IF (not ladder)");

        if (age > 80) {
            System.out.println("Very old");
        }
        if (age > 60) {
            System.out.println("Old");
        }
        if (age > 40) {
            System.out.println("Becoming old");
        }
        if (age > 20) {
            System.out.println("Young");
        } else {
            System.out.println("Child");
        }

        /*
        IMPORTANT:
        These are independent IF statements,
        NOT an else-if ladder.
        */
    }
}