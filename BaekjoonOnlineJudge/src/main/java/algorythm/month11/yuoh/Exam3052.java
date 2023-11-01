package algorythm.month11.yuoh;

import java.util.Arrays;
import java.util.Scanner;

public class Exam3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers[] = new int[10];
        int idx = 0;

        while(idx < 10) {
            numbers[idx] = sc.nextInt() % 42;
            idx++;
        }
        System.out.println(Arrays.stream(numbers).distinct().toArray().length);
    }
}
