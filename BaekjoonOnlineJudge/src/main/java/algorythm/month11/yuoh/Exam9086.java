package algorythm.month11.yuoh;

import java.util.Scanner;

public class Exam9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int idx = 0;

        String strArr[] = new String[n];

        while(idx < n) {
            strArr[idx] = sc.next();
            idx++;
        }

        idx = 0;
        while(idx < n) {
            System.out.println(strArr[idx].charAt(0) + "" + strArr[idx].charAt(strArr[idx].length() - 1));
            idx++;
        }
    }
}
