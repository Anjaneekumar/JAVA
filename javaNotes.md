# Java Notes

**Java is Types language.**

**Primtive Data Type**: byte, short , char , boolean ,int , logn , float , double,
**Non-primitive DT** : String , Array , Class , Object, Interface
##### Note : All Data type starts with small case letter . E.g : char , string , int

`Range : (in bytes)
byte : 1
short : 2
char : 2
boolean : 1
int : 4
long : 8
float : 4
double : 8`

## **Class:**
1 Every .java file is class in Java. 
2 Class name convention : MainMethod ✅ mainMethod❌ *(first letter always Capital)*

## -----------------Input in Java :-------------

Step : Make Object of Scanner class --> use obj of input

next():
nextLine():
nextInt():
nextByte():
nextFloat():
nextDouble():
nextBoolean():
nextShort():
nextLong():
## ----------Input Mismatch----------------

```java
float a;
sc.nextFloat();
float result = 3.14 *radius*radius ; // This will lead to error as float*double & savign into float var

Sol : float result= 3.14f *rad*rad; // Here we converted 3.14 as Float by suffix with "f"
```

## -----------Type conversion-------------------

HAPPEN WHEN:    1) type compatible ✔
                2) destination type > source type ✔
        E.g : byte --> short --> int --> float --> long --> double
int --> float ✅       int --> boolean ❌

## ---------- Operators -----------------------

1 Arithmatic Operator 
        - a) Binary : + - * / %    `  / --> quotient ,  % --> remender`
        - b) Unary: ++ ,  --

2 Realtional Operator 
3 Logical Operator : && , || , !
4 Bitwise Operator 
5 Assignment Operator : = , += , -= , *= , /=

a) Unary operator : 
- i) Pre (++a) : **value change --> use** .. E.g 
```java
int a=10; int b=++a; // o/p: a=11,b=11
```
- ii) Post (a++) : **use --> value change**
```java
int a=10; int b=a++; // o/p: a=11,b=10
```

5) Assignment Operator: 
```java
int A =10; 
A= A+5; // A=15
// Instead Use shorthand wich is FASTER📈 to execute.😃
A+= 5; // A=15
```
## --------- Conditional Statements -------------

1) if {} --> else                 
2) if {} --> if {} --> else          `2nd condition check --> EXTAR computational time`
3) if {} --> else if {} --> else     `1st TRUE --> SKIP ALL REST`