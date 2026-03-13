package Core_Java.Day_13_Constructor;
class Students{
    String name;///info /data /characteristics ---> Instance variable
    int age;
    int rollNum;
    String college;
    Students(){
      /// default Constructor
    }
    Students(int a, int rn, String clg){
        /// Parameterized Constructor
        age = a;
        rollNum = rn;
        college = clg;
    }
    Students(String name, int age, int rollNum, String college){
        /// Parameterized Constructor Using this Keyword
        /// constructor overloading
        this.name = name;
        this.age = age;
        this.rollNum = rollNum;
        this.college = college;
    }

    void markAttend(){///behaviour --> function ---> instance Var

        System.out.println("Attendance Mark for Student "+ name);
    }
}
public class ConstructorType {

    public static void main(String[] args) {
        Students s1 = new Students();
        System.out.println(s1.age);
        System.out.println(s1.name);
        System.out.println(s1.rollNum);
        System.out.println(s1.college);

        Students s2 = new Students(22,21,"hvpm");
        Students s3 = new Students("Om",21,21,"HVPM");

    }
}
