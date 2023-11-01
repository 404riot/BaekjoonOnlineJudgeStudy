package algorythm.month11.yuoh;

import java.util.Scanner;

public class Exam25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int idx = 4;
        while(idx <= n) {
            System.out.print("long ");
            idx += 4;
        }
        System.out.print("int");
    }
}
