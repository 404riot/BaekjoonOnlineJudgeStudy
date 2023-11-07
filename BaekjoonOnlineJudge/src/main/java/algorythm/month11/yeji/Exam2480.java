package algorythm.month11.yeji;

import java.util.Scanner;

public class Exam2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int point = 0;

        if((a==b)&&(b==c)){
            System.out.println(a*1000+10000);
        }else if((a==b)||(a==c)){
            System.out.println(a*100+1000);
        }else if(b==c){
            System.out.println(b*100+1000);
        }else{
            System.out.println(Math.max(Math.max(a,b),c)*100);
        }
    }
}
/*
* https://imototot.tistory.com/342
* */