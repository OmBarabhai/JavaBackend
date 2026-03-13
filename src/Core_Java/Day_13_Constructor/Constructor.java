package Core_Java.Day_13_Constructor;

public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name  = "Om";
        s1.college =  "HVPM";
        s1.rollNum = 21;
        s1.age = 22;

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNum);
        System.out.println(s1.college);

//        int x; // local variable --> No Default value
//        System.out.println(x);
    }
}
/*
Integer --> 0
Floating --> 0.0
Boolean --> false
String --> null
*/
class Student{
    String name;//info /data /characteristics ---> Instance variable
    int age;
    int rollNum;
    String college;

    void markAttend(){//behaviour --> function ---> instance Var
        System.out.println("Attendance Mark for Student "+ name);
    }
}
/*
CONSTRUCTOR --> Rules
1. Same name as class
2. No return type not even void
3. Automatically called during object creation
4. Used to initialize object
5. It can also be overloaded
 */
