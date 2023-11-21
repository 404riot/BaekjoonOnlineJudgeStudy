package algorythm.month11.yuoh;

import java.util.Scanner;

public class Exam11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String numbers = sc.next();

        int idx = 0;
        int result = 0;
        while(idx < n) {
            result += Integer.parseInt(String.valueOf(numbers.charAt(idx)));
            idx++;
        }
        System.out.println(result);
    }
}
