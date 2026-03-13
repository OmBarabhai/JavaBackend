package Core_Java.Day_14_ObjectsCallByValueVsRefShallowDeepCopy;
/*
============================================================================
CALL BY VALUE (PRIMITIVE TYPES)
============================================================================

Java ALWAYS uses Call By Value.

For primitive types Java passes a COPY of the value.

Example:

int x = 2;
int y = 5;

addTen(x,y);

Method:

static void addTen(int x,int y){
    x = x + 10;
    y = y + 10;
}

Result:
x = 2
y = 5

Values in main method DO NOT change.

----------------------------------------------------------------------------

MEMORY FLOW

Main Method
-----------
x = 2
y = 5

Method Call
-----------
x = 2 (copy)
y = 5 (copy)

Inside Method
-------------
x = 12
y = 15

But original variables remain unchanged.

----------------------------------------------------------------------------

INTERVIEW POINT

Primitive values are passed by VALUE.

Java copies the value of variable into method parameter.

============================================================================
*/
public class CallByValue {
    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        System.out.println(x+" , "+y);
        addTen(x,y);
        System.out.println(x+" , "+y);

    }
    static void addTen(int x,int y){
        x = x+10;
        y = y+10;
    }
}
