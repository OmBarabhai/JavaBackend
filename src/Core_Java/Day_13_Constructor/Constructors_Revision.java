package Core_Java.Day_13_Constructor;

/*
============================================================================
DAY 13 – CONSTRUCTORS (REVISION FILE)
Author: Om
Purpose: Quick Revision + Interview Preparation
============================================================================

WHAT IS A CONSTRUCTOR?

Constructor is a special method used to initialize an object.

Example:

Student s1 = new Student();

When this runs:
1. Memory for object created in HEAP
2. Constructor automatically executes
3. Object fields get initialized

============================================================================
RULES OF CONSTRUCTOR

1. Constructor name must be SAME as class name
2. Constructor has NO return type (not even void)
3. Constructor runs automatically when object is created
4. Used to initialize object variables
5. Constructors can be overloaded

============================================================================
*/

public class Constructors_Revision {

    public static void main(String[] args) {

        /*
        OBJECT CREATION
        */

        StudentRev s1 = new StudentRev();

        /*
        Assign values manually
        */

        s1.name  = "Om";
        s1.college = "HVPM";
        s1.rollNum = 21;
        s1.age = 22;

        /*
        Print values
        */

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNum);
        System.out.println(s1.college);


        /*
        Constructor with parameters
        */

        StudentRev s2 = new StudentRev("Rohit",23,102,"IIT Guwahati");

        System.out.println("\nSecond Student Object");

        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.rollNum);
        System.out.println(s2.college);

    }
}


/*
============================================================================
STUDENT CLASS
============================================================================
*/

class StudentRev{

    /*
    INSTANCE VARIABLES (OBJECT PROPERTIES)
    */

    String name;
    int age;
    int rollNum;
    String college;


    /*
    DEFAULT CONSTRUCTOR
    Automatically provided by JVM if no constructor exists
    */

    StudentRev(){
        // empty constructor
    }


    /*
    PARAMETERIZED CONSTRUCTOR
    Used to initialize object directly
    */

    StudentRev(String name,int age,int rollNum,String college){

        /*
        this keyword refers to current object
        */

        this.name = name;
        this.age = age;
        this.rollNum = rollNum;
        this.college = college;
    }


    /*
    METHOD (BEHAVIOR)
    */

    void markAttend(){

        System.out.println("Attendance Marked for Student " + name);

    }

}



/*
============================================================================
DEFAULT VALUES OF INSTANCE VARIABLES
============================================================================

If values are not assigned, Java gives default values.

Datatype      Default Value

int           0
float         0.0
boolean       false
String        null
object        null

Local variables DO NOT get default values.

Example:

int x;
System.out.println(x); // Compile error

============================================================================
*/


/*
============================================================================
MEMORY FLOW (IMPORTANT INTERVIEW QUESTION)

Student s1 = new Student();

Step 1
Reference variable created in STACK

STACK
-----
s1 → address


Step 2
Object created in HEAP

HEAP
----
Student Object
name
age
rollNum
college


Step 3
Constructor executes automatically

============================================================================
*/


/*
============================================================================
INTERVIEW QUESTIONS

1 What is a constructor?
2 Difference between constructor and method?
3 Why constructor has no return type?
4 What is constructor overloading?
5 What is this keyword?

============================================================================
*/

/*
============================================================================
CONSTRUCTOR – INTERVIEW REVISION
============================================================================

1️⃣ What is a Constructor?

A constructor is a special method used to initialize an object.
It is automatically called when an object is created using the new keyword.

Example:
Student s1 = new Student();

When this line runs:
1. Memory for object is created in HEAP
2. Constructor Student() automatically executes


----------------------------------------------------------------------------

2️⃣ Difference Between Constructor and Method

Constructor
-----------
• Used to initialize object
• Name must be same as class
• No return type (not even void)
• Automatically called when object is created

Method
------
• Used to perform some operation
• Can have any name
• Must have return type
• Called manually

Example:

Student() { }        // constructor
void print() { }     // method


----------------------------------------------------------------------------

3️⃣ Why Constructor Has No Return Type?

Constructor is used only for object initialization.

If we write:

void Student() { }

Then Java treats it as a METHOD, not a constructor.

Correct constructor:

Student() { }

So constructor cannot have any return type.


----------------------------------------------------------------------------

4️⃣ What is Constructor Overloading?

Constructor overloading means having multiple constructors
in the same class with different parameters.

Example:

Student() { }

Student(String name) { }

Student(String name, int age) { }

Java decides which constructor to run based on parameters.


----------------------------------------------------------------------------

5️⃣ What is 'this' Keyword?

this refers to the current object.

Used to differentiate instance variables and parameters.

Example:

class Student {

    String name;

    Student(String name){
        this.name = name;
    }

}

Here

this.name → instance variable
name → constructor parameter


----------------------------------------------------------------------------

INTERVIEW KEY POINTS

• Constructor runs automatically during object creation
• Constructor name must match class name
• Constructor has NO return type
• Constructors can be overloaded
• this refers to current object

============================================================================
*/