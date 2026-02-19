package Day_3;

/*
===========================================================
DAY 03 - Variables Concept (Lecture Revision File)
Author: Om
Focus: What is Variable + Identifier + Literal
===========================================================
*/

public class Day03_Variables {

    public static void main(String[] args) {

        // Variable = Container that stores data in memory
        int firstNumber = 10;
        int secondNumber = 5;

        // Using variables in calculation
        int sum = firstNumber + secondNumber;

        System.out.println("First Number: " + firstNumber);
        System.out.println("Second Number: " + secondNumber);
        System.out.println("Sum: " + sum);

        explainVariableConcept();
        explainIdentifierAndLiteral();
    }

    // Explanation: Variable Concept (From Lecture)
    public static void explainVariableConcept() {

        /*
        Variable = Named memory location (Container)
        Example:
        int x = 10;

        x → Identifier (name)
        10 → Literal (stored value)
        int → Data Type
        */

        System.out.println("\n✔ Variable = Container that stores value in memory.");
    }

    // Interview Important Terms
    public static void explainIdentifierAndLiteral() {

        /*
        Identifier → Name of variable (e.g., firstNumber)
        Literal → Actual value stored (e.g., 10)
        Data Type → Type of data (int, float, char, etc.)
        */

        System.out.println("✔ Identifier = Variable Name | Literal = Stored Value.");
    }
}
