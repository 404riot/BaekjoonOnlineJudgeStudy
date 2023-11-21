package algorythm.month11.yuoh;

import java.util.Scanner;

public class Exam10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        int idx = 97;
        while(idx < 123) {
            System.out.print(word.indexOf(idx));
            idx++;
            System.out.print(" ");
        }
    }
}
