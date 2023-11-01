package algorythm.month11.yuoh;

import java.util.Scanner;

public class Exam10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int result[] = new int[n];
        int idx = 0;

        while(idx < m) {
            int i = sc.nextInt() - 1;
            int j = sc.nextInt() - 1;
            int k = sc.nextInt();

            while(i < j) {
                result[i] = k;
                i++;
            }
            result[j] = k;
            idx++;
        }
        idx = 0;
        while(idx < n) {
            System.out.print(result[idx]+ " ");
            idx++;
        }
    }
}
