package algorythm.month11.yuoh;

import java.util.Scanner;

public class Exam10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int result[] = new int[n];
        int idx = 0;

        while(idx < m) {
            int i = sc.nextInt() - 1;
            int j = sc.nextInt() - 1;

            int ni = result[i];
            int nj = result[j];

            result[i] = nj == 0 ? j + 1 : nj;
            result[j] = ni == 0 ? i + 1 : ni;
            idx++;
        }
        idx = 0;
        while(idx < n) {
            int r = result[idx] == 0 ? idx + 1 : result[idx];
            System.out.print(r+ " ");
            idx++;
        }
    }
}
