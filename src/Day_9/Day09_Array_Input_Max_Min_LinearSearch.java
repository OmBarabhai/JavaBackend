package Day_9;

import java.util.Scanner;

/*
===============================================================================
DAY 09.3 - ARRAY INPUT + MAX + MIN + LINEAR SEARCH (DSA BRIDGE FILE)
Author: Om
Purpose: Placement + Interview + DSA Foundation
===============================================================================

This file covers MOST ASKED beginner interview array concepts:
1. Taking Array Input (Scanner)
2. Finding Maximum Element
3. Finding Minimum Element
4. Linear Search (VERY IMPORTANT FOR DSA)

===============================================================================
🔷 1. ARRAY INPUT (INTERVIEW BASICS)
===============================================================================

Why Input Needed?
In real coding rounds, array is given by user or input stream.

Steps:
1. Create Scanner
2. Take size input
3. Create array
4. Fill using loop

Memory Example:
User Input: 5 elements
Array Memory:
Index:   0   1   2   3   4
Value:  [ ] [ ] [ ] [ ] [ ]

===============================================================================
*/

public class Day09_Array_Input_Max_Min_LinearSearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ================= ARRAY INPUT =================
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        printArray(arr);
        findMaximum(arr);
        findMinimum(arr);
        linearSearch(arr, sc);

        sc.close();
    }

    // =========================================================================
    // 🔶 PRINT ARRAY (REVISION + DEBUGGING IMPORTANT)
    // =========================================================================
    public static void printArray(int[] arr) {

        /*
        DRY RUN EXAMPLE:
        Input: 10 20 30

        Loop Flow:
        i=0 → arr[0]=10
        i=1 → arr[1]=20
        i=2 → arr[2]=30
        */

        System.out.println("\n===== ARRAY ELEMENTS =====");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index " + i + " = " + arr[i]);
        }
    }

    // =========================================================================
    // 🔶 FIND MAXIMUM ELEMENT (VERY IMPORTANT)
    // =========================================================================
    public static void findMaximum(int[] arr) {

        /*
        LOGIC (Feynman Style):
        1. Assume first element is maximum
        2. Compare with all elements
        3. Update max if bigger element found

        TIME COMPLEXITY: O(n)
        */

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        /*
        DRY RUN (Example: 5, 9, 2, 15, 3)

        Initial max = 5
        Compare 9 > 5 → max = 9
        Compare 2 > 9 → No
        Compare 15 > 9 → max = 15
        Compare 3 > 15 → No

        Final Max = 15
        */

        System.out.println("\nMaximum Element = " + max);
    }

    // =========================================================================
    // 🔶 FIND MINIMUM ELEMENT (INTERVIEW CLASSIC)
    // =========================================================================
    public static void findMinimum(int[] arr) {

        /*
        LOGIC:
        Same as max but reverse comparison
        */

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        /*
        DRY RUN (Example: 5, 9, 2, 15, 3)

        Initial min = 5
        Compare 9 < 5 → No
        Compare 2 < 5 → min = 2
        Compare 15 < 2 → No
        Compare 3 < 2 → No

        Final Min = 2
        */

        System.out.println("Minimum Element = " + min);
    }

    // =========================================================================
    // 🔶 LINEAR SEARCH (DSA FOUNDATION - SUPER IMPORTANT)
    // =========================================================================
    public static void linearSearch(int[] arr, Scanner sc) {

        System.out.print("\nEnter element to search: ");
        int key = sc.nextInt();

        /*
        LINEAR SEARCH DEFINITION:
        Checking each element one by one
        until element is found.

        Time Complexity: O(n)
        Best Case: O(1)
        Worst Case: O(n)
        */

        int foundIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex != -1) {
            System.out.println("Element found at index: " + foundIndex);
        } else {
            System.out.println("Element NOT found in array");
        }

        /*
        DRY RUN:
        Array: [10, 20, 30, 40]
        Key = 30

        i=0 → 10 == 30 ❌
        i=1 → 20 == 30 ❌
        i=2 → 30 == 30 ✅ Found
        */
    }
}

/*
===============================================================================
🎯 FINAL INTERVIEW REVISION (ARRAY DSA BASICS)
===============================================================================

ARRAY INPUT:
for(i = 0; i < arr.length; i++)
    arr[i] = sc.nextInt();

FIND MAX:
Assume first element as max → compare all

FIND MIN:
Assume first element as min → compare all

LINEAR SEARCH:
Check elements one by one

TIME COMPLEXITIES:
Traversal = O(n)
Max/Min = O(n)
Linear Search = O(n)

MOST ASKED INTERVIEW QUESTIONS:
Q1: Why start loop from i = 1 in max/min?
→ Because first element already assumed

Q2: Default value of int array?
→ 0

Q3: Difference between Binary Search & Linear Search?
→ Linear = Unsorted array
→ Binary = Sorted array (faster)

PLACEMENT GOLD LINE:
“Linear Search checks each element sequentially,
so its time complexity is O(n).”
===============================================================================
*/