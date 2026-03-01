package Day_8;

/*
===============================================================================
DAY 09 - ALL PATTERN PRINTING (MASTER REVISION FILE)
Author: Om
Purpose: One File → All Patterns → Fast Revision + Interview Prep
Based On: All pattern codes you provided (Star, Hollow, Floyd, Pyramid, etc.)
===============================================================================

CORE CONCEPT (MUST REMEMBER 🔒)
Pattern Printing = Nested Loops

Outer Loop (i)  → Controls ROWS
Inner Loop (j)  → Controls COLUMNS / STARS / NUMBERS

GENERAL TEMPLATE:
for(i = 1 to rows){
    for(j = 1 to columns){
        print something
    }
    new line
}

===============================================================================
PATTERN FORMULA CHEAT TABLE (VERY IMPORTANT)
===============================================================================

+----------------------+------------------------+
| Pattern Type         | Inner Loop Condition   |
+----------------------+------------------------+
| Rectangle            | j <= cols              |
| Square               | j <= n                 |
| Left Triangle        | j <= i                 |
| Inverted Triangle    | j <= (n - i + 1)       |
| Pyramid              | spaces + stars logic   |
| Floyd Triangle       | number++               |
+----------------------+------------------------+

===============================================================================
*/

public class Day08_All_Patterns_Master_Revision {

    public static void main(String[] args) {

        solidSquare(4);
        solidRectangle(3, 6);
        leftTriangle(5);
        invertedTriangle(5);
        hollowRectangle(4, 6);
        floydTriangle(5);
        numberTriangle(5);
        alphaTriangle(5);
        pyramid(5);
    }

    // =========================================================================
    // 1️⃣ SOLID SQUARE (StarSq.java)
    // =========================================================================
    public static void solidSquare(int n) {

        /*
        OUTPUT (n=4):
        * * * *
        * * * *
        * * * *
        * * * *

        LOGIC:
        Rows = n
        Columns = n
        */

        System.out.println("===== SOLID SQUARE =====");

        for (int i = 1; i <= n; i++) {      // rows
            for (int j = 1; j <= n; j++) {  // columns
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // =========================================================================
    // 2️⃣ RECTANGLE PATTERN (StarPattern.java)
    // =========================================================================
    public static void solidRectangle(int rows, int cols) {

        /*
        OUTPUT:
        Fixed rows and fixed columns rectangle
        */

        System.out.println("\n===== RECTANGLE PATTERN =====");

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // =========================================================================
    // 3️⃣ LEFT TRIANGLE (StarTriangle.java)
    // =========================================================================
    public static void leftTriangle(int n) {

        /*
        OUTPUT (n=5):
        *
        * *
        * * *
        * * * *
        * * * * *

        IMPORTANT:
        Stars = Row Number (i)
        */

        System.out.println("\n===== LEFT TRIANGLE =====");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // =========================================================================
    // 4️⃣ INVERTED TRIANGLE (TriangleFlippedVertically.java)
    // =========================================================================
    public static void invertedTriangle(int n) {

        /*
        OUTPUT:
        * * * * *
        * * * *
        * * *
        * *
        *
        */

        System.out.println("\n===== INVERTED TRIANGLE =====");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i + 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // =========================================================================
    // 5️⃣ HOLLOW RECTANGLE (HollowRectangle.java)
    // =========================================================================
    public static void hollowRectangle(int rows, int cols) {

        /*
        LOGIC:
        Print star only on border:
        i==1, i==rows, j==1, j==cols
        */

        System.out.println("\n===== HOLLOW RECTANGLE =====");

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {

                if (i == 1 || i == rows || j == 1 || j == cols) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // =========================================================================
    // 6️⃣ FLOYD TRIANGLE (FloydTriangle.java)
    // =========================================================================
    public static void floydTriangle(int n) {

        /*
        OUTPUT:
        1
        2 3
        4 5 6
        7 8 9 10
        */

        System.out.println("\n===== FLOYD TRIANGLE =====");

        int num = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    // =========================================================================
    // 7️⃣ NUMBER TRIANGLE (NumPattern.java)
    // =========================================================================
    public static void numberTriangle(int n) {

        /*
        OUTPUT:
        1
        2 2
        3 3 3
        4 4 4 4
        */

        System.out.println("\n===== NUMBER TRIANGLE =====");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    // =========================================================================
    // 8️⃣ ALPHA TRIANGLE (AlphaTriangle.java)
    // =========================================================================
    public static void alphaTriangle(int n) {

        /*
        OUTPUT:
        A
        B B
        C C C
        D D D D
        */

        System.out.println("\n===== ALPHA TRIANGLE =====");

        char ch = 'A';

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
            }
            ch++;
            System.out.println();
        }
    }

    // =========================================================================
    // 9️⃣ PYRAMID (PyramidNdDiamond.java)
    // =========================================================================
    public static void pyramid(int n) {

        /*
        LOGIC:
        Spaces = n - i
        Stars = 2*i - 1
        */

        System.out.println("\n===== PYRAMID PATTERN =====");

        for (int i = 1; i <= n; i++) {

            // spaces
            for (int s = 1; s <= (n - i); s++) {
                System.out.print("  ");
            }

            // stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}