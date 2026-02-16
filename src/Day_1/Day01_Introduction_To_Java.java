package Day_1;
/*
===========================================================
DAY 01 - CORE JAVA (INTRODUCTION)
Topic: Why Java? | Portability | JVM | Bytecode | Security
===========================================================

Lecture Understanding (Day 1):
- Why Java was created
- Problems in C & C++
- Platform Dependency
- JVM Concept
- Bytecode
- Write Once Run Anywhere (WORA)
*/

public class Day01_Introduction_To_Java {

    public static void main(String[] args) {

        // ========= 1. WHY JAVA CAME? =========
        System.out.println("Day 1: Introduction to Java");

        /*
        Before Java (1980-1990):
        Popular Languages: C and C++

        They were:
        - Fast
        - Low Level (close to hardware)
        - Platform Dependent
        */

        // ========= 2. MAIN PROBLEM IN C & C++ =========
        // PROBLEM 1: Platform Dependency

        /*
        Platform = Processor + Operating System

        Example:
        Platform 1 = Intel + Windows
        Platform 2 = ARM + Mac

        If we compile C/C++ code:
        -> It generates Machine Code (0s and 1s)
        -> That machine code is different for every platform

        Means:
        Same code will NOT run everywhere.
        Need to recompile again and again.
        */

        explainPlatformDependency();

        // ========= 3. HOW JAVA SOLVED THIS (VERY IMPORTANT) =========
        // Java introduced BYTECODE + JVM

        explainJavaFlow();

        // ========= 4. JVM (Java Virtual Machine) =========
        /*
        JVM is like a TRANSLATOR (Friend Analogy)

        Step Flow:
        .java file (Source Code)
                ↓ (Compiler)
        .class file (Bytecode)
                ↓ (JVM)
        Machine Code (Platform Specific)
        */

        // ========= 5. WRITE ONCE RUN ANYWHERE =========
        /*
        Java = Platform Independent
        Because:
        - Bytecode is same for all platforms
        - JVM converts bytecode to machine code of that platform

        This concept is called:
        WORA = Write Once Run Anywhere
        */

        // ========= 6. WHY DIFFERENT MACHINE CODE? =========
        /*
        Because:
        1. Different Operating Systems (Windows, Mac, Linux)
        2. Different Processors (Intel, ARM)
        3. Different Instruction Set Architecture (ISA)

        CPU only understands Binary (0 and 1)
        */

        // ========= 7. 3 MAIN FEATURES OF JAVA =========
        explainJavaFeatures();

        // ========= 8. SECURITY IN JAVA =========
        /*
        Java is Secure because of:
        - JVM Sandbox Model
        - Restricted Execution Environment
        - No direct memory access like C++
        */

        System.out.println("Day 1 Revision Completed Successfully!");
    }

    // Method to explain Platform Dependency (Revision Style)
    public static void explainPlatformDependency() {
        System.out.println("\nProblem in C/C++: Platform Dependency");

        /*
        Example:
        Same Hello.cpp file
        ↓ Compile on Windows
        -> Windows Machine Code

        ↓ Compile on Mac
        -> Mac Machine Code (Different)

        So we must compile again for every platform.
        This is BAD portability.
        */
    }

    // Method to explain Java Flow (Most Important Concept)
    public static void explainJavaFlow() {
        System.out.println("\nJava Solution: Bytecode + JVM");

        /*
        Java Flow (Core Concept for Interviews):

        Step 1: Write Code -> Hello.java
        Step 2: Compile -> javac Hello.java
        Step 3: Generates -> Hello.class (Bytecode)
        Step 4: JVM reads Bytecode
        Step 5: JVM converts into Machine Code of that system

        Key Point:
        Bytecode is PLATFORM INDEPENDENT
        JVM is PLATFORM DEPENDENT
        */
    }

    // Method to explain Java Features (Interview Ready)
    public static void explainJavaFeatures() {
        System.out.println("\nTop 3 Reasons Java Became Popular:");

        // 1. Portability
        System.out.println("1. Portable (Platform Independent)");
        /*
        Run same bytecode on:
        - Windows
        - Mac
        - Linux
        - Servers
        - Embedded Devices
        */

        // 2. Simplicity
        System.out.println("2. Simple Language");
        /*
        Java removed complex C++ features:
        - No Pointers (direct memory handling)
        - No Multiple Inheritance (complex)
        - Automatic Garbage Collection
        */

        // 3. Security
        System.out.println("3. Secure Language");
        /*
        Security provided by:
        - JVM Verification
        - Sandbox Execution
        - No unsafe memory access
        */
    }
}

/*
================ QUICK 30-SECOND REVISION =================
Why Java?
1. C/C++ were Platform Dependent
2. Java introduced Bytecode
3. JVM converts Bytecode to Machine Code
4. WORA = Write Once Run Anywhere

Java = Portable + Simple + Secure

MOST IMPORTANT INTERVIEW LINE:

"Java is platform independent because it uses JVM
which converts platform-independent bytecode into
platform-specific machine code."

===========================================================
*/
