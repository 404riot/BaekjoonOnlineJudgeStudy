package algorythm.month10.yuoh;

import java.util.Scanner;

public class Exam10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arrA[] = new int[n];
        int arrB[] = new int[n];

        int idx = 0;
        while(idx < n) {
            arrA[idx] =  sc.nextInt();
            arrB[idx] =  sc.nextInt();
            idx++;
        }
        idx = 0;
        while (idx < n) {
            System.out.println(arrA[idx] + arrB[idx]);
            idx++;
        }
    }
}
