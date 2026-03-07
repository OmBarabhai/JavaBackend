package Core_Java.Day_11;

/*
=========================================================
FUNCTIONS IN JAVA
=========================================================
Topic

What is Function
Definition:
        A Function is a block of code that performs a specific task.

Why Function
    Why we use Functions?
    1. Code Reusability
    2. Code Organization
    3. Easy Debugging
    4. Avoid repeated code

Calling function
main(){
     // Calling functions
        greet();

        sayHello("Om");

        int num = getNumber();
        System.out.println(num);

        int result = multiply(2,4);
        System.out.println(result);
      }
Types of Functions:
+--------------------+----------------+
| Type               | Example        |
| ------------------ | -------------- |
| No Input No Output | greet()        |
| Input No Output    | sayHello(name) |
| No Input Output    | getNumber()    |
| Input Output       | multiply(a,b)  |
+--------------------+----------------+


*/

public class Functions_Basic {
//    main method
    public static void main(String[] args) {

        // Calling functions
        greet();

        sayHello("Om");

        int num = getNumber();
        System.out.println(num);

        int result = multiply(2,4);
        System.out.println(result);
    }


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


}