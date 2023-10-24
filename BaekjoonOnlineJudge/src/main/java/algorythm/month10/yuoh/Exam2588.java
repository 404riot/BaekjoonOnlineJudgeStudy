package algorythm.month10.yuoh;

import java.util.Scanner;

public class Exam2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());

        int units = b % 10;
        int tens = ((b % 100) - units) / 10;
        int hundreds = (b - ((tens * 10) + units)) / 100;

        System.out.println(a * units);
        System.out.println(a * tens);
        System.out.println(a * hundreds);
        System.out.println(a * b);
    }
}
