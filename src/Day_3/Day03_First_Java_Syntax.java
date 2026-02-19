package Day_3;

/*
===========================================================
DAY 03 - First Java Program + Syntax (Proper Revision)
Author: Om
Lecture Focus:
1. Java Program Structure
2. main() Method
3. System.out.println()
4. How Java Program Runs
===========================================================
*/

public class Day03_First_Java_Syntax {

    // Main Method = Entry point of Java Program
    public static void main(String[] args) {

        // 1. First Java Output
        System.out.println("Hello World - Day 3 Java");

        // Calling revision explanation methods
        explainProgramStructure();
        explainMainMethod();
        explainPrintStatement();
    }

    // 1️⃣ Java Program Structure (VERY IMPORTANT)
    public static void explainProgramStructure() {

        /*
        Basic Structure of every Java Program:

        public class ClassName {
            public static void main(String[] args) {
                // Code Execution Starts Here
            }
        }
        */

        System.out.println("\n✔ Java Program Structure Understood.");
    }

    // 2️⃣ main() Method Deep Explanation (INTERVIEW IMPORTANT)
    public static void explainMainMethod() {

        /*
        public  → Access modifier (accessible everywhere)
        static  → No object needed to call main()
        void    → Does not return any value
        main()  → Starting point of execution
        String[] args → Command line arguments

        Important:
        JVM always looks for main() method to start program.
        */

        System.out.println("✔ main() method = Starting point of Java program execution.");
    }

    // 3️⃣ System.out.println() Explanation
    public static void explainPrintStatement() {

        /*
        System  → Predefined Class (java.lang)
        out     → Output stream object
        println → Method (prints with new line)

        Flow:
        System → out → println() → Output on Console
        */

        System.out.println("✔ System.out.println() prints output to console.");
    }
}
