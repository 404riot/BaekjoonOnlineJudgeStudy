package algorythm.month10.yuoh;

import java.util.Scanner;

public class Exam9498 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char result = 'F';
        if(a >= 90 && a <= 100) {
            result = 'A';
        } else if(a >= 80 && a <= 89) {
            result = 'B';
        } else if(a >= 70 && a <= 79) {
            result = 'C';
        } else if(a >= 60 && a <= 69) {
            result = 'D';
        }
        System.out.println(result);
    }
}
