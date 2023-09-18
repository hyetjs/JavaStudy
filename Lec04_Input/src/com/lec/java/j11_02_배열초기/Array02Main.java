package com.lec.java.j11_02_배열초기;

public class Array02Main {
    public static void main(String[] args) {
        System.out.println("배열의 선언과 초기화");

        // [1]
        short[] korean; // 선언
        korean = new short[3]; // 생성 초기화
        korean[0] = 100;
        korean[1] = 90;
        korean[2] = 80;

        // [2]
        byte[] english = new byte[]{30,40,50,60};

        // [3]
        double[] point = {99.4, 88.2, 0.45, 1.9876};
        for (int i = 0; i < 4 ; i++) {
            System.out.println("point["+i+"]");
        }

        // point의 합
        double total = 0.0;
        for (int i = 0; i < 4; i++) {
            
        }

        // 배열의 길이를 자동으로 알 수 있는 방법
        // 배열이름.length
        // 예) korean.length, english.length, math.length

        String[] names = {"박채윤", "양효준", "나현민", "장윤근"};
        System.out.println("names.length= " + names.length);

        for (int i = 0; i < names.length; i++) {
            System.out.println("이름: " + names[i]);
        }



        System.out.println("\n프로그램 종료");
    } // end main()
} // end class Arrau02Main
