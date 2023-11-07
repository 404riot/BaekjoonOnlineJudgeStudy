package algorythm.month11.yuoh;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Exam10811 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int init[] = IntStream.rangeClosed(1, n).toArray();
        int idx = 0;

        while(idx < m) {
            int i = sc.nextInt() - 1;
            int j = sc.nextInt() - 1;
            int temp[] = Arrays.copyOfRange(init, i, j + 1);

            for(int item : temp) {
                init[j] = item;
                j--;
            }
            idx++;
        }

        idx = 0;
        while(idx < n) {
            System.out.print(init[idx] + " ");
            idx++;
        }
    }
}
