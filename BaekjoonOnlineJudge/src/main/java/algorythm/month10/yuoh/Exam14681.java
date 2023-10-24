package algorythm.month10.yuoh;

import java.util.Scanner;

public class Exam14681 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());

        int signA = Integer.signum(a);
        int signB = Integer.signum(b);

        String result =
                signA == 1 && signB == 1 ? "1" :
                signA == -1 && signB == 1 ? "2" :
                signA == -1 && signB == -1 ? "3" :
                signA == 1 && signB == -1 ? "4" :
                "";
        System.out.println(result);
    }
}
