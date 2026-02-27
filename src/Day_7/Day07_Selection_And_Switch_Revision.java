package Day_7;

/*
===============================================================================
DAY 07 - MASTER REVISION (SELECTION + SWITCH) - 1 MIN CHEAT FILE
Author: Om
===============================================================================

FLOW OF CONTROL:
Default → Top to Bottom execution
Selection Statements → Change flow based on condition

===============================================================================
IF vs SWITCH (INTERVIEW TABLE)
===============================================================================

+------------------+---------------------+----------------------+
| Feature          | IF-ELSE             | SWITCH               |
+------------------+---------------------+----------------------+
| Condition Type   | Range & Complex     | Fixed Values Only    |
| Logic            | Boolean Conditions  | Equality Check       |
| Performance      | Slightly Slower     | Faster (Jump Table)  |
| Readability      | Long Ladder         | Clean Case Structure |
| Best Use Case    | Dynamic Logic       | Menu / Options       |
+------------------+---------------------+----------------------+

===============================================================================
TOP INTERVIEW TRAPS (VERY IMPORTANT)
===============================================================================

1. Multiple IF ≠ else-if ladder
2. Missing break → Fall Through
3. switch does NOT support:
   boolean, float, double
4. default block runs if no case matches
5. else binds to nearest if
===============================================================================
*/

    public class Day07_Selection_And_Switch_Revision {

        public static void main(String[] args) {

            trapDemo();
            ifVsSwitchDemo();
        }

        // ⭐ TRAP: Missing break (Fall Through)
        public static void trapDemo() {
            int x = 1;

            System.out.println("[INTERVIEW TRAP - FALL THROUGH]");

            switch (x) {
                case 1:
                    System.out.println("Case 1");
                case 2:
                    System.out.println("Case 2 (Executed due to no break)");
            }
        }

        // ⭐ IF vs SWITCH Concept Demo
        public static void ifVsSwitchDemo() {
            int day = 3;

            if (day == 3) {
                System.out.println("[IF] Wednesday");
            }

            switch (day) {
                case 3:
                    System.out.println("[SWITCH] Wednesday");
                    break;
            }
        }
    }