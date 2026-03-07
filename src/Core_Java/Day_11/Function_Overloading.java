package Core_Java.Day_11;

/*
=====================================================
FUNCTION OVERLOADING
=====================================================

Definition:
Multiple functions with same name but
different parameters.

Types:
1. Different number of parameters
2. Different type of parameters
3. Different order of parameters


Function Overloading
When multiple methods have the same name but different parameter lists.
It is called Compile Time Polymorphism.

*/

public class Function_Overloading {

    public static void main(String[] args) {

        int x = sum(2,3);
        System.out.println(x);

        int y = sum(2,3,4);
        System.out.println(y);

        greet("Aditya",28);
        greet(28,"Rohit");

    }

    // two parameters
    static int sum(int a,int b){
        return a + b;
    }

    // three parameters
    static int sum(int a,int b,int c){
        return a + b + c;
    }

    // parameter order changed
    static void greet(String name,int age){
        System.out.println("Hi "+name+" Age "+age);
    }

    static void greet(int age,String name){
        System.out.println("Hi "+name+" Age "+age);
    }

}