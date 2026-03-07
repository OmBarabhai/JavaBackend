package Core_Java.Day_11;

/*
====================================================================
DAY 10 – FUNCTIONS MASTER REVISION (JAVA)
Author: Om
Goal: Backend Interview + Core Java Understanding
====================================================================

WHAT IS A FUNCTION?

A function is a block of reusable code that performs a specific task.

Why Functions?
1 Code Reusability
2 Reduce Code Duplication
3 Better Readability
4 Easier Debugging

Example problem without function:
We repeat the same logic again and again.

Functions solve this by writing the logic once and calling it many times.

====================================================================
STRUCTURE OF A FUNCTION

static returnType functionName(parameters){
        // logic
        return value;
}

Example:
static int sum(int a,int b){
        return a+b;
}

====================================================================
IMPORTANT TERMS

Return Type → Type of value function returns
Function Name → Name used to call function
Parameters → Variables in function definition
Arguments → Actual values passed during function call

Example

sum(4,5)

4,5 → arguments
a,b → parameters

====================================================================
*/

public class Functions_MasterRevision {

    public static void main(String[] args) {

        System.out.println("===== BASIC FUNCTIONS =====");

        greet();

        sayHello("Om");

        int num = getNumber();
        System.out.println("Number returned: " + num);

        int result = multiply(3,4);
        System.out.println("Multiplication: " + result);



        System.out.println("\n===== FUNCTION OVERLOADING =====");

        System.out.println(sum(2,3));

        System.out.println(sum(2,3,4));

        greet("Aditya",28);

        greet(28,"Rohit");



        System.out.println("\n===== FUNCTION CHAINING =====");

        fun1();



        System.out.println("\n===== VARIABLE SCOPE =====");

        scopeExample();



        System.out.println("\n===== RECURSION =====");

        printNum(5);

        System.out.println("Factorial: " + factorial(5));

        System.out.println("Fibonacci: " + fibonacci(6));
    }



/*
====================================================================
1 BASIC FUNCTIONS
====================================================================
*/


    // No Input No Output
    static void greet(){
        System.out.println("Hello");
    }


    // Input No Output
    static void sayHello(String name){
        System.out.println("Hello " + name);
    }


    // No Input Output
    static int getNumber(){
        return 10;
    }


    // Input Output
    static int multiply(int a,int b){
        return a * b;
    }



/*
====================================================================
2 TYPES OF FUNCTIONS (INTERVIEW)
====================================================================

1 No Input No Output
void greet()

2 Input No Output
void sayHello(String name)

3 No Input Output
int getNumber()

4 Input Output
int multiply(int a,int b)

====================================================================
*/



/*
====================================================================
3 FUNCTION OVERLOADING
====================================================================

Definition:
Multiple methods having same name but different parameters.

Rules
1 Different number of parameters
2 Different type of parameters
3 Different order of parameters

Called:
Compile Time Polymorphism
*/


    static int sum(int a,int b){
        return a + b;
    }


    static int sum(int a,int b,int c){
        return a + b + c;
    }


    static void greet(String name,int age){
        System.out.println("Hi "+name+" Age "+age);
    }


    static void greet(int age,String name){
        System.out.println("Hi "+name+" Age "+age);
    }



/*
====================================================================
4 FUNCTION CHAINING
====================================================================

When one function calls another function.

Flow:
main → fun1 → fun2 → fun3
*/


    static void fun1(){
        fun2();
        System.out.println("Hi");
    }


    static void fun2(){
        fun3();
        System.out.println("Hello");
    }


    static void fun3(){
        System.out.println("How are you");
    }



/*
====================================================================
5 VARIABLE SCOPE
====================================================================

Two Types

1 Local Variable
Declared inside method or block

2 Global Variable
Declared inside class
*/

    static String name = "Aditya";   // global variable


    static void scopeExample(){

        int x = 4;   // local
        int y = 5;

        if(x==4){

            int j = 7;
            System.out.println("Inside block: "+j);
        }

        System.out.println("Local variables: "+x+" "+y);

        System.out.println("Global variable: "+name);
    }



/*
====================================================================
6 RECURSION
====================================================================

Definition:
Recursion is when a function calls itself.

Important parts

1 Base Case → stops recursion
2 Recursive Case → function calls itself

Example:
printNum(5)

printNum(5)
printNum(4)
printNum(3)
printNum(2)
printNum(1)
printNum(0)

Then stack returns
*/


    static void printNum(int n){

        if(n==0)
            return;

        printNum(n-1);

        System.out.println(n);
    }



/*
====================================================================
FACTORIAL USING RECURSION
====================================================================

factorial(5)

5 * factorial(4)
4 * factorial(3)
3 * factorial(2)
2 * factorial(1)

=120
*/

    static int factorial(int n){

        if(n==1)
            return 1;

        return n * factorial(n-1);
    }



/*
====================================================================
FIBONACCI USING RECURSION
====================================================================

fib(6)

fib(5) + fib(4)

Sequence
0 1 1 2 3 5 8
*/

    static int fibonacci(int n){

        if(n==0 || n==1)
            return n;

        return fibonacci(n-1) + fibonacci(n-2);
    }



/*
====================================================================
INTERVIEW QUESTIONS
====================================================================

1 What is function in Java?
2 Difference between parameter and argument?
3 What is function overloading?
4 What is recursion?
5 What is base case?

====================================================================
*/

}