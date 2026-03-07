package Core_Java.Day_10;

/*
============================================================================
DAY 09 – ARRAYS MASTER REVISION
Author: Om
Goal: Clear understanding for Interviews
============================================================================

WHAT IS AN ARRAY?

Array = Continuous block of memory that stores elements of the same datatype.

Example:

int[] arr = new int[5];

Index → 0 1 2 3 4
Value → _ _ _ _ _

Properties
-----------
1 Same datatype elements
2 Fixed size
3 Continuous memory
4 Index starts from 0

============================================================================
*/


public class Arrays_DeepConcepts_MasterRevision {

    public static void main(String[] args) {

        System.out.println("===== ARRAY CREATION =====");

        int[] arr = new int[5];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        System.out.println("Element at index 2: " + arr[2]);



        System.out.println("\n===== ARRAY LENGTH =====");

        System.out.println("Array Length: " + arr.length);



        System.out.println("\n===== FOR LOOP TRAVERSAL =====");

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }



        System.out.println("\n===== FOR-EACH LOOP =====");

        for(int num : arr){
            System.out.println(num);
        }



        System.out.println("\n===== 2D ARRAY =====");

        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for(int row=0; row<matrix.length; row++){

            for(int col=0; col<matrix[row].length; col++){

                System.out.print(matrix[row][col] + " ");
            }

            System.out.println();
        }


        System.out.println("\n===== STRING ARRAY =====");

        String[] names = {"Aditya","Abhay","Rohit"};

        for(String name : names){
            System.out.println(name);
        }

    }


/*
============================================================================
MEMORY CONCEPT (VERY IMPORTANT FOR INTERVIEW)
============================================================================

PRIMITIVE DATATYPE

Example

int x = 4;

Memory:

STACK
-----
x → 4

Meaning:
Variable directly stores value.


NON PRIMITIVE DATATYPE

Example

int[] arr = new int[5];

Memory:

STACK                    HEAP
-----                    ----
arr  ----------------->  [10,20,30,40,50]

Meaning:
arr does NOT store array
arr stores ADDRESS of array

This variable is called:

REFERENCE VARIABLE

============================================================================
*/


/*
============================================================================
RANDOM ACCESS (INTERVIEW IMPORTANT)
============================================================================

Arrays support RANDOM ACCESS.

Meaning:
You can access any element directly.

Example:

arr[3]

Computer directly jumps to that memory location.

It does NOT iterate like linked list.

============================================================================
*/


/*
============================================================================
ARRAY MEMORY FORMULA
============================================================================

To access any element JVM uses formula:

Address = BaseAddress + (DatatypeSize × Index)

Example

arr[3]

Base address = 100
int size = 4 bytes

Address = 100 + (4 × 3)
Address = 112

JVM directly jumps to memory location 112.

This is why arrays are very fast.

============================================================================
*/


/*
============================================================================
ARRAY INDEX OUT OF BOUNDS
============================================================================

Valid indexes:

0 to arr.length-1

Example:

int[] arr = new int[5];

Valid → 0 1 2 3 4
Invalid → 5 6 7

Example error:

System.out.println(arr[100]);

Error:

ArrayIndexOutOfBoundsException

Java internally checks:

if(index < 0 || index >= arr.length){
    throw ArrayIndexOutOfBoundsException;
}

============================================================================
*/


/*
============================================================================
BOOLEAN SIZE IN JAVA
============================================================================

Java Official Docs:

boolean size = NOT FIXED

But most JVM implementations use

boolean = 1 byte

Reason:
CPU reads memory in bytes not bits.

============================================================================
*/


/*
============================================================================
2D ARRAYS
============================================================================

Example

int[][] arr = new int[3][4];

Conceptually looks like matrix:

0 0 0 0
0 0 0 0
0 0 0 0

But internally Java stores:

ARRAY OF ARRAYS

Memory structure:

arr
 |
 +--> [row0] → array
 +--> [row1] → array
 +--> [row2] → array

Each row is a separate array.

============================================================================
*/


/*
============================================================================
IMPORTANT INTERVIEW QUESTIONS
============================================================================

1 What is an array?
2 Why array indexing starts from 0?
3 What is random access?
4 Difference between primitive and non-primitive?
5 What is reference variable?
6 What is ArrayIndexOutOfBoundsException?
7 What is 2D array internally?
8 What is arr.length?

============================================================================
*/


}