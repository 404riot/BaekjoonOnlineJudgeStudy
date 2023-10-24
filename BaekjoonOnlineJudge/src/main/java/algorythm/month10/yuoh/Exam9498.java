package algorythm.month10.yuoh;

import java.util.Scanner;

public class Exam9498 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char result =
                (a >= 90 && a <= 100) ? 'A' :
                (a >= 80 && a <= 89) ? 'B' :
                (a >= 70 && a <= 79) ? 'C' :
                (a >= 60 && a <= 69) ? 'D' :
                'F';
        System.out.println(result);
    }
}
