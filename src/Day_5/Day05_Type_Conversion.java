package Day_5;

/*
===============================================================================
DAY 05 - TYPE CONVERSION
Author: Om
===============================================================================

CORE IDEA:
Type Conversion = Converting one data type into another.

TYPES OF CONVERSION:
1) Implicit Conversion  (Widening)
2) Explicit Conversion  (Narrowing)
3) Truncating Conversion
4) Type Promotion in Expressions
===============================================================================


1) IMPLICIT CONVERSION (WIDENING)
-------------------------------------------------------------------------------
Smaller type → Larger type
No data loss → Automatic

byte (8 bit) → short (16) → int (32) → long (64) → float → double
char → int

Example:
byte b = 20;
int i = b;   // Allowed (8 bit → 32 bit)

Reason:
Small container fits inside bigger container.
Safe conversion.
-------------------------------------------------------------------------------


2) EXPLICIT CONVERSION (NARROWING)
-------------------------------------------------------------------------------
Larger type → Smaller type
Possible data loss → Casting Required

Syntax:
(type) variableName

Example:
int i = 300;
byte b = (byte) i;

Why?
int  = 32 bits
byte = 8 bits
Overflow may happen.
-------------------------------------------------------------------------------


IMPORTANT RULE (VERY IMPORTANT FOR INTERVIEW)

When converting to byte:

Result = value % 256

Why 256?
Because byte = 8 bits
2^8 = 256 total values
-------------------------------------------------------------------------------

CALCULATION EXAMPLE: 300 → byte
-------------------------------------------------------------------------------

STEP 1: Understand Byte Range
--------------------------------
byte range = -128 to 127
Total values = 256

STEP 2: Perform Modulo

| Step            | Calculation        | Result |
|-----------------|-------------------|--------|
| 300 ÷ 256       | 256 × 1 = 256     |        |
| Remainder       | 300 - 256         | 44     |

So:
300 % 256 = 44

STEP 3: Binary Visualization

300 in 32-bit:
00000000 00000000 00000001 00101100

Take last 8 bits (byte stores only 8 bits):
00101100

Binary to Decimal:

| 128 | 64 | 32 | 16 | 8 | 4 | 2 | 1 |
|-----|----|----|----|---|---|---|---|
|  0  |  0 |  1 |  0 | 1 | 1 | 0 | 0 |

= 32 + 8 + 4
= 44

Final:
byte b = (byte)300;  // 44
-------------------------------------------------------------------------------


OVERFLOW EXAMPLE (VERY IMPORTANT)
-------------------------------------------------------------------------------

byte x = 127;
x = (byte)(x + 1);

127 + 1 = 128

Since 128 > 127 (max byte)
Apply rule:

128 - 256 = -128

Binary view:
127 = 01111111
+1
= 10000000  → -128 (2’s complement)

So output:
-128
-------------------------------------------------------------------------------


3) TRUNCATING CONVERSION
-------------------------------------------------------------------------------
float/double → int

Decimal part is REMOVED (not rounded)

Example:
float f = 15.678f;
int i = (int) f;

Result:
i = 15
-------------------------------------------------------------------------------


4) BOOLEAN RULE
-------------------------------------------------------------------------------
Boolean cannot convert to any other type.

boolean b = true;
int i = (int) b;   // ❌ Not allowed
-------------------------------------------------------------------------------


5) TYPE PROMOTION (EXPRESSION RULE - VERY IMPORTANT)
-------------------------------------------------------------------------------
During arithmetic operations:

byte, short, char → automatically promoted to int

Example:
byte b = 50;
b = (byte)(b * 2);

Why casting needed?
Because:
b * 2 → result becomes int
Assigning int → byte requires casting
-------------------------------------------------------------------------------


PROMOTION ORDER RULE
-------------------------------------------------------------------------------
If one operand is:

double → result is double
float  → result is float
long   → result is long
else   → result is int

Largest type dominates.
-------------------------------------------------------------------------------


INTERVIEW GOLD LINES
-------------------------------------------------------------------------------
1) Widening is automatic because no data loss.
2) Narrowing requires casting because overflow may happen.
3) byte range = -128 to 127.
4) Result of arithmetic on byte/short/char becomes int.
5) For byte casting: value % 256 rule.
6) Overflow in byte behaves like circular rotation.
-------------------------------------------------------------------------------
===============================================================================
*/

public class Day05_Type_Conversion {

    public static void main(String[] args) {

        // Widening
        byte small = 20;
        int big = small;
        System.out.println("Widening (byte → int): " + big);

        // Narrowing
        int number = 300;
        byte converted = (byte) number;
        System.out.println("Narrowing (300 → byte): " + converted);

        // Truncation
        float value = 15.678f;
        int truncated = (int) value;
        System.out.println("Truncation (15.678 → int): " + truncated);

        // Promotion
        byte b = 50;
        b = (byte) (b * 2);
        System.out.println("Promotion (byte * 2): " + b);

        // Overflow
        byte x = 127;
        x = (byte)(x + 1);
        System.out.println("Overflow (127 + 1): " + x);
    }
}