package Core_Java.Day_14_ObjectsCallByValueVsRefShallowDeepCopy;
/*
============================================================================
OBJECT PARAMETER PASSING
============================================================================

Java is STILL Call By Value even for objects.

But the VALUE passed is the REFERENCE (address).

So both variables point to the SAME object.

----------------------------------------------------------------------------

Example:

Random r1 = new Random(4,6);

addTen(r1);

Method:

static void addTen(Random r){
    r.x = r.x + 10;
    r.y = r.y + 10;
}

Result:
14 , 16

----------------------------------------------------------------------------

MEMORY STRUCTURE

STACK
-----
r1 → 1000

METHOD STACK
------------
r → 1000 (copy of reference)

HEAP
----
Object
x = 4
y = 6

After modification

x = 14
y = 16

Since both references point to SAME object,
changes are visible outside method.

----------------------------------------------------------------------------

INTERVIEW POINT

Java does NOT support Call By Reference.

Java only supports Call By Value.

But for objects the VALUE passed is the reference.

============================================================================
*/
public class CallByRef {
    public static void main(String[] args) {
        Random r1 = new Random(4,6);
        Random r2 = new Random(r1);
        Random r3 = r1;

        r3.x= 14;
        System.out.println(r1.x+" , "+r1.y);
        addTen(r1);
        System.out.println(r1.x+" , "+r1.y);
        System.out.println(r1.x+" , "+r1.y);


    }
    static void addTen(Random r){
        r.x = r.x +10;
        r.y = r.y +10;
    }
//    static Random addTen(Random r){
//        r.x = r.x +10;
//        r.y = r.y +10;
//        return r;
//    }
}

class Random{
    int x;
    int y;

    Random(int x , int y){
        this.x = x;
        this.y = y;
    }
    Random(Random r){
        this.x = r.x;
        this.y = r.y;
    }
}
