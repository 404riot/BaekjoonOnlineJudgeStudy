package algorythm.month11.yuoh;

import java.util.Scanner;

public class Exam2675 {
    public static void main(String[] args) {
        // pause ======================================================================================================
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] cases = new int[n];
        String[] words = new String[n];
        String[] result = new String[n];
        int idx = 0;
        while(idx < n) {
            cases[idx] = sc.nextInt();
            words[idx] = sc.nextLine();
            idx++;
        }
        idx = 0;
        while(idx < n) {
            int wIdx = 0;
            while(wIdx < words[idx].length()) {
                int cIdx = 0;
                while(cIdx < cases[idx]) {
                    result[idx] += words[idx].charAt(idx);
                    cIdx++;
                }
                wIdx++;
            }
            System.out.println(result[idx]);
            idx++;
        }
    }
}
