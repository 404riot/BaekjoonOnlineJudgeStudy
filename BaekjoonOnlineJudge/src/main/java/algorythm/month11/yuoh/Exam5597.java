package algorythm.month11.yuoh;

import java.util.Arrays;
import java.util.Scanner;

public class Exam5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers[] = new int[28];
        int idx = 0;
        while(idx < 28) {
            numbers[idx] = sc.nextInt();
            idx++;
        }
        Arrays.sort(numbers);
        idx = 0;

        int low = 0;
        int high = 0;

        while (idx < 30) {
            if(numbers[idx] != idx + 1) {
                low = idx + 1;
                idx = 27;
                break;
            }
            idx ++;
        }

        while (idx > 0) {
            if(numbers[idx] != idx + 3) {
                high = idx + 3;
                break;
            }
            idx --;
        }
        System.out.println(low);
        System.out.println(high);
    }
}