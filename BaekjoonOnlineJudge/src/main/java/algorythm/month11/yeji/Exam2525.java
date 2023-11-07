package algorythm.month11.yeji;

import java.util.Scanner;

public class Exam2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int c = sc.nextInt();
        int min = 0;

        min = h * 60 + m;

        min = min + c;

        h = min / 60;
        m = min % 60;

        if(h>=24){
            h = (h-24);
        }


        System.out.println(h+" "+m);
    }
}
/*
* https://st-lab.tistory.com/292
* */