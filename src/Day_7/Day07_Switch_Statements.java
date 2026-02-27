package Day_7;

/*
===============================================================================
DAY 07 - SWITCH STATEMENTS (MASTER REVISION)
Author: Om
===============================================================================

SWITCH = Multi-way decision statement
Best when comparing FIXED VALUES (not ranges)

SYNTAX:
switch(expression) {
    case value:
        break;
    default:
}

===============================================================================
SUPPORTED DATA TYPES (INTERVIEW MUST REMEMBER)
===============================================================================

+------------+-----------+
| Data Type  | Allowed ? |
+------------+-----------+
| byte       | YES       |
| short      | YES       |
| int        | YES       |
| char       | YES       |
| String     | YES (JDK7+)|
| boolean    | NO ❌     |
| float      | NO ❌     |
| double     | NO ❌     |
+------------+-----------+

IMPORTANT RULES:
- No duplicate case values
- break prevents fall-through
- default executes if no case matches
===============================================================================
*/

public class Day07_Switch_Statements {

    public static void main(String[] args) {
        basicSwitch();
        fallThroughConcept();
        nestedSwitch();
    }

    // 1️⃣ BASIC SWITCH (From Lecture)
    public static void basicSwitch() {
        int i = 1;

        switch (i) {
            case 1:
                System.out.println("[SWITCH] i is 1");
                break;
            case 2:
                System.out.println("[SWITCH] i is 2");
                break;
            case 3:
                System.out.println("[SWITCH] i is 3");
                break;
            default:
                System.out.println("[SWITCH] i > 3");
        }
    }

    // ⭐ FALL THROUGH (VERY IMPORTANT)
    public static void fallThroughConcept() {
        int x = 2;

        System.out.println("\n[FALL THROUGH DEMO]");

        switch (x) {
            case 1:
                System.out.println("Case 1");
            case 2:
                System.out.println("Case 2 Executed");
            case 3:
                System.out.println("Case 3 Also Executed (No Break)");
        }
    }

    // 3️⃣ NESTED SWITCH (Lecture Based)
    public static void nestedSwitch() {
        int j = 5;
        int k = 1;

        System.out.println("\n[NESTED SWITCH]");

        switch (j) {
            case 5:
                switch (k) {
                    case 1:
                        System.out.println("j=5 and k=1");
                        break;
                }
                break;
            default:
                System.out.println("Default executed");
        }
    }
}