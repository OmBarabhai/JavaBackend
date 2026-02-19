package Day_3;

public class Day03_Variables_DataTypes {
    public static void main(String[] args) {
        //Integers --> byte, short, int, long

        ///binnary(2) , octal(8),hexadecimal(16) ,number system
//        byte b = 5;//decimal
//        byte b = 0b101;
//        byte b = 07; //0-7 octal
//        byte b = 08; //0-7 error
//        byte b = 0X5;  //hexadecimal (0-15) -->0-9,A,B,C,D,E,F
        byte b = 0XA;  //hexadecimal (0-15) -->0-9,A,B,C,D,E,F

        short s = 10;
        int i = 4000;
//        long l = 100000;
        long l = 12_67_55_900;


        //real numbers
        float f = 10.45f;//single precision
//        double d = 232.344334;//double precision

        double d = 6.022e23;//6.022*10^23

        //Character

        char c = 'a';//'a'--> integer-->binary--store

        //boolean
        boolean bool = false;//false or true



        System.out.println("Integer Values--> "+ b+ ", "+s+", "+i+", "+l);
        System.out.println("Floating Values--> " +f+", "+d);
        System.out.println("Character Values--> " +c);
        System.out.println("boolean Values--> " +bool);




    }
}
