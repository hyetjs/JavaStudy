package com.lec.java.j302_variables;
/*
   변수명 등 사용자가 이름을 지어준것들 --> 식별자 (identifier) 라고 함.

   식별자 수정할때는 refactor 기능을 활용하자.
*/
public class Variable02Main {
    public static void main(String[] args) {
        int number;

        // 선언과 동시에 초기화
        int num1 = 10;

        // 여러 변수 동시 선언
        int a, b, c;

        int kor = 50, eng = 67, math = 34;
        System.out.println("국어점수: " + kor);
        System.out.println("영어점수: " + eng);
        System.out.println("수학점수: " + math);

        // 총점
        int total = kor + eng + math;
        System.out.println("총점: " + total);

        // 평균
        System.out.println("평균 : " + ((double)total / 3));
    }

}
