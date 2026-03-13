package Core_Java.Day_13_Constructor;

class StudentChain{
    String name;
    int age;
    int rollNo;
    String college;
    StudentChain(){}
    StudentChain(String name){
        this.name=name;
    }
    StudentChain(String name, int age){
        this.name =name;
        this.age = age;
    }
    StudentChain(String name, int age,int rollNo){
        this.name = name;
        this.age = age;
        this.rollNo =rollNo;
    }
    StudentChain(String name, int age,int rollNo, String college){
        this.name = name;
        this.age = age;
        this.rollNo =rollNo;
        this.college = college;
    }
}

class StudentChainCallInConst{
    String name;
    int age;
    int rollNo;
    String college;
    StudentChainCallInConst(){
//        this("Unknown",0,0,"Unknown");
///        System.out.println("I Am First Constructor"); --> error
        this("Unknown");
        System.out.println("I Am First Constructor");



    }
    StudentChainCallInConst(String name){
//        this(name,0,0,"Unknown");
///        System.out.println("I Am First Constructor"); --> error
        this(name,0);
        System.out.println("I Am Second Constructor");


    }
    StudentChainCallInConst(String name, int age){
//        this(name,22,0,"Unknown");
        this(name,22,0);///this is the first line in constructor it is not allow to write after anything else
        System.out.println("I Am Third Constructor");


    }
    StudentChainCallInConst(String name, int age,int rollNo){
        this(name,22,21,"Unknown");
        System.out.println("I Am Fourth Constructor");


    }
    StudentChainCallInConst(String name, int age,int rollNo, String college){
        /// this(name,22,21,"HVPM"); error
        this.name = name;
        this.age = age;
        this.rollNo =rollNo;
        this.college = college;
        System.out.println("I Am Fifth Constructor");

    }
}
public class ConstructorChaining {
    public static void main(String[] args) {
        StudentChain c1 = new StudentChain();
        StudentChain c2 = new StudentChain("Om");
        StudentChain c3 = new StudentChain("Om",22);
        StudentChain c4 = new StudentChain("Om",22,21);
        StudentChain c5 = new StudentChain("Om",22,21,"HVPM");


        StudentChainCallInConst s1 = new StudentChainCallInConst();
//        StudentChainCallInConst s2 = new StudentChainCallInConst("Om");
//        StudentChainCallInConst s3= new StudentChainCallInConst("Om",22);
//        StudentChainCallInConst s4 = new StudentChainCallInConst("Om",22,21);
//        StudentChainCallInConst s5 = new StudentChainCallInConst("Om",22,21,"HVPM");

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNo);
        System.out.println(s1.college);

//        System.out.println(s2.name);
//        System.out.println(s2.age);
//        System.out.println(s2.rollNo);
//        System.out.println(s2.college);
//
//        System.out.println(s3.name);
//        System.out.println(s3.age);
//        System.out.println(s3.rollNo);
//        System.out.println(s3.college);
//
//        System.out.println(s4.name);
//        System.out.println(s4.age);
//        System.out.println(s4.rollNo);
//        System.out.println(s4.college);
//
//        System.out.println(s5.name);
//        System.out.println(s5.age);
//        System.out.println(s5.rollNo);
//        System.out.println(s5.college);

    }
    /*
============================================================================
CONSTRUCTOR CHAINING
============================================================================

What is Constructor Chaining?

Constructor chaining means calling one constructor from another
constructor of the same class using the `this()` keyword.

Purpose:
Reuse constructor code and avoid repetition.

Example:

class Student {

    String name;
    int age;
    int rollNo;
    String college;

    Student() {
        this("Unknown");   // calls second constructor
    }

    Student(String name) {
        this(name, 0);     // calls third constructor
    }

    Student(String name, int age) {
        this(name, age, 0);  // calls fourth constructor
    }

    Student(String name, int age, int rollNo) {
        this(name, age, rollNo, "Unknown"); // calls last constructor
    }

    Student(String name, int age, int rollNo, String college) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        this.college = college;
    }
}

----------------------------------------------------------------------------

Important Rules of Constructor Chaining

1️⃣ this() must be the FIRST statement inside constructor

Correct:
Student() {
    this("Unknown");
}

Wrong:
Student() {
    System.out.println("Hello"); // ❌
    this("Unknown");
}

----------------------------------------------------------------------------

2️⃣ this() is used to call another constructor of the SAME class

----------------------------------------------------------------------------

3️⃣ Constructor chaining helps reduce duplicate code.

Instead of writing initialization logic multiple times,
we call another constructor.

----------------------------------------------------------------------------

Execution Flow Example

Student s1 = new Student();

Flow:

Student()
 ↓
Student(String name)
 ↓
Student(String name, int age)
 ↓
Student(String name, int age, int rollNo)
 ↓
Student(String name, int age, int rollNo, String college)

----------------------------------------------------------------------------

INTERVIEW KEY POINTS

• Constructor chaining uses `this()`
• Used to call another constructor in same class
• Helps avoid duplicate initialization code
• `this()` must always be the FIRST statement in constructor

============================================================================
*/
}
