package com.lec.java.j05_04_증감연산자;

/* 증감 연산자(++, --) Increment / Decrement Operator
 *  	++변수: 변수의 값을 1 증가시켜서 저장
 *   	--변수: 변수의 값을 1 감소시켜서 저장
 *
 *   증감연산자: prefix(접두사), postfix(접미사)
 *   	접두사(prefix)인 경우에는, 증감(++, --)이 먼저 된 후 다른 연산자가 동작
 *   	접미사(postfix)인 경우에는, 다른 연산자 먼저 실행된 후 증감(++, --)가 동작
 */
public class Operator04Main {

    public static void main(String[] args) {
        System.out.println("연산자 4 - 증감 연산자(++, --) Increment / Decrement Operator");

        int num1 = 100;
        System.out.println("num1 = " + num1);

        ++num1;
        // num1 = num1 + 1; 와 동일한 결과
        // num1 += 1; 와 동일한 결과
        System.out.println("num1 = " + num1);

        num1++;
        System.out.println("num1 = " + num1);



        System.out.println("\n\n======================");
        System.out.println("증감연산자: prefix(접두사), postfix(접미사)");
        {
            int num3 = 100;
            int num4 = ++num3;

            System.out.println("num3 = " + num3);
            System.out.println("num4 = " + num4);
        }
        {
            int num3 = 100;
            int num4 = num3++;

            System.out.println("num3 = " + num3);
            System.out.println("num4 = " + num4);
        }

        // 실무에서는 '수식' 안에서 '증감연산자' 사용하지 마세요!
        {
            int num3 = 100;
            int num4 = num3;
            num3++;

            System.out.println("num3 = " + num3);
            System.out.println("num4 = " + num4);
        }

        System.out.println("\n프로그램 종료");
    } // end main

} // end class