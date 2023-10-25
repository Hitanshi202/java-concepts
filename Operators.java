package Learnoperators;

public class Operators
{
    public static void main(String[] args)
    {
//        operators
//        unary= ++,_-- increment decrement
//        arithemetic= +,-,*,/,%
//        assignment= =,+=,-=,*=,/=
//        comparison=<,>,<=,>=,==
//        logical =&&,||
//        bitwise=&,|
//        shift=<<.>>

//        arithmetic operation
        int num1=5;
        int num2=6;
        int sum = num1+num2;
        System.out.println(sum);  //11
        int difference = num2-num1;
        int product = num1*num2;
        int que = num1/num2;
        int divisor = num1%num2;
//        assignment operation
        System.out.println(sum); //11
        sum+=num1;  //16
        System.out.println(sum);

        difference-=num2;
        product*=num1;
        que/=num1;


//        comparison operation
        System.out.println(num1>num2);
        System.out.println(num1<num2);
        System.out.println(num1<=num2);
        System.out.println(num2>=num1);
        System.out.println(num1==num2);


//        logiccal operation

//        num1&&num2 == 5 - false
//        num1 || num2 - 5 - true

//        bitwise operation
        System.out.println(num1&num2);
        System.out.println(num1|num2);

//     shift operation
        System.out.println(num1<<num2);
//        1 2 4 8 16 32 64 128 256 512 1028
//        0 0 0 0 0 0 1 0 1
        System.out.println(num1>>num2);


//        unary operation
        System.out.println(++num1);
        System.out.println(--num2);

        System.out.println(num1++);
        System.out.println(num1--);
        System.out.println(++num2);
        
            }
        }



