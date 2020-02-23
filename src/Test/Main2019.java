package Test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author yangshunfan 2020/2/4 20:40
 */
public class Main2019 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            if (n == 0 && m == 0) {
                break;
            }
            int[] arr = new int[n + 1];
            for (int i = 0; i < n; i++) {
                int num = scan.nextInt();
                arr[i] = num;
            }
            arr[n] = m;
            Arrays.sort(arr);
            StringBuilder sb = new StringBuilder();
            for (int anArr : arr) {
                sb.append(anArr).append(" ");
            }
            String res = sb.substring(0, sb.length() - 1);
            System.out.println(res);
        }
    }
}
