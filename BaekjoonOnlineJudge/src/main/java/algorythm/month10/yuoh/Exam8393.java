package algorythm.month10.yuoh;

import java.util.Scanner;

public class Exam8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 2 == 1) {
            int even = n - 1;
            int result = (even / 2) * (1 + even);
            System.out.println(result + n);
        } else {
            int result = (n / 2) * (1 + n);
            System.out.println(result);
        }
    }
}
