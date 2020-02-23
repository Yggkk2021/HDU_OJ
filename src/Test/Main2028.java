package Test;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/2/6 21:01
 */
public class Main2028 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int n = scan.nextInt();
            int[] arr = new int[n];
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                int num = scan.nextInt();
                arr[i] = num;
                if (num > max) {
                    max = num;
                }
            }
            int yin = 1;
            int res;
            while (true) {
                int bei = max * yin;
                boolean getRessult = true;
                for (int anArr : arr) {
                    if (bei % anArr != 0) {
                        getRessult = false;
                        break;
                    }
                }
                if (getRessult) {
                    res = bei;
                    break;
                } else {
                    yin++;
                }
            }
            System.out.println(res);
        }
    }
}
