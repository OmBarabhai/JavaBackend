package Core_Java.Day_14_ObjectsCallByValueVsRefShallowDeepCopy;

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
