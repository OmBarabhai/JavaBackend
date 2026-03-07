package Core_Java.Day_11;

/*
===========================================================
RECURSION IN JAVA (CORE BACKEND INTERVIEW REVISION)
===========================================================

Definition:
Recursion is when a function calls itself.

Example:
fun() -> calls -> fun()

Important Concepts:
1. Base Case
2. Recursive Case
3. Stack Memory

Structure of Recursion:

function(n){
    if(base condition)
        return

    function(smaller problem)

}
===========================================================
*/

public class Recursion{

    public static void main(String[] args) {

        System.out.println("Print numbers using recursion:");
        printNum(5);

        System.out.println("\nFactorial:");
        System.out.println(factorial(5));

        System.out.println("\nSum of N numbers:");
        System.out.println(sum(5));

        System.out.println("\nFibonacci:");
        System.out.println(fibonacci(6));

    }


    // --------------------------------------------------
    // 1️⃣ PRINT NUMBERS (Most basic recursion example)
    // --------------------------------------------------

    static void printNum(int n){

        // Base case
        if(n==0)
            return;

        printNum(n-1);   // recursive call

        System.out.println(n);
    }


    /*
    Execution Flow

    printNum(5)
    → printNum(4)
    → printNum(3)
    → printNum(2)
    → printNum(1)
    → printNum(0)

    Then stack returns
    */


    // --------------------------------------------------
    // 2️⃣ FACTORIAL (Most asked recursion question)
    // --------------------------------------------------

    static int factorial(int n){

        if(n==1)
            return 1;

        return n * factorial(n-1);
    }


    /*
    factorial(5)

    5 * factorial(4)
    4 * factorial(3)
    3 * factorial(2)
    2 * factorial(1)
    = 120
    */


    // --------------------------------------------------
    // 3️⃣ SUM OF N NUMBERS
    // --------------------------------------------------

    static int sum(int n){

        if(n==1)
            return 1;

        return n + sum(n-1);
    }


    /*
    sum(5)

    5 + sum(4)
    4 + sum(3)
    3 + sum(2)
    2 + sum(1)

    = 15
    */


    // --------------------------------------------------
    // 4️⃣ FIBONACCI (INTERVIEW IMPORTANT)
    // --------------------------------------------------

    static int fibonacci(int n){

        if(n==0 || n==1)
            return n;

        return fibonacci(n-1) + fibonacci(n-2);
    }

}