package Day_9;

/*
===============================================================================
DAY 09 - ARRAY LENGTH + INDEX OUT OF BOUNDS + FOR-EACH LOOP (INTERVIEW MASTER)
Author: Om
Purpose: Full Concept Lock (No Need to Rewatch Lecture)
===============================================================================

===============================================================================
🔷 1. ARRAY LENGTH (VERY IMPORTANT - INTERVIEW)
===============================================================================

Definition:
length = Inbuilt property of array that gives total size of array.

Syntax:
arr.length   (NOT arr.length())

IMPORTANT:
- length is a PROPERTY, not a method
- No parentheses used

Example:
int[] arr = new int[5];
arr.length = 5

===============================================================================
MEMORY TABLE:
Index:   0   1   2   3   4
Value:  [ ] [ ] [ ] [ ] [ ]
Length = 5
Last Index = length - 1 = 4
===============================================================================
*/

public class Day09_Array_Length_ForEach_IndexError {

    public static void main(String[] args) {

        arrayLengthConcept();
        indexOutOfBoundsConcept();
        forEachLoopConcept();
        compareForVsForEach();
    }

    // =========================================================================
    // 🔶 1️⃣ ARRAY LENGTH CONCEPT (FROM YOUR DAY 9 LECTURE)
    // =========================================================================
    public static void arrayLengthConcept() {

        int[] rollNums = {101, 102, 103, 104};

        /*
        MEMORY VISUAL:
        +---------+------+------+------+------+
        | Index   |  0   |  1   |  2   |  3   |
        +---------+------+------+------+------+
        | Value   | 101  | 102  | 103  | 104  |
        +---------+------+------+------+------+

        arr.length = 4
        Last Index = 4 - 1 = 3
        */

        System.out.println("===== ARRAY LENGTH CONCEPT =====");
        System.out.println("Array Length = " + rollNums.length);

        /*
        INTERVIEW TRAP:
        Wrong → arr.length()
        Correct → arr.length
        */
    }

    // =========================================================================
    // 🔶 2️⃣ INDEX OUT OF BOUNDS (MOST ASKED INTERVIEW ERROR)
    // =========================================================================
    public static void indexOutOfBoundsConcept() {

        int[] arr = {10, 20, 30};

        /*
        MEMORY:
        Index:   0   1   2
        Value:  10  20  30
        Length = 3
        Valid Index Range = 0 to 2
        */

        System.out.println("\n===== INDEX OUT OF BOUNDS CONCEPT =====");

        System.out.println("Valid Access arr[2] = " + arr[2]);

        /*
        🚨 ERROR CASE (DO NOT UNCOMMENT IN EXAM):
        System.out.println(arr[3]);

        WHY ERROR?
        Because:
        length = 3
        last index = 2
        index 3 DOES NOT EXIST

        EXCEPTION:
        ArrayIndexOutOfBoundsException
        */

        /*
        FORMULA (INTERVIEW GOLD):
        Valid Index Range = 0 to (length - 1)
        */
    }

    // =========================================================================
    // 🔶 3️⃣ FOR-EACH LOOP (ENHANCED FOR LOOP - INTERVIEW IMPORTANT)
    // =========================================================================
    public static void forEachLoopConcept() {

        int[] marks = {90, 85, 95, 88};

        /*
        DEFINITION:
        For-each loop = Special loop used to traverse arrays easily.

        Syntax:
        for(dataType variable : array) {
            // use variable
        }

        Read as:
        "For each element in array"
        */

        System.out.println("\n===== FOR-EACH LOOP OUTPUT =====");

        for (int value : marks) {
            System.out.println(value);
        }

        /*
        DRY RUN:
        Iteration 1 → value = 90
        Iteration 2 → value = 85
        Iteration 3 → value = 95
        Iteration 4 → value = 88
        */
    }

    // =========================================================================
    // 🔶 4️⃣ FOR LOOP vs FOR-EACH LOOP (INTERVIEW COMPARISON)
    // =========================================================================
    public static void compareForVsForEach() {

        int[] nums = {5, 10, 15};

        System.out.println("\n===== FOR LOOP vs FOR-EACH LOOP =====");

        // Traditional For Loop (Index Based)
        System.out.println("Using Normal For Loop:");
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Index " + i + " = " + nums[i]);
        }

        // For-Each Loop (Direct Value Access)
        System.out.println("\nUsing For-Each Loop:");
        for (int val : nums) {
            System.out.println("Value = " + val);
        }

        /*
        COMPARISON TABLE:
        +----------------+-------------------+------------------+
        | Feature        | For Loop          | For-Each Loop    |
        +----------------+-------------------+------------------+
        | Index Access   | YES               | NO               |
        | Syntax         | Longer            | Short & Clean    |
        | Modification   | Possible          | Not Recommended  |
        | Use Case       | Full control      | Simple Traversal |
        +----------------+-------------------+------------------+
        */
    }
}

/*
===============================================================================
🎯 DAY 9 FINAL INTERVIEW REVISION (ARRAY SPECIAL)
===============================================================================

1️⃣ arr.length
- Gives total size of array
- Property (not method)

2️⃣ Index Out Of Bounds
- Occurs when index >= length
- Valid range = 0 to (length - 1)

3️⃣ For-each Loop
- Used for easy traversal
- Syntax: for(type var : array)
- No index access

MOST ASKED INTERVIEW QUESTIONS:
Q1: Difference between length and length()?
→ length = array property
→ length() = string method

Q2: Why ArrayIndexOutOfBoundsException occurs?
→ Accessing invalid index

Q3: Can we modify array using for-each?
→ Not recommended (no index control)

PLACEMENT GOLD LINE:
“Array valid index always ranges from 0 to length-1,
otherwise Java throws ArrayIndexOutOfBoundsException.”
===============================================================================
*/