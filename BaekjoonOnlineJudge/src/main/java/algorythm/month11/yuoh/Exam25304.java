package algorythm.month11.yuoh;

import java.util.Scanner;

public class Exam25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.nextLine());
        int n = Integer.parseInt(sc.nextLine());

        int result[] = new int[n];

        int idx = 0;
        while(idx < n) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            result[idx] = a * b;
            idx++;
        }

        int sum = 0;
        for(int price : result) {
            sum += price;
        }

        System.out.println(sum == x ? "Yes" : "No");
    }
}
