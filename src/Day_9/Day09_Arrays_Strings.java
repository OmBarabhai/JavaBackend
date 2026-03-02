package Day_9;

/*
===============================================================================
DAY 09 - ARRAYS + 2D ARRAYS + STRINGS (FINAL IMPROVED REVISION FILE)
Author: Om
Goal: Interview Ready + Clean Revision + No Lecture Rewatch Needed
===============================================================================

🔷 ARRAY - INTERVIEW DEFINITION
Array = Collection of elements of SAME data type
        stored in CONTIGUOUS MEMORY locations.

Key Points:
✔ Fixed Size
✔ Index starts from 0
✔ Fast Access O(1)
===============================================================================
*/

public class Day09_Arrays_Strings {

    public static void main(String[] args) {

        oneDArrayFullConcept();
        twoDArrayFullConcept();   // IMPROVED (Merged + Correct)
        jaggedArrayConcept();
        stringFullConcept();
    }

    // =========================================================================
    // 🔶 1️⃣ 1D ARRAY (FROM YOUR DEMO CODE)
    // =========================================================================
    public static void oneDArrayFullConcept() {

        /*
        DECLARATION:
        int[] arr = new int[3];  ✔ Recommended
        int arr[] = new int[3];  ✔ Old Style (You used this)

        MEMORY (Initial Default Values):
        +--------+--------+--------+--------+
        | Index  |   0    |   1    |   2    |
        +--------+--------+--------+--------+
        | Value  |   0    |   0    |   0    |
        +--------+--------+--------+--------+
        */

        int rollNums[] = new int[3];
        int x = 101;

        /*
        DRY RUN:
        i=0 → rollNums[0] = 101
        i=1 → rollNums[1] = 102
        i=2 → rollNums[2] = 103
        */

        for (int i = 0; i < rollNums.length; i++) {
            rollNums[i] = x;
            x++;
        }

        System.out.println("===== 1D ARRAY OUTPUT =====");
        for (int i = 0; i < rollNums.length; i++) {
            System.out.println("Index " + i + " = " + rollNums[i]);
        }

        /*
        INTERVIEW:
        rollNums.length = 3
        Last Index = length - 1 = 2
        */
    }

    // =========================================================================
    // 🔶 2️⃣ 2D ARRAY (FULLY IMPROVED + INTERVIEW READY)
    // =========================================================================
    public static void twoDArrayFullConcept() {

        /*
        2D ARRAY DEFINITION:
        2D Array = Array of Arrays (Matrix Structure)
        It stores multiple 1D arrays inside it.
        */

        int[][] marks = {
                {12, 14, 56},
                {34, 45, 67},
                {45, 67, 78}
        };

        /*
        MEMORY STRUCTURE (VERY IMPORTANT):

        marks (reference)
              ↓
        +---------+---------+---------+
        | Row 0   | Row 1   | Row 2   |
        +---------+---------+---------+
            ↓         ↓         ↓
        [12,14,56] [34,45,67] [45,67,78]

        MATRIX VIEW:
                  Column →
                0    1    2
        Row  ----------------
         0   | 12 | 14 | 56 |
         1   | 34 | 45 | 67 |
         2   | 45 | 67 | 78 |
        */

        // ================= ⭐ MOST IMPORTANT: LENGTH CONCEPT =================

        /*
        INTERVIEW GOLD QUESTION:
        Difference between arr.length and arr[row].length

        marks.length = Total number of ROWS = 3

        marks[0].length = Columns in Row 0 = 3
        marks[1].length = Columns in Row 1 = 3
        marks[2].length = Columns in Row 2 = 3

        TABLE:
        +---------------------+--------------------------+
        | Expression          | Meaning                  |
        +---------------------+--------------------------+
        | marks.length        | Total Rows               |
        | marks[row].length   | Columns in that row      |
        +---------------------+--------------------------+
        */

        System.out.println("\n===== 2D ARRAY LENGTH =====");
        System.out.println("Total Rows (marks.length): " + marks.length);

        for (int row = 0; row < marks.length; row++) {
            System.out.println("Columns in Row " + row + " = " + marks[row].length);
        }

        /*
        WHY NESTED LOOP LIKE THIS?
        for(row < marks.length) → Controls Rows
        for(col < marks[row].length) → Controls Columns of that row

        DRY RUN:
        row=0 → col=0,1,2
        row=1 → col=0,1,2
        row=2 → col=0,1,2
        */

        System.out.println("\n===== 2D ARRAY (MATRIX OUTPUT) =====");
        for (int row = 0; row < marks.length; row++) {
            for (int col = 0; col < marks[row].length; col++) {
                System.out.print("marks[" + row + "][" + col + "] = " + marks[row][col] + "   ");
            }
            System.out.println();
        }

        /*
        COMMON INTERVIEW MISTAKE:
        ❌ col < marks.length (WRONG)
        ✔ col < marks[row].length (CORRECT)
        */
    }

    // =========================================================================
    // 🔶 3️⃣ JAGGED ARRAY (ADVANCED + INTERVIEW IMPORTANT)
    // =========================================================================
    public static void jaggedArrayConcept() {

        /*
        JAGGED ARRAY:
        2D array where each row has DIFFERENT number of columns
        */

        int[][] marks = new int[3][];

        marks[0] = new int[1];
        marks[1] = new int[2];
        marks[2] = new int[3];

        marks[0][0] = 23;
        marks[1][0] = 24;
        marks[1][1] = 90;
        marks[2][0] = 12;
        marks[2][1] = 78;
        marks[2][2] = 45;

        /*
        MEMORY (NOT RECTANGULAR):

        Row 0 → [23]        → length = 1
        Row 1 → [24, 90]    → length = 2
        Row 2 → [12,78,45]  → length = 3

        IMPORTANT:
        marks.length = 3 (rows)
        marks[row].length = different for each row
        */

        System.out.println("\n===== JAGGED ARRAY OUTPUT =====");
        for (int row = 0; row < marks.length; row++) {
            for (int col = 0; col < marks[row].length; col++) {
                System.out.print(marks[row][col] + " ");
            }
            System.out.println();
        }
    }

    // =========================================================================
    // 🔶 4️⃣ STRING CONCEPT (FROM YOUR DEMO3)
    // =========================================================================
    public static void stringFullConcept() {

        /*
        STRING - INTERVIEW DEFINITION:
        String = Sequence of characters stored as an OBJECT in Java.

        KEY POINTS:
        ✔ Not primitive
        ✔ Immutable (cannot be changed)
        ✔ Stored in String Pool (Advanced)
        */

        String firstName = "Aditya";
        String lastName = "Tandon";
        String fullName = firstName + " " + lastName;

        System.out.println("\n===== STRING OUTPUT =====");
        System.out.println("Full Name: " + fullName);
    }
}

/*
===============================================================================
🎯 FINAL INTERVIEW REVISION (LOCK THIS)
===============================================================================

1D ARRAY:
arr.length → Total elements

2D ARRAY:
arr.length → Number of rows
arr[row].length → Number of columns in that specific row ⭐

JAGGED ARRAY:
Different column size in each row

STRING:
Immutable Object (Not primitive)

MOST ASKED:
Q: Why index starts from 0?
A: Direct memory address calculation efficiency
===============================================================================
*/