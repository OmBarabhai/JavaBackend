package Core_Java.Day_12;

/*
============================================================================
DAY 12 – CLASS & OBJECT (FAST REVISION FILE)
Author: Om
Goal: Quick Revision Before Interview
============================================================================

WHAT IS OOP?

Object-Oriented Programming = Programming using Objects.

Real World Example:
Student has
1. Properties (Characteristics)
2. Behaviors (Actions)

Example:
Student
 - name
 - age
 - rollNumber
 - branch

Behavior
 - markAttendance()
 - printDetails()

============================================================================
CLASS

Class = Blueprint / Template to create objects.

Example:
class Student { }

This class tells:
"What a Student object will contain"
============================================================================
*/


public class Basic_OOP {

    public static void main(String[] args) {

        /*
        OBJECT CREATION
        Syntax:

        ClassName referenceVariable = new ClassName();
        */

        Student s1 = new Student();
        Student s2 = new Student();


        /*
        ASSIGN VALUES
        */

        s1.name = "Om";
        s1.age = 22;
        s1.rollNumber = 101;
        s1.branch = "Computer Science";

        s2.name = "Rohit";
        s2.age = 23;
        s2.rollNumber = 102;
        s2.branch = "Information Technology";


        /*
        CALLING METHODS
        */

        s1.markAttendance();
        s2.markAttendance();

        System.out.println();

        s1.printDetails();
        s2.printDetails();
    }
}



/*
============================================================================
STUDENT CLASS
============================================================================
*/

class Student {

    /*
    PROPERTIES (STATE)
    */

    String name;
    int age;
    int rollNumber;
    String branch;


    /*
    BEHAVIOR (METHODS)
    */

    void markAttendance() {

        System.out.println("Attendance marked for " + name);
    }


    void printDetails() {

        System.out.println(name + " | Age: " + age + " | Roll: " + rollNumber + " | Branch: " + branch);
    }
}



/*
============================================================================
MEMORY CONCEPT (VERY IMPORTANT FOR INTERVIEW)
============================================================================

Student s1 = new Student();

STEP 1
Reference Variable created in STACK

STACK
-----
s1 → address


STEP 2
Object created in HEAP

HEAP
----
Student Object
name
age
rollNumber
branch


STEP 3
s1 stores address of object.

IMPORTANT:

s1 is NOT object.
s1 is reference variable.

Object lives in HEAP memory.

============================================================================
KEY INTERVIEW POINTS
============================================================================

Class
------
Blueprint of object.

Object
------
Instance of class.

new keyword
-----------
Creates object in heap memory.

Reference Variable
------------------
Stores address of object.

Example

Student s1 = new Student();

Student → type
s1 → reference variable
new Student() → object creation

============================================================================
NAMING CONVENTION (GOOD PRACTICE)
============================================================================

Classes
-------
Start with Capital Letter

Student
Animal
BankAccount


Variables
---------
camelCase

firstName
rollNumber
studentAge


Methods
-------
camelCase

printDetails()
markAttendance()

============================================================================
FAST REVISION SUMMARY
============================================================================

Class = Blueprint

Object = Instance of class

Object creation:

Student s1 = new Student();

Objects → Heap memory
Reference variables → Stack memory

Class contains:
1. Variables (State)
2. Methods (Behavior)

============================================================================
*/