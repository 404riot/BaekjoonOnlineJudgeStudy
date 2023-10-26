package algorythm.month10.yuoh;

import java.util.Scanner;
import java.util.Arrays;

class Exam2480 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int d1 = scan.nextInt();
        int d2 = scan.nextInt();
        int d3 = scan.nextInt();

        if((d1 == d2) && (d1 == d3) && (d2 == d3)) {
            int result = 10000 + d1 * 1000;
            System.out.println(result);
        }else if(d1 == d2 || d1 == d3 || d2 == d3) {
            int result =
                    d1 == d2 ? 1000 + d1 * 100 :
                            d1 == d3 ? 1000 + d2 * 100 :
                                    d2 == d3 ? 1000 + d2 * 100 :
                                            0;
            System.out.println(result);
        }


        else if((d1 != d2 && d1 != d3 && d2 != d3)) {
            int[] arr = {d1, d2, d3};
            Arrays.sort(arr);
            int result = arr[2] * 100;
            System.out.println(result);
        }
    }
}
