package algorythm.month11.yeji;

import java.util.Scanner;

public class Exam2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();

        if(m < 45){
            h--;
            m = 60 + (m-45);
            if(h<0){
                h = 23;
            }
        }else{
            m = m-45;
        }
        System.out.println(h+" "+m);
    }
}
/*
* https://st-lab.tistory.com/24
* */
