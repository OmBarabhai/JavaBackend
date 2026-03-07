package Core_Java.Day_11;

/*
=====================================================
VARIABLE SCOPE
=====================================================

1. Local Variable
2. Global Variable

+-----------------+---------------------+
| Type            | Scope               |
| --------------- | ------------------- |
| Local variable  | inside method/block |
| Global variable | inside class        |
+-----------------+---------------------+

*/

public class Function_Scope {

    static String name = "Aditya"; // Global variable

    public static void main(String[] args) {

        int x = 4; // local variable
        int y = 5;

        if(x==4){
            int j = 7;
            System.out.println(j);
        }

        System.out.println(x + " " + y);

        System.out.println(name);

        fun();
    }

    static void fun(){

        int x = 4;
        int y = 5;

        System.out.println(x + " " + y);

        System.out.println(name);
    }

}