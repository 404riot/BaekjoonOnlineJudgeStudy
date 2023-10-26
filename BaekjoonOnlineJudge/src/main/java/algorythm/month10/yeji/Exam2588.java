package algorythm.month10.yeji;

import java.util.Scanner;

public class Exam2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = sc.next();
        int first = Integer.parseInt(b.substring(2));
        int second = Integer.parseInt(b.substring(1,2));
        int third = Integer.parseInt(b.substring(0,1));

        System.out.println(a * first);
        System.out.println(a * second);
        System.out.println(a * third);
        System.out.println(a*Integer.parseInt(b));
    }
}
