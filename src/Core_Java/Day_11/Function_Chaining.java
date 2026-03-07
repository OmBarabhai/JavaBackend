package Core_Java.Day_11;

/*
====================================================
FUNCTION CHAINING
====================================================

Function calling another function.

Execution Flow:
main → fun1 → fun2 → fun3
*/

public class Function_Chaining {

    public static void main(String[] args) {

        fun1();

        System.out.println("Bye");
    }

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

}