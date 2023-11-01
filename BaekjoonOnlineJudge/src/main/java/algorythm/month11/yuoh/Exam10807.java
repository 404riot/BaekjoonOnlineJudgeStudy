package algorythm.month11.yuoh;

import java.util.Scanner;

public class Exam10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numbers[] = new int[n];
        int idx = 0;
        while(idx < n) {
            numbers[idx] = sc.nextInt();
            idx++;
        }
        int v = sc.nextInt();
        int count = 0;
        for(int number : numbers) {
            count = number == v ? count + 1 : count + 0;
        }
        System.out.print(count);
    }
}
