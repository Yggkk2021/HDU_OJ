package Test;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/2/5 11:50
 */
public class Main2020 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int n = scan.nextInt();
            if (n == 0) {
                break;
            }
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }

            int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                int max = 0;
                int index = 0;
                for (int j = 0; j < n; j++) {
                    int num = Math.abs(arr[j]);
                    if (num > max) {
                        max = num;
                        index = j;
                    }
                }
                res[i] = arr[index];
                arr[index] = 0;
            }

            StringBuilder sb = new StringBuilder();
            for (int i : res) {
                sb.append(i).append(" ");
            }
            String result = sb.substring(0, sb.length() - 1);
            System.out.println(result);
        }
    }
}
