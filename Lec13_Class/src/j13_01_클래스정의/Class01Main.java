package j13_01_클래스정의;

public class Class01Main {
    public static void main(String[] args) {
        System.out.println("클래스 생성 & 사용");

        MyTV tv1 = new MyTV();

        System.out.println(tv1);

//        tv1.volume = 32;
//        tv1.channel = 14;
//        tv1.isPowerOn = true;


        tv1.displayStatus();

        tv1.powerOnOff();
        tv1.volumeUp();
        tv1.volumeUp();
        tv1.channelUp();

        tv1.displayStatus();

        System.out.println();
        MyTV tv2 = new MyTV();

        tv2.powerOnOff();
        tv2.volumeUp();
        tv2.volumeUp();
        tv2.channelUp();

        tv2.displayStatus();

        System.out.println("tv1: " + tv1);
        System.out.println("tv2: " + tv2);

    } // end main
} // end class
