package Day_2;
/*
===========================================================
DAY 02 - CORE JAVA (JVM, JRE, JDK + Editions)
Author: Om (Fast Revision Notes)
Lecture Topics:
- JVM Deep Understanding
- JRE vs JDK
- Compiler vs Interpreter
- JIT Compiler
- JSE, JEE, JME
===========================================================

Goal:
Quick 5-minute revision before interview or practice
*/

public class Day02_JVM_JRE_JDK_Architecture {

    public static void main(String[] args) {

        System.out.println("Day 2: JVM, JRE, JDK Revision");

        // 1️⃣ Java Execution Flow (Most Important)
        javaExecutionFlow();

        // 2️⃣ What is JVM?
        explainJVM();

        // 3️⃣ Compiler vs Interpreter (Interview Favorite)
        compilerVsInterpreter();

        // 4️⃣ JIT Compiler Concept
        explainJIT();

        // 5️⃣ JRE vs JDK vs JVM (Hierarchy)
        explainHierarchy();

        // 6️⃣ Java Editions (JSE, JEE, JME)
        explainJavaEditions();

        System.out.println("\nDay 2 Revision Completed!");
    }

    // ========= 1. JAVA EXECUTION FLOW =========
    public static void javaExecutionFlow() {

        System.out.println("\n1. Java Execution Flow:");

        /*
        Step 1: Write Code -> Demo.java (Source Code)
        Step 2: Compile -> javac Demo.java
        Step 3: Generate -> Demo.class (Bytecode)
        Step 4: JVM runs Bytecode
        Step 5: Converts into Machine Code
        Step 6: CPU executes → Output
        */

        System.out.println("Source Code → JVM → Output");
    }

    // ========= 2. JVM EXPLANATION =========
    public static void explainJVM() {

        System.out.println("\n2. What is JVM?");

        /*
        JVM = Java Virtual Machine

        Simple Meaning:
        A virtual computer inside your system
        where Java Bytecode runs.

        Main Work of JVM:
        1. Convert Bytecode → Machine Code
        2. Provide Security (Sandbox)
        3. Memory Management (Garbage Collection)
        */
    }

    // ========= 3. COMPILER vs INTERPRETER =========
    public static void compilerVsInterpreter() {

        System.out.println("\n3. Compiler vs Interpreter:");

        /*
        COMPILER:
        - Converts whole code at once
        - Faster execution
        - Example: C, C++

        INTERPRETER:
        - Converts code line by line
        - Slower but flexible
        - Example: Python

        JAVA = Hybrid (Both)
        */
    }

    // ========= 4. JIT COMPILER =========
    public static void explainJIT() {

        System.out.println("\n4. JIT (Just-In-Time) Compiler:");

        /*
        Earlier JVM used only Interpreter (slow hardware time)

        Modern JVM uses:
        Interpreter + JIT Compiler

        JIT Work:
        - Detect frequently used code
        - Convert it directly into Machine Code
        - Improves performance

        Result:
        Java becomes faster in modern systems
        */
    }

    // ========= 5. JVM vs JRE vs JDK =========
    public static void explainHierarchy() {

        System.out.println("\n5. JVM vs JRE vs JDK Hierarchy:");

        /*
        🔴 JVM (Inner Layer)
        - Runs Bytecode
        - Converts to Machine Code
        - Security + Garbage Collection

        🟡 JRE = JVM + Class Libraries
        - Required to RUN Java programs
        - Provides built-in libraries (Print, File, etc.)

        🟢 JDK = JRE + Development Tools
        - Compiler (javac)
        - Debugger
        - Development utilities

        FINAL:
        JDK > JRE > JVM
        */
    }

    // ========= 6. JAVA EDITIONS =========
    public static void explainJavaEditions() {

        System.out.println("\n6. Java Editions (Very Important for Interview):");

        // JSE
        System.out.println("JSE = Java Standard Edition (Core Java)");
        /*
        - Core Java
        - OOP, Classes, Methods
        - Basic Applications
        */

        // JEE
        System.out.println("JEE = Java Enterprise Edition (Now Jakarta EE)");
        /*
        - Web Applications
        - Enterprise Level Apps
        - Used in Spring Boot, Backend Systems
        */

        // JME
        System.out.println("JME = Java Micro Edition");
        /*
        - Old Mobile Devices
        - Embedded Systems
        - Mostly obsolete now
        */
    }
}

/*
=================INTERVIEW REVISION =================

✔ JVM:
Runs Bytecode → Converts to Machine Code
Uses Interpreter + JIT Compiler
Provides Security + Garbage Collection

✔ JRE:
JVM + Class Libraries
Used to RUN Java programs

✔ JDK:
JRE + Compiler + Debug Tools
Used to DEVELOP Java programs

✔ Java is:
Compiled + Interpreted Language (Hybrid)

✔ Java Editions:
JSE = Core Java
JEE = Enterprise (Web Apps)
JME = Micro (Old Mobile Devices)

MOST IMPORTANT INTERVIEW LINE:
"JDK is a complete package that contains JRE,
and JRE contains JVM."
==============================================================
*/
