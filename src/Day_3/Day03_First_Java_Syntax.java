package Day_3;
/*
===========================================================
DAY 03 - First Java Program + Syntax (Revision File)
Author: Om
Focus: Program Structure, main(), System.out.println()
===========================================================

Goal:
- Understand Java Syntax
- Understand main() method
- Understand how Java program runs
*/

public class Day03_First_Java_Syntax {

    // Main Method = Entry point of Java Program
    public static void main(String[] args) {

        // 1. First Print Statement
        System.out.println("Hello World - Day 3 Java");

        // 2. Calling explanation methods (for revision)
        explainProgramStructure();
        explainMainMethod();
        explainPrintStatement();
    }

    // 1️⃣ Basic Java Program Structure
    public static void explainProgramStructure() {

        /*
        Structure of every Java Program:

        public class ClassName {
            public static void main(String[] args) {
                // Code Here
            }
        }
        */

        System.out.println("\nJava Program Structure Understood.");
    }

    // 2️⃣ main() Method Deep Breakdown (INTERVIEW IMPORTANT)
    public static void explainMainMethod() {

        /*
        public  → Access modifier (Accessible everywhere)
        static  → No object needed to run main()
        void    → Does not return anything
        main()  → Starting point of execution
        String[] args → Command line arguments
        */

        System.out.println("main() method = Starting point of program execution.");
    }

    // 3️⃣ System.out.println Explanation
    public static void explainPrintStatement() {

        /*
        System → Predefined Class
        out    → Output Stream Object
        println → Method to print with new line

        Flow:
        System → out → println() → Output on Console
        */

        System.out.println("System.out.println prints output to console.");
    }
}
