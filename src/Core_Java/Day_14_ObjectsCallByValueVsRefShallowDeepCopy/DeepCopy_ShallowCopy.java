package Core_Java.Day_14_ObjectsCallByValueVsRefShallowDeepCopy;

public class DeepCopy_ShallowCopy {

    public static void main(String[] args) {

        Point p1 = new Point(4,5);

        // Deep Copy
        Point p2 = new Point(p1);

        // Shallow Copy
        Point p3 = p1;

        p3.x = 14;

        System.out.println("p1: "+p1.x+" , "+p1.y);
        System.out.println("p2: "+p2.x+" , "+p2.y);
        System.out.println("p3: "+p3.x+" , "+p3.y);

    }
}

/*
============================================================================
SHALLOW COPY vs DEEP COPY
Author: Om
============================================================================

Shallow Copy

Point p3 = p1;

Both variables refer to the SAME object.

Memory

p1 ----\
        ----> Object (x=4 , y=5)
p3 ----/

If we modify p3

p3.x = 14

Object becomes

x = 14
y = 5

So p1 also changes.

----------------------------------------------------------------------------

Deep Copy

Point p2 = new Point(p1);

Creates a NEW object and copies values.

Memory

p1 → Object1 (4,5)
p2 → Object2 (4,5)

Changing p2 does NOT affect p1.

----------------------------------------------------------------------------

INTERVIEW SUMMARY

Shallow Copy
-------------
Copy reference
Same object

Deep Copy
---------
Create new object
Copy values

============================================================================
*/

class Point {

    int x;
    int y;

    Point(int x,int y){
        this.x = x;
        this.y = y;
    }

    // Deep copy constructor
    Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }
}